package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NotificationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String errorMsg;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer receivedAt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean success;

  public NotificationResponse errorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * error message when success is false
   * @return errorMsg
   */
  
  @Schema(name = "error_msg", description = "error message when success is false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_msg")
  public @Nullable String getErrorMsg() {
    return errorMsg;
  }

  @JsonProperty("error_msg")
  public void setErrorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public NotificationResponse receivedAt(@Nullable Integer receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

  /**
   * Received time. Unix timestamp in seconds.
   * @return receivedAt
   */
  
  @Schema(name = "received_at", description = "Received time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("received_at")
  public @Nullable Integer getReceivedAt() {
    return receivedAt;
  }

  @JsonProperty("received_at")
  public void setReceivedAt(@Nullable Integer receivedAt) {
    this.receivedAt = receivedAt;
  }

  public NotificationResponse success(@Nullable Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Returns true if the notification accepted.
   * @return success
   */
  
  @Schema(name = "success", description = "Returns true if the notification accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public @Nullable Boolean getSuccess() {
    return success;
  }

  @JsonProperty("success")
  public void setSuccess(@Nullable Boolean success) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

