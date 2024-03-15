package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BulkReportingJobStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsCreateAsyncResponse   {
  
  private BulkReportingJobStatus reportStatus;
  private String token;
  private String message;

  public AdsAnalyticsCreateAsyncResponse () {

  }

  public AdsAnalyticsCreateAsyncResponse (BulkReportingJobStatus reportStatus, String token, String message) {
    this.reportStatus = reportStatus;
    this.token = token;
    this.message = message;
  }

    
  @JsonProperty("report_status")
  public BulkReportingJobStatus getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(BulkReportingJobStatus reportStatus) {
    this.reportStatus = reportStatus;
  }

    
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse = (AdsAnalyticsCreateAsyncResponse) o;
    return Objects.equals(reportStatus, adsAnalyticsCreateAsyncResponse.reportStatus) &&
        Objects.equals(token, adsAnalyticsCreateAsyncResponse.token) &&
        Objects.equals(message, adsAnalyticsCreateAsyncResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, token, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncResponse {\n");
    
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
