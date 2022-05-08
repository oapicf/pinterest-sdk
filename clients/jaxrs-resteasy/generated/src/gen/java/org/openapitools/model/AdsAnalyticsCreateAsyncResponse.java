package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class AdsAnalyticsCreateAsyncResponse   {
  
  private String reportStatus;
  private String token;
  private String message;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report_status")
  public String getReportStatus() {
    return reportStatus;
  }
  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

