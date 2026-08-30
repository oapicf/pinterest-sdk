package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequestStatus;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Conversion deletion request
 */

@Schema(name = "ConversionDeletionRequest", description = "Conversion deletion request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate createdTime;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> processedTime = JsonNullable.<LocalDate>undefined();

  private String requestId;

  private ConversionDeletionRequestStatus status;

  public ConversionDeletionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionDeletionRequest(LocalDate createdTime, String requestId, ConversionDeletionRequestStatus status) {
    this.createdTime = createdTime;
    this.requestId = requestId;
    this.status = status;
  }

  public ConversionDeletionRequest createdTime(LocalDate createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Timestamp when the conversion deletion request was succesfully created.
   * @return createdTime
   */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Timestamp when the conversion deletion request was succesfully created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_time")
  public LocalDate getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(LocalDate createdTime) {
    this.createdTime = createdTime;
  }

  public ConversionDeletionRequest processedTime(LocalDate processedTime) {
    this.processedTime = JsonNullable.of(processedTime);
    return this;
  }

  /**
   * Timestamp when the conversion deletion request was processed.
   * @return processedTime
   */
  @Valid 
  @Schema(name = "processed_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Timestamp when the conversion deletion request was processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processed_time")
  public JsonNullable<LocalDate> getProcessedTime() {
    return processedTime;
  }

  public void setProcessedTime(JsonNullable<LocalDate> processedTime) {
    this.processedTime = processedTime;
  }

  public ConversionDeletionRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Unique identifier of the conversion deletion request
   * @return requestId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "request_id", description = "Unique identifier of the conversion deletion request", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  @JsonProperty("request_id")
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ConversionDeletionRequest status(ConversionDeletionRequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public ConversionDeletionRequestStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ConversionDeletionRequestStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequest conversionDeletionRequest = (ConversionDeletionRequest) o;
    return Objects.equals(this.createdTime, conversionDeletionRequest.createdTime) &&
        equalsNullable(this.processedTime, conversionDeletionRequest.processedTime) &&
        Objects.equals(this.requestId, conversionDeletionRequest.requestId) &&
        Objects.equals(this.status, conversionDeletionRequest.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, hashCodeNullable(processedTime), requestId, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequest {\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

