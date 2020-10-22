package com.sandbox.job;

import java.util.Date;
import java.util.Objects;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@EnableBatchProcessing
@Component
public class JobLauncherMain {

	@Autowired
	private ApplicationContext context;
	@Autowired
	JobLauncher jobLauncher;

	public void execute(String jobName, JobParameters jps) throws JobExecutionAlreadyRunningException,
			JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		Job job = (Job) context.getBean(jobName);
		if (Objects.nonNull(jobName)) {
			JobParameters defautJps = Objects.nonNull(jps) ? jps
					: new JobParametersBuilder().addDate("TIME", new Date()).toJobParameters();
			jobLauncher.run(job, defautJps);
		}
	}

}
