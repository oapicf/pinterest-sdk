/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The relative date range of the template
 */
@Schema(name = "TemplateResponse_date_range_relative_date_range", description = "The relative date range of the template")
@JsonPropertyOrder({
  TemplateResponseDateRangeRelativeDateRange.JSON_PROPERTY_TYPE,
  TemplateResponseDateRangeRelativeDateRange.JSON_PROPERTY_START_DAYS_IN_PAST,
  TemplateResponseDateRangeRelativeDateRange.JSON_PROPERTY_END_DAYS_IN_PAST
})
@JsonTypeName("TemplateResponse_date_range_relative_date_range")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-14T23:02:10.408800522Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class TemplateResponseDateRangeRelativeDateRange {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_START_DAYS_IN_PAST = "start_days_in_past";
    private BigDecimal startDaysInPast;

    public static final String JSON_PROPERTY_END_DAYS_IN_PAST = "end_days_in_past";
    private BigDecimal endDaysInPast;

    public TemplateResponseDateRangeRelativeDateRange() {
    }

    public TemplateResponseDateRangeRelativeDateRange type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The date range type
     * @return type
     **/
    @Nullable
    @Schema(name = "type", example = "relative", description = "The date range type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public TemplateResponseDateRangeRelativeDateRange startDaysInPast(BigDecimal startDaysInPast) {
        this.startDaysInPast = startDaysInPast;
        return this;
    }

    /**
     * The start date of the date range
     * @return startDaysInPast
     **/
    @Nullable
    @Schema(name = "start_days_in_past", example = "14", description = "The start date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_START_DAYS_IN_PAST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getStartDaysInPast() {
        return startDaysInPast;
    }

    @JsonProperty(JSON_PROPERTY_START_DAYS_IN_PAST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartDaysInPast(BigDecimal startDaysInPast) {
        this.startDaysInPast = startDaysInPast;
    }

    public TemplateResponseDateRangeRelativeDateRange endDaysInPast(BigDecimal endDaysInPast) {
        this.endDaysInPast = endDaysInPast;
        return this;
    }

    /**
     * The end date of the date range
     * @return endDaysInPast
     **/
    @Nullable
    @Schema(name = "end_days_in_past", example = "7", description = "The end date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_END_DAYS_IN_PAST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getEndDaysInPast() {
        return endDaysInPast;
    }

    @JsonProperty(JSON_PROPERTY_END_DAYS_IN_PAST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndDaysInPast(BigDecimal endDaysInPast) {
        this.endDaysInPast = endDaysInPast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateResponseDateRangeRelativeDateRange templateResponseDateRangeRelativeDateRange = (TemplateResponseDateRangeRelativeDateRange) o;
        return Objects.equals(this.type, templateResponseDateRangeRelativeDateRange.type) &&
            Objects.equals(this.startDaysInPast, templateResponseDateRangeRelativeDateRange.startDaysInPast) &&
            Objects.equals(this.endDaysInPast, templateResponseDateRangeRelativeDateRange.endDaysInPast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, startDaysInPast, endDaysInPast);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateResponseDateRangeRelativeDateRange {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startDaysInPast: ").append(toIndentedString(startDaysInPast)).append("\n");
        sb.append("    endDaysInPast: ").append(toIndentedString(endDaysInPast)).append("\n");
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
