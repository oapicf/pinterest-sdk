package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("NotificationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NotificationResponse   {
  private Boolean success;
  private Integer receivedAt;
  private String errorMsg;

  public NotificationResponse() {
  }

  /**
   * Returns true if the notification accepted.
   **/
  public NotificationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Returns true if the notification accepted.")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  @JsonProperty("success")
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * Received time. Unix timestamp in seconds.
   **/
  public NotificationResponse receivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  
  @ApiModelProperty(example = "1677003860", value = "Received time. Unix timestamp in seconds.")
  @JsonProperty("received_at")
  public Integer getReceivedAt() {
    return receivedAt;
  }

  @JsonProperty("received_at")
  public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  /**
   * error message when success is false
   **/
  public NotificationResponse errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  
  @ApiModelProperty(value = "error message when success is false")
  @JsonProperty("error_msg")
  public String getErrorMsg() {
    return errorMsg;
  }

  @JsonProperty("error_msg")
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationResponse notificationResponse = (NotificationResponse) o;
    return Objects.equals(this.success, notificationResponse.success) &&
        Objects.equals(this.receivedAt, notificationResponse.receivedAt) &&
        Objects.equals(this.errorMsg, notificationResponse.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, receivedAt, errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

