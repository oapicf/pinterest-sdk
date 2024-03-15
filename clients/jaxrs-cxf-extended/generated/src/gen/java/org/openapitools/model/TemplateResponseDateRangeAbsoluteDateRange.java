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
 * The absolute date range of the template
 */
@ApiModel(description="The absolute date range of the template")

public class TemplateResponseDateRangeAbsoluteDateRange  {
  
 /**
  * The date range type
  */
  @ApiModelProperty(example = "absolute", value = "The date range type")
  private String type;

 /**
  * The start date of the date range
  */
  @ApiModelProperty(example = "0.8008281904610115", value = "The start date of the date range")
  @Valid
  private BigDecimal startDate;

 /**
  * The end date of the date range
  */
  @ApiModelProperty(example = "6.027456183070403", value = "The end date of the date range")
  @Valid
  private BigDecimal endDate;
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
  public TemplateResponseDateRangeAbsoluteDateRange type(String type) {
    this.type = type;
    return this;
  }

 /**
  * The start date of the date range
  * @return startDate
  */
  @JsonProperty("start_date")
  public BigDecimal getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public TemplateResponseDateRangeAbsoluteDateRange startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * The end date of the date range
  * @return endDate
  */
  @JsonProperty("end_date")
  public BigDecimal getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public TemplateResponseDateRangeAbsoluteDateRange endDate(BigDecimal endDate) {
    this.endDate = endDate;
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
    TemplateResponseDateRangeAbsoluteDateRange templateResponseDateRangeAbsoluteDateRange = (TemplateResponseDateRangeAbsoluteDateRange) o;
    return Objects.equals(this.type, templateResponseDateRangeAbsoluteDateRange.type) &&
        Objects.equals(this.startDate, templateResponseDateRangeAbsoluteDateRange.startDate) &&
        Objects.equals(this.endDate, templateResponseDateRangeAbsoluteDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeAbsoluteDateRange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

