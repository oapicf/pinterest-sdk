package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsReportFeedIngestionFilter   {

    private String feedId;
    private String processingResultId;

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
     * Default constructor.
     */
    public CatalogsReportFeedIngestionFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsReportFeedIngestionFilter.
     *
     * @param feedId ID of the feed entity.
     * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
     * @param reportType reportType
     */
    public CatalogsReportFeedIngestionFilter(
        String feedId, 
        String processingResultId, 
        ReportTypeEnum reportType
    ) {
        this.feedId = feedId;
        this.processingResultId = processingResultId;
        this.reportType = reportType;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsReportFeedIngestionFilter {\n");
        
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    processingResultId: ").append(toIndentedString(processingResultId)).append("\n");
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

