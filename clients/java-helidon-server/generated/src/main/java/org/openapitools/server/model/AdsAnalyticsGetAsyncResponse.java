package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BulkReportingJobStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdsAnalyticsGetAsyncResponse   {

    private BulkReportingJobStatus reportStatus;
    private BigDecimal size;
    private String url;

    /**
     * Default constructor.
     */
    public AdsAnalyticsGetAsyncResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsAnalyticsGetAsyncResponse.
     *
     * @param reportStatus reportStatus
     * @param size size
     * @param url url
     */
    public AdsAnalyticsGetAsyncResponse(
        BulkReportingJobStatus reportStatus, 
        BigDecimal size, 
        String url
    ) {
        this.reportStatus = reportStatus;
        this.size = size;
        this.url = url;
    }



    /**
     * Get reportStatus
     * @return reportStatus
     */
    public BulkReportingJobStatus getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(BulkReportingJobStatus reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * Get size
     * @return size
     */
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    /**
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsAnalyticsGetAsyncResponse {\n");
        
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

