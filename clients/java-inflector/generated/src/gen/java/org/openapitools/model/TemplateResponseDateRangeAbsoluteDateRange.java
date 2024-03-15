package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The absolute date range of the template
 **/

@ApiModel(description = "The absolute date range of the template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRangeAbsoluteDateRange   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("start_date")
  private BigDecimal startDate;

  @JsonProperty("end_date")
  private BigDecimal endDate;

  /**
   * The date range type
   **/
  public TemplateResponseDateRangeAbsoluteDateRange type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "absolute", value = "The date range type")
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
  public TemplateResponseDateRangeAbsoluteDateRange startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "0.8008281904610115", value = "The start date of the date range")
  @JsonProperty("start_date")
  public BigDecimal getStartDate() {
    return startDate;
  }
  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  /**
   * The end date of the date range
   **/
  public TemplateResponseDateRangeAbsoluteDateRange endDate(BigDecimal endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "6.027456183070403", value = "The end date of the date range")
  @JsonProperty("end_date")
  public BigDecimal getEndDate() {
    return endDate;
  }
  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
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
    return Objects.equals(type, templateResponseDateRangeAbsoluteDateRange.type) &&
        Objects.equals(startDate, templateResponseDateRangeAbsoluteDateRange.startDate) &&
        Objects.equals(endDate, templateResponseDateRangeAbsoluteDateRange.endDate);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

