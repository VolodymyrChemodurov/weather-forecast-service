package com.training.weather.ingestor.infrastructure.job;

import com.training.weather.ingestor.infrastructure.service.OpenWeatherCachingService;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OpenWeatherCachingJob {
  private static final Logger LOG = Logger.getLogger(OpenWeatherCachingJob.class);

  private final OpenWeatherCachingService openWeatherCachingService;

  public OpenWeatherCachingJob(OpenWeatherCachingService openWeatherCachingService) {
    this.openWeatherCachingService = openWeatherCachingService;
  }

  /**
   * Scheduled caching job.
   */
  @Scheduled(cron = "0 * * * * *")
  public void cacheWeatherForecast() {
    openWeatherCachingService.cacheWeatherForecasts();
    LOG.info("Job finished.");
  }
}
