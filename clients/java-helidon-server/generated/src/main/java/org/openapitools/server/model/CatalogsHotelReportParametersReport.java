package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsReportDistributionIssueFilter;
import org.openapitools.server.model.CatalogsReportFeedIngestionFilter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelReportParametersReport   {

    private String feedId;
    private String processingResultId;

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
    private String catalogId;

    /**
     * Default constructor.
     */
    public CatalogsHotelReportParametersReport() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelReportParametersReport.
     *
     * @param feedId ID of the feed entity.
     * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
     * @param reportType reportType
     * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
     */
    public CatalogsHotelReportParametersReport(
        String feedId, 
        String processingResultId, 
        ReportTypeEnum reportType, 
        String catalogId
    ) {
        this.feedId = feedId;
        this.processingResultId = processingResultId;
        this.reportType = reportType;
        this.catalogId = catalogId;
    }



    /**
     * ID of the feed entity.
     * @return feedId
     */
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    /**
     * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
     * @return processingResultId
     */
    public String getProcessingResultId() {
        return processingResultId;
    }

    public void setProcessingResultId(String processingResultId) {
        this.processingResultId = processingResultId;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelReportParametersReport {\n");
        
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

