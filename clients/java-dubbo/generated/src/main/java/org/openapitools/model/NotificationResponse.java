package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class NotificationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * error message when success is false
   */
  @JsonProperty("error_msg")
  private String errorMsg;

  /**
   * Received time. Unix timestamp in seconds.
   */
  @JsonProperty("received_at")
  private Integer receivedAt;

  /**
   * Returns true if the notification accepted.
   */
  @JsonProperty("success")
  private Boolean success;

  /**
   * error message when success is false
   * @return errorMsg
   */
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * Received time. Unix timestamp in seconds.
   * @return receivedAt
   */
  public Integer getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  /**
   * Returns true if the notification accepted.
   * @return success
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
