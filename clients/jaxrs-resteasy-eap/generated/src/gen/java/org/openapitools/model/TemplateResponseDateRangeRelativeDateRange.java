package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The relative date range of the template")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRangeRelativeDateRange   {
  
  private String type;
  private BigDecimal startDaysInPast;
  private BigDecimal endDaysInPast;

  /**
   * The date range type
   **/
  
  @ApiModelProperty(example = "relative", value = "The date range type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The start date of the date range
   **/
  
  @ApiModelProperty(example = "14", value = "The start date of the date range")
  @JsonProperty("start_days_in_past")
  public BigDecimal getStartDaysInPast() {
    return startDaysInPast;
  }
  public void setStartDaysInPast(BigDecimal startDaysInPast) {
    this.startDaysInPast = startDaysInPast;
  }

  /**
   * The end date of the date range
   **/
  
  @ApiModelProperty(example = "7", value = "The end date of the date range")
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

