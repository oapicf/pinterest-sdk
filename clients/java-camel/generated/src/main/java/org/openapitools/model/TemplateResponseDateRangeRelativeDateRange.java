package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The relative date range of the template
 */

@Schema(name = "TemplateResponse_date_range_relative_date_range", description = "The relative date range of the template")
@JsonTypeName("TemplateResponse_date_range_relative_date_range")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRangeRelativeDateRange {

  private String type;

  private BigDecimal startDaysInPast;

  private BigDecimal endDaysInPast;

  public TemplateResponseDateRangeRelativeDateRange type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The date range type
   * @return type
  */
  
  @Schema(name = "type", example = "relative", description = "The date range type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

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
  */
  @Valid 
  @Schema(name = "start_days_in_past", example = "14", description = "The start date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_days_in_past")
  public BigDecimal getStartDaysInPast() {
    return startDaysInPast;
  }

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
  */
  @Valid 
  @Schema(name = "end_days_in_past", example = "7", description = "The end date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_days_in_past")
  public BigDecimal getEndDaysInPast() {
    return endDaysInPast;
  }

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

