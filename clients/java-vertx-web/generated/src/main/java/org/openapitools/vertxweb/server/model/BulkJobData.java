package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BulkRequestStatus;

/**
 * Bulk request result data.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkJobData   {
  
  private String resultUrl;
  private BulkRequestStatus status;
  private Integer workloadId;

  public BulkJobData () {

  }

  public BulkJobData (String resultUrl, BulkRequestStatus status, Integer workloadId) {
    this.resultUrl = resultUrl;
    this.status = status;
    this.workloadId = workloadId;
  }

    
  @JsonProperty("result_url")
  public String getResultUrl() {
    return resultUrl;
  }
  public void setResultUrl(String resultUrl) {
    this.resultUrl = resultUrl;
  }

    
  @JsonProperty("status")
  public BulkRequestStatus getStatus() {
    return status;
  }
  public void setStatus(BulkRequestStatus status) {
    this.status = status;
  }

    
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
