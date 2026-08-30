package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BulkRequestStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Bulk request result data.
 */
@ApiModel(description="Bulk request result data.")

public class BulkJobData  {
  
 /**
  * Presigned s3 file url for the bulk request result.
  */
  @ApiModelProperty(value = "Presigned s3 file url for the bulk request result.")
  private String resultUrl;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BulkRequestStatus status;

 /**
  * Bulk Workload Id.
  */
  @ApiModelProperty(value = "Bulk Workload Id.")
  private Integer workloadId;
 /**
  * Presigned s3 file url for the bulk request result.
  * @return resultUrl
  */
  @JsonProperty("result_url")
  public String getResultUrl() {
    return resultUrl;
  }

  /**
   * Sets the <code>resultUrl</code> property.
   */
 public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

  /**
   * Sets the <code>resultUrl</code> property.
   */
  public BulkJobData resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public BulkRequestStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public BulkJobData status(BulkRequestStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Bulk Workload Id.
  * @return workloadId
  */
  @JsonProperty("workload_id")
  public Integer getWorkloadId() {
    return workloadId;
  }

  /**
   * Sets the <code>workloadId</code> property.
   */
 public void setWorkloadId(Integer workloadId) {
    this.workloadId = workloadId;
  }

  /**
   * Sets the <code>workloadId</code> property.
   */
  public BulkJobData workloadId(Integer workloadId) {
    this.workloadId = workloadId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

