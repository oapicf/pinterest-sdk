package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * The relative date range of the template
 */
@ApiModel(description = "The relative date range of the template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRangeRelativeDateRange   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("start_days_in_past")
  private BigDecimal startDaysInPast;

  @JsonProperty("end_days_in_past")
  private BigDecimal endDaysInPast;

  public TemplateResponseDateRangeRelativeDateRange type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The date range type
   * @return type
  **/
  @ApiModelProperty(example = "relative", value = "The date range type")
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
  **/
  @ApiModelProperty(example = "14", value = "The start date of the date range")
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
  **/
  @ApiModelProperty(example = "7", value = "The end date of the date range")
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

