package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationResponse   {
  
  private String errorMsg;
  private Integer receivedAt;
  private Boolean success;

  public NotificationResponse () {

  }

  public NotificationResponse (String errorMsg, Integer receivedAt, Boolean success) {
    this.errorMsg = errorMsg;
    this.receivedAt = receivedAt;
    this.success = success;
  }

    
  @JsonProperty("error_msg")
  public String getErrorMsg() {
    return errorMsg;
  }
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

    
  @JsonProperty("received_at")
  public Integer getReceivedAt() {
    return receivedAt;
  }
  public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

    
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
