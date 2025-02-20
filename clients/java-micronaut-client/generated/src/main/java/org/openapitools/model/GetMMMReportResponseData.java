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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * GetMMMReportResponseData
 */
@JsonPropertyOrder({
  GetMMMReportResponseData.JSON_PROPERTY_REPORT_STATUS,
  GetMMMReportResponseData.JSON_PROPERTY_URL,
  GetMMMReportResponseData.JSON_PROPERTY_SIZE
})
@JsonTypeName("GetMMMReportResponseData")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class GetMMMReportResponseData {
    /**
     * Gets or Sets reportStatus
     */
    public enum ReportStatusEnum {
        DOES_NOT_EXIST("DOES_NOT_EXIST"),
        FINISHED("FINISHED"),
        IN_PROGRESS("IN_PROGRESS"),
        EXPIRED("EXPIRED"),
        FAILED("FAILED"),
        CANCELLED("CANCELLED");

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
        public static ReportStatusEnum fromValue(String value) {
            for (ReportStatusEnum b : ReportStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_REPORT_STATUS = "report_status";
    private ReportStatusEnum reportStatus;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_SIZE = "size";
    private BigDecimal size;

    public GetMMMReportResponseData() {
    }

    public GetMMMReportResponseData reportStatus(ReportStatusEnum reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * Get reportStatus
     * @return reportStatus
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ReportStatusEnum getReportStatus() {
        return reportStatus;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportStatus(ReportStatusEnum reportStatus) {
        this.reportStatus = reportStatus;
    }

    public GetMMMReportResponseData url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Nullable
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

    public GetMMMReportResponseData size(BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    @Nullable
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
        GetMMMReportResponseData getMMMReportResponseData = (GetMMMReportResponseData) o;
        return Objects.equals(this.reportStatus, getMMMReportResponseData.reportStatus) &&
            Objects.equals(this.url, getMMMReportResponseData.url) &&
            Objects.equals(this.size, getMMMReportResponseData.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportStatus, url, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMMMReportResponseData {\n");
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

