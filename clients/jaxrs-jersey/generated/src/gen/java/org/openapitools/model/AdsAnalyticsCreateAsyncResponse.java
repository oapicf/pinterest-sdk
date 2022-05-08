/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AdsAnalyticsCreateAsyncResponse
 */
@JsonPropertyOrder({
  AdsAnalyticsCreateAsyncResponse.JSON_PROPERTY_REPORT_STATUS,
  AdsAnalyticsCreateAsyncResponse.JSON_PROPERTY_TOKEN,
  AdsAnalyticsCreateAsyncResponse.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-07T06:42:01.683468Z[Etc/UTC]")
public class AdsAnalyticsCreateAsyncResponse   {
  public static final String JSON_PROPERTY_REPORT_STATUS = "report_status";
  @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
  private String reportStatus;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @JsonProperty(JSON_PROPERTY_TOKEN)
  private String token;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  private String message;

  public AdsAnalyticsCreateAsyncResponse reportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Get reportStatus
   * @return reportStatus
   **/
  @JsonProperty(value = "report_status")
  @ApiModelProperty(value = "")
  
  public String getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  public AdsAnalyticsCreateAsyncResponse token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   **/
  @JsonProperty(value = "token")
  @ApiModelProperty(value = "")
  
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AdsAnalyticsCreateAsyncResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @JsonProperty(value = "message")
  @ApiModelProperty(value = "")
  
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
    return Objects.equals(this.reportStatus, adsAnalyticsCreateAsyncResponse.reportStatus) &&
        Objects.equals(this.token, adsAnalyticsCreateAsyncResponse.token) &&
        Objects.equals(this.message, adsAnalyticsCreateAsyncResponse.message);
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
