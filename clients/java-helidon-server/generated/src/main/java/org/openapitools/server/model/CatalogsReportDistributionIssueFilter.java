package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsReportDistributionIssueFilter   {

    private String catalogId;

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
    public CatalogsReportDistributionIssueFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsReportDistributionIssueFilter.
     *
     * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
     * @param reportType reportType
     */
    public CatalogsReportDistributionIssueFilter(
        String catalogId, 
        ReportTypeEnum reportType
    ) {
        this.catalogId = catalogId;
        this.reportType = reportType;
    }



    /**
     * Unique identifier of a catalog. If not given, oldest catalog will be used
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
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
        sb.append("class CatalogsReportDistributionIssueFilter {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

