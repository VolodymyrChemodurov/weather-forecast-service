package com.training.weather.ingestor.infrastructure.model.owm;

import java.io.Serializable;

public class Snow implements Serializable {

  private double volume;

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    return "Snow{"
            + "volume=" + volume
            + '}';
  }
}
