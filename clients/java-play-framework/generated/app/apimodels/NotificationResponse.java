package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NotificationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationResponse   {
  @JsonProperty("error_msg")
  
  private String errorMsg;

  @JsonProperty("received_at")
  
  private Integer receivedAt;

  @JsonProperty("success")
  
  private Boolean success;

  public NotificationResponse errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * error message when success is false
   * @return errorMsg
  **/
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public NotificationResponse receivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * Received time. Unix timestamp in seconds.
   * @return receivedAt
  **/
  public Integer getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  public NotificationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Returns true if the notification accepted.
   * @return success
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

