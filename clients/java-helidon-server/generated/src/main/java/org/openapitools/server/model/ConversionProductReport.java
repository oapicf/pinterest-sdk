package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.BulkReportingJobStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionProductReport   {

    private String message;
    private BulkReportingJobStatus reportStatus;
    private BigDecimal size;
    private String token;
    private String url;

    /**
     * Default constructor.
     */
    public ConversionProductReport() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionProductReport.
     *
     * @param message Message returned from the create report request
     * @param reportStatus Async report status
     * @param size Size of the report in bytes
     * @param token Token returned from the create report request
     * @param url URL of the report
     */
    public ConversionProductReport(
        String message, 
        BulkReportingJobStatus reportStatus, 
        BigDecimal size, 
        String token, 
        String url
    ) {
        this.message = message;
        this.reportStatus = reportStatus;
        this.size = size;
        this.token = token;
        this.url = url;
    }



    /**
     * Message returned from the create report request
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Async report status
     * @return reportStatus
     */
    public BulkReportingJobStatus getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(BulkReportingJobStatus reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * Size of the report in bytes
     * @return size
     */
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    /**
     * Token returned from the create report request
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * URL of the report
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
        sb.append("class ConversionProductReport {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

