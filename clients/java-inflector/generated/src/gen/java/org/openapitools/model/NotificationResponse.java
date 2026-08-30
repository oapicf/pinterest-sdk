package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationResponse   {
  @JsonProperty("error_msg")
  private String errorMsg;

  @JsonProperty("received_at")
  private Integer receivedAt;

  @JsonProperty("success")
  private Boolean success;

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
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * Received time. Unix timestamp in seconds.
   **/
  public NotificationResponse receivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Received time. Unix timestamp in seconds.")
  @JsonProperty("received_at")
  public Integer getReceivedAt() {
    return receivedAt;
  }
  public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  /**
   * Returns true if the notification accepted.
   **/
  public NotificationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(value = "Returns true if the notification accepted.")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
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
    return Objects.equals(errorMsg, notificationResponse.errorMsg) &&
        Objects.equals(receivedAt, notificationResponse.receivedAt) &&
        Objects.equals(success, notificationResponse.success);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

