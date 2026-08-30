package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BulkRequestStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Bulk request result data.
 */
public class BulkJobData   {

    private String resultUrl;
    private BulkRequestStatus status;
    private Integer workloadId;

    /**
     * Default constructor.
     */
    public BulkJobData() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkJobData.
     *
     * @param resultUrl Presigned s3 file url for the bulk request result.
     * @param status status
     * @param workloadId Bulk Workload Id.
     */
    public BulkJobData(
        String resultUrl, 
        BulkRequestStatus status, 
        Integer workloadId
    ) {
        this.resultUrl = resultUrl;
        this.status = status;
        this.workloadId = workloadId;
    }



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
     * Get status
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

    /**
      * Create a string representation of this pojo.
    **/
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

