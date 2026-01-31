package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The relative date range of the template
 **/
@ApiModel(description = "The relative date range of the template")
@JsonTypeName("TemplateResponse_date_range_relative_date_range")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TemplateResponseDateRangeRelativeDateRange   {
  private BigDecimal endDaysInPast;
  private BigDecimal startDaysInPast;
  private String type;

  public TemplateResponseDateRangeRelativeDateRange() {
  }

  /**
   * The end date of the date range
   **/
  public TemplateResponseDateRangeRelativeDateRange endDaysInPast(BigDecimal endDaysInPast) {
    this.endDaysInPast = endDaysInPast;
    return this;
  }

  
  @ApiModelProperty(example = "7", value = "The end date of the date range")
  @JsonProperty("end_days_in_past")
  @Valid public BigDecimal getEndDaysInPast() {
    return endDaysInPast;
  }

  @JsonProperty("end_days_in_past")
  public void setEndDaysInPast(BigDecimal endDaysInPast) {
    this.endDaysInPast = endDaysInPast;
  }

  /**
   * The start date of the date range
   **/
  public TemplateResponseDateRangeRelativeDateRange startDaysInPast(BigDecimal startDaysInPast) {
    this.startDaysInPast = startDaysInPast;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "The start date of the date range")
  @JsonProperty("start_days_in_past")
  @Valid public BigDecimal getStartDaysInPast() {
    return startDaysInPast;
  }

  @JsonProperty("start_days_in_past")
  public void setStartDaysInPast(BigDecimal startDaysInPast) {
    this.startDaysInPast = startDaysInPast;
  }

  /**
   * The date range type
   **/
  public TemplateResponseDateRangeRelativeDateRange type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "relative", value = "The date range type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
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
    return Objects.equals(this.endDaysInPast, templateResponseDateRangeRelativeDateRange.endDaysInPast) &&
        Objects.equals(this.startDaysInPast, templateResponseDateRangeRelativeDateRange.startDaysInPast) &&
        Objects.equals(this.type, templateResponseDateRangeRelativeDateRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDaysInPast, startDaysInPast, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeRelativeDateRange {\n");
    
    sb.append("    endDaysInPast: ").append(toIndentedString(endDaysInPast)).append("\n");
    sb.append("    startDaysInPast: ").append(toIndentedString(startDaysInPast)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

