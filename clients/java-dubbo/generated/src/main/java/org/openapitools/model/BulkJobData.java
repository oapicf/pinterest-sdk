package org.openapitools.model;

import org.openapitools.model.BulkRequestStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Bulk request result data.
 */
public class BulkJobData implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Presigned s3 file url for the bulk request result.
   */
  @JsonProperty("result_url")
  private String resultUrl;

  @JsonProperty("status")
  private BulkRequestStatus status;

  /**
   * Bulk Workload Id.
   */
  @JsonProperty("workload_id")
  private Integer workloadId;

  /**
   * Presigned s3 file url for the bulk request result.
   * @return resultUrl
   */
  public String getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

  /**
   * 
   * @return status
   */
  public BulkRequestStatus getStatus() {
    return status;
  }

  public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

  /**
   * Bulk Workload Id.
   * @return workloadId
   */
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
