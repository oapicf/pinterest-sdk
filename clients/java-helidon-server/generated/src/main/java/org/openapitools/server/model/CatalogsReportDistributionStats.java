package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsReportDistributionStats   {

    private String catalogId;
    private Integer code;
    private String codeLabel;
    private Boolean ineligibleForAds;
    private Boolean ineligibleForOrganic;
    private String message;
    private Integer occurrences;

    /**
    * Gets or Sets reportType
    */
    public enum ReportTypeEnum {
        DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

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
     * Default constructor.
     */
    public CatalogsReportDistributionStats() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsReportDistributionStats.
     *
     * @param catalogId ID of the catalog entity.
     * @param code The event code that a diagnostics aggregated number references
     * @param codeLabel A human-friendly label for the event code (e.g, &#39;SPAM&#39;)
     * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
     * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
     * @param message Title message describing the diagnostic issue
     * @param occurrences Number of occurrences of the issue
     * @param reportType reportType
     */
    public CatalogsReportDistributionStats(
        String catalogId, 
        Integer code, 
        String codeLabel, 
        Boolean ineligibleForAds, 
        Boolean ineligibleForOrganic, 
        String message, 
        Integer occurrences, 
        ReportTypeEnum reportType
    ) {
        this.catalogId = catalogId;
        this.code = code;
        this.codeLabel = codeLabel;
        this.ineligibleForAds = ineligibleForAds;
        this.ineligibleForOrganic = ineligibleForOrganic;
        this.message = message;
        this.occurrences = occurrences;
        this.reportType = reportType;
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
     * A human-friendly label for the event code (e.g, 'SPAM')
     * @return codeLabel
     */
    public String getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(String codeLabel) {
        this.codeLabel = codeLabel;
    }

    /**
     * Indicates if issue makes items ineligible for ads distribution
     * @return ineligibleForAds
     */
    public Boolean getIneligibleForAds() {
        return ineligibleForAds;
    }

    public void setIneligibleForAds(Boolean ineligibleForAds) {
        this.ineligibleForAds = ineligibleForAds;
    }

    /**
     * Indicates if issue makes items ineligible for organic distribution
     * @return ineligibleForOrganic
     */
    public Boolean getIneligibleForOrganic() {
        return ineligibleForOrganic;
    }

    public void setIneligibleForOrganic(Boolean ineligibleForOrganic) {
        this.ineligibleForOrganic = ineligibleForOrganic;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsReportDistributionStats {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    codeLabel: ").append(toIndentedString(codeLabel)).append("\n");
        sb.append("    ineligibleForAds: ").append(toIndentedString(ineligibleForAds)).append("\n");
        sb.append("    ineligibleForOrganic: ").append(toIndentedString(ineligibleForOrganic)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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

