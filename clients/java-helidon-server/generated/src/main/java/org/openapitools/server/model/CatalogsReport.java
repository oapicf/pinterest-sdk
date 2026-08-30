package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsReport   {


    /**
    * Gets or Sets reportStatus
    */
    public enum ReportStatusEnum {
        FINISHED("FINISHED"),
        IN_PROGRESS("IN_PROGRESS");

        private String value;

        ReportStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ReportStatusEnum fromValue(String text) {
            for (ReportStatusEnum b : ReportStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ReportStatusEnum reportStatus;
    private BigDecimal size;
    private String url;

    /**
     * Default constructor.
     */
    public CatalogsReport() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsReport.
     *
     * @param reportStatus reportStatus
     * @param size Size of the report in bytes
     * @param url URL to download the report
     */
    public CatalogsReport(
        ReportStatusEnum reportStatus, 
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
    public ReportStatusEnum getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(ReportStatusEnum reportStatus) {
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
     * URL to download the report
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
        sb.append("class CatalogsReport {\n");
        
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

