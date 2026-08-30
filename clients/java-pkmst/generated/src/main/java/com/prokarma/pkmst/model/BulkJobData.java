package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BulkRequestStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Bulk request result data.
 */
@ApiModel(description = "Bulk request result data.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkJobData   {
  @JsonProperty("result_url")
  private String resultUrl;

  @JsonProperty("status")
  private BulkRequestStatus status;

  @JsonProperty("workload_id")
  private Integer workloadId;

  public BulkJobData resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

  /**
   * Presigned s3 file url for the bulk request result.
   * @return resultUrl
   */
  @ApiModelProperty(value = "Presigned s3 file url for the bulk request result.")
  public String getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(String resultUrl) {
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
  @ApiModelProperty(required = true, value = "")
  public BulkRequestStatus getStatus() {
    return status;
  }

  public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

  public BulkJobData workloadId(Integer workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * Bulk Workload Id.
   * @return workloadId
   */
  @ApiModelProperty(value = "Bulk Workload Id.")
  public Integer getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(Integer workloadId) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

