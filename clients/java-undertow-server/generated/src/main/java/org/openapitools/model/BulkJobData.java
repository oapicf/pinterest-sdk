/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkRequestStatus;



/**
 * Bulk request result data.
 */

@ApiModel(description = "Bulk request result data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkJobData   {
  
  private String resultUrl;
  private BulkRequestStatus status;
  private Integer workloadId;

  /**
   * Presigned s3 file url for the bulk request result.
   */
  public BulkJobData resultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Presigned s3 file url for the bulk request result.")
  @JsonProperty("result_url")
  public String getResultUrl() {
    return resultUrl;
  }
  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

  /**
   */
  public BulkJobData status(BulkRequestStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public BulkRequestStatus getStatus() {
    return status;
  }
  public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

  /**
   * Bulk Workload Id.
   */
  public BulkJobData workloadId(Integer workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  
  @ApiModelProperty(value = "Bulk Workload Id.")
  @JsonProperty("workload_id")
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
    return Objects.equals(resultUrl, bulkJobData.resultUrl) &&
        Objects.equals(status, bulkJobData.status) &&
        Objects.equals(workloadId, bulkJobData.workloadId);
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

