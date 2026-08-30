package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BulkRequestStatus;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Bulk request result data.
 */

@Schema(name = "BulkJobData", description = "Bulk request result data.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkJobData {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String resultUrl;

  private BulkRequestStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer workloadId;

  public BulkJobData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkJobData(BulkRequestStatus status) {
    this.status = status;
  }

  public BulkJobData resultUrl(@Nullable String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

  /**
   * Presigned s3 file url for the bulk request result.
   * @return resultUrl
   */
  
  @Schema(name = "result_url", description = "Presigned s3 file url for the bulk request result.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result_url")
  public @Nullable String getResultUrl() {
    return resultUrl;
  }

  @JsonProperty("result_url")
  public void setResultUrl(@Nullable String resultUrl) {
    this.resultUrl = resultUrl;
  }

  public BulkJobData status(BulkRequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public BulkRequestStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

  public BulkJobData workloadId(@Nullable Integer workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * Bulk Workload Id.
   * @return workloadId
   */
  
  @Schema(name = "workload_id", description = "Bulk Workload Id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workload_id")
  public @Nullable Integer getWorkloadId() {
    return workloadId;
  }

  @JsonProperty("workload_id")
  public void setWorkloadId(@Nullable Integer workloadId) {
    this.workloadId = workloadId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkJobData bulkJobData = (BulkJobData) o;
    return Objects.equals(this.resultUrl, bulkJobData.resultUrl) &&
        Objects.equals(this.status, bulkJobData.status) &&
        Objects.equals(this.workloadId, bulkJobData.workloadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultUrl, status, workloadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkJobData {\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
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

