package com.discovery.theater.processor;

import javax.activation.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.discovery.theater.batch.Theater;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
	 @Autowired
	  public JobBuilderFactory jobBuilderFactory;

	  @Autowired
	  public StepBuilderFactory stepBuilderFactory;
	  
	  
	  @Bean
	  public FlatFileItemReader<Theater> reader() {
	    return new FlatFileItemReaderBuilder<Theater>()
	      .name("theaterItemReader")
	      .resource(new ClassPathResource("sample-data.csv"))
	      .delimited()
	      .names(new String[]{"theaterName", "city", "totalScreens", "isMaintainance"})
	      .fieldSetMapper(new BeanWrapperFieldSetMapper<Theater>() {{
	        setTargetType(Theater.class);
	      }})
	      .build();
	  }

	  @Bean
	  public TheaterItemProcessor processor() {
	    return new TheaterItemProcessor();
	  }

	  @Bean
	  public JdbcBatchItemWriter<Theater> writer(DataSource dataSource) {
	    return new JdbcBatchItemWriterBuilder<Theater>()
	      .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
	      .sql("INSERT INTO Theater (theater_name, city, total_screens, is_maintenance) VALUES (:theaterName, :city, :totalScreens, :isMaintainance)")
	      .dataSource((javax.sql.DataSource) dataSource)
	      .build();
	  }
	  
	  @Bean
	  public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
	    return jobBuilderFactory.get("importUserJob")
	      .incrementer(new RunIdIncrementer())
	      .listener(listener)
	      .flow(step1)
	      .end()
	      .build();
	  }

	  @Bean
	  public Step step1(JdbcBatchItemWriter<Theater> writer) {
	    return stepBuilderFactory.get("step1")
	      .<Theater, Theater> chunk(10)
	      .reader(reader())
	      .processor(processor())
	      .writer(writer)
	      .build();
	  }
}
