package apimodels;

import apimodels.BulkRequestStatus;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Bulk request result data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkJobData   {
  @JsonProperty("result_url")
  
  private String resultUrl;

  @JsonProperty("status")
  @NotNull
@Valid

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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

