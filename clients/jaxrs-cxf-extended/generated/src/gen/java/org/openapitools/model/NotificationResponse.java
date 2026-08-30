package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationResponse  {
  
 /**
  * error message when success is false
  */
  @ApiModelProperty(value = "error message when success is false")
  private String errorMsg;

 /**
  * Received time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Received time. Unix timestamp in seconds.")
  private Integer receivedAt;

 /**
  * Returns true if the notification accepted.
  */
  @ApiModelProperty(value = "Returns true if the notification accepted.")
  private Boolean success;
 /**
  * error message when success is false
  * @return errorMsg
  */
  @JsonProperty("error_msg")
  public String getErrorMsg() {
    return errorMsg;
  }

  /**
   * Sets the <code>errorMsg</code> property.
   */
 public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * Sets the <code>errorMsg</code> property.
   */
  public NotificationResponse errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

 /**
  * Received time. Unix timestamp in seconds.
  * @return receivedAt
  */
  @JsonProperty("received_at")
  public Integer getReceivedAt() {
    return receivedAt;
  }

  /**
   * Sets the <code>receivedAt</code> property.
   */
 public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  /**
   * Sets the <code>receivedAt</code> property.
   */
  public NotificationResponse receivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

 /**
  * Returns true if the notification accepted.
  * @return success
  */
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  /**
   * Sets the <code>success</code> property.
   */
 public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * Sets the <code>success</code> property.
   */
  public NotificationResponse success(Boolean success) {
    this.success = success;
    return this;
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
    return Objects.equals(this.errorMsg, notificationResponse.errorMsg) &&
        Objects.equals(this.receivedAt, notificationResponse.receivedAt) &&
        Objects.equals(this.success, notificationResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMsg, receivedAt, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResponse {\n");
    
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

