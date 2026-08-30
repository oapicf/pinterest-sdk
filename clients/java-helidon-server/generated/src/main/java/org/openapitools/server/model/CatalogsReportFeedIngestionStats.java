package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsReportFeedIngestionStats   {

    private String catalogId;
    private Integer code;
    private String codeLabel;
    private String message;
    private Integer occurrences;

    /**
    * Gets or Sets reportType
    */
    public enum ReportTypeEnum {
        FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

        private String value;

        ReportTypeEnum(String value) {
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
        public static ReportTypeEnum fromValue(String text) {
            for (ReportTypeEnum b : ReportTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ReportTypeEnum reportType;

    /**
    * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
    */
    public enum SeverityEnum {
        WARN("WARN"),
        ERROR("ERROR");

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String text) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SeverityEnum severity;

    /**
     * Default constructor.
     */
    public CatalogsReportFeedIngestionStats() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsReportFeedIngestionStats.
     *
     * @param catalogId ID of the catalog entity.
     * @param code The event code that a diagnostics aggregated number references
     * @param codeLabel A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)
     * @param message Title message describing the diagnostic issue
     * @param occurrences Number of occurrences of the issue
     * @param reportType reportType
     * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
     */
    public CatalogsReportFeedIngestionStats(
        String catalogId, 
        Integer code, 
        String codeLabel, 
        String message, 
        Integer occurrences, 
        ReportTypeEnum reportType, 
        SeverityEnum severity
    ) {
        this.catalogId = catalogId;
        this.code = code;
        this.codeLabel = codeLabel;
        this.message = message;
        this.occurrences = occurrences;
        this.reportType = reportType;
        this.severity = severity;
    }



    /**
     * ID of the catalog entity.
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * The event code that a diagnostics aggregated number references
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
     * @return codeLabel
     */
    public String getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(String codeLabel) {
        this.codeLabel = codeLabel;
    }

    /**
     * Title message describing the diagnostic issue
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Number of occurrences of the issue
     * @return occurrences
     */
    public Integer getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(Integer occurrences) {
        this.occurrences = occurrences;
    }

    /**
     * Get reportType
     * @return reportType
     */
    public ReportTypeEnum getReportType() {
        return reportType;
    }

    public void setReportType(ReportTypeEnum reportType) {
        this.reportType = reportType;
    }

    /**
     * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsReportFeedIngestionStats {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

