package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The relative date range of the template
 */
@ApiModel(description="The relative date range of the template")

public class TemplateResponseDateRangeRelativeDateRange  {
  
 /**
  * The date range type
  */
  @ApiModelProperty(example = "relative", value = "The date range type")
  private String type;

 /**
  * The start date of the date range
  */
  @ApiModelProperty(example = "14", value = "The start date of the date range")
  @Valid
  private BigDecimal startDaysInPast;

 /**
  * The end date of the date range
  */
  @ApiModelProperty(example = "7", value = "The end date of the date range")
  @Valid
  private BigDecimal endDaysInPast;
 /**
  * The date range type
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public TemplateResponseDateRangeRelativeDateRange type(String type) {
    this.type = type;
    return this;
  }

 /**
  * The start date of the date range
  * @return startDaysInPast
  */
  @JsonProperty("start_days_in_past")
  public BigDecimal getStartDaysInPast() {
    return startDaysInPast;
  }

  /**
   * Sets the <code>startDaysInPast</code> property.
   */
 public void setStartDaysInPast(BigDecimal startDaysInPast) {
    this.startDaysInPast = startDaysInPast;
  }

  /**
   * Sets the <code>startDaysInPast</code> property.
   */
  public TemplateResponseDateRangeRelativeDateRange startDaysInPast(BigDecimal startDaysInPast) {
    this.startDaysInPast = startDaysInPast;
    return this;
  }

 /**
  * The end date of the date range
  * @return endDaysInPast
  */
  @JsonProperty("end_days_in_past")
  public BigDecimal getEndDaysInPast() {
    return endDaysInPast;
  }

  /**
   * Sets the <code>endDaysInPast</code> property.
   */
 public void setEndDaysInPast(BigDecimal endDaysInPast) {
    this.endDaysInPast = endDaysInPast;
  }

  /**
   * Sets the <code>endDaysInPast</code> property.
   */
  public TemplateResponseDateRangeRelativeDateRange endDaysInPast(BigDecimal endDaysInPast) {
    this.endDaysInPast = endDaysInPast;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

