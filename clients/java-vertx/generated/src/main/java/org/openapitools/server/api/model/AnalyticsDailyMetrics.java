package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.api.model.DataStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyticsDailyMetrics   {
  
  private DataStatus dataStatus;
  private String date;
  private Map<String, BigDecimal> metrics = new HashMap<>();

  public AnalyticsDailyMetrics () {

  }

  public AnalyticsDailyMetrics (DataStatus dataStatus, String date, Map<String, BigDecimal> metrics) {
    this.dataStatus = dataStatus;
    this.date = date;
    this.metrics = metrics;
  }

    
  @JsonProperty("data_status")
  public DataStatus getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(DataStatus dataStatus) {
    this.dataStatus = dataStatus;
  }

    
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

    
  @JsonProperty("metrics")
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }
  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsDailyMetrics analyticsDailyMetrics = (AnalyticsDailyMetrics) o;
    return Objects.equals(dataStatus, analyticsDailyMetrics.dataStatus) &&
        Objects.equals(date, analyticsDailyMetrics.date) &&
        Objects.equals(metrics, analyticsDailyMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStatus, date, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsDailyMetrics {\n");
    
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
