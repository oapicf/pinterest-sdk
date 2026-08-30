package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.BulkReportingJobStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MMMReport   {

    private String message;
    private BulkReportingJobStatus reportStatus;
    private BigDecimal size;
    private String status;
    private String token;
    private String url;

    /**
     * Default constructor.
     */
    public MMMReport() {
    // JSON-B / Jackson
    }

    /**
     * Create MMMReport.
     *
     * @param message message
     * @param reportStatus reportStatus
     * @param size size
     * @param status status
     * @param token token
     * @param url url
     */
    public MMMReport(
        String message, 
        BulkReportingJobStatus reportStatus, 
        BigDecimal size, 
        String status, 
        String token, 
        String url
    ) {
        this.message = message;
        this.reportStatus = reportStatus;
        this.size = size;
        this.status = status;
        this.token = token;
        this.url = url;
    }



    /**
     * Get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        sb.append("class MMMReport {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

