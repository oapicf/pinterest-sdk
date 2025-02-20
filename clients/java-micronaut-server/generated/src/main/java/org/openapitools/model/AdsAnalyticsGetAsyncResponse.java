/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BulkReportingJobStatus;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AdsAnalyticsGetAsyncResponse
 */
@JsonPropertyOrder({
  AdsAnalyticsGetAsyncResponse.JSON_PROPERTY_REPORT_STATUS,
  AdsAnalyticsGetAsyncResponse.JSON_PROPERTY_URL,
  AdsAnalyticsGetAsyncResponse.JSON_PROPERTY_SIZE
})
@JsonTypeName("AdsAnalyticsGetAsyncResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class AdsAnalyticsGetAsyncResponse {
    public static final String JSON_PROPERTY_REPORT_STATUS = "report_status";
    private BulkReportingJobStatus reportStatus;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_SIZE = "size";
    private BigDecimal size;

    public AdsAnalyticsGetAsyncResponse() {
    }

    public AdsAnalyticsGetAsyncResponse reportStatus(BulkReportingJobStatus reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * Get reportStatus
     * @return reportStatus
     */
    @Nullable
    @Schema(name = "report_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BulkReportingJobStatus getReportStatus() {
        return reportStatus;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportStatus(BulkReportingJobStatus reportStatus) {
        this.reportStatus = reportStatus;
    }

    public AdsAnalyticsGetAsyncResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Nullable
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public AdsAnalyticsGetAsyncResponse size(BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Nullable
    @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getSize() {
        return size;
    }

    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSize(BigDecimal size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdsAnalyticsGetAsyncResponse adsAnalyticsGetAsyncResponse = (AdsAnalyticsGetAsyncResponse) o;
        return Objects.equals(this.reportStatus, adsAnalyticsGetAsyncResponse.reportStatus) &&
            Objects.equals(this.url, adsAnalyticsGetAsyncResponse.url) &&
            Objects.equals(this.size, adsAnalyticsGetAsyncResponse.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportStatus, url, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsAnalyticsGetAsyncResponse {\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

