package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * The absolute date range of the template
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateResponseDateRangeAbsoluteDateRange   {
  
  private BigDecimal endDate;
  private BigDecimal startDate;
  private String type;

  public TemplateResponseDateRangeAbsoluteDateRange () {

  }

  public TemplateResponseDateRangeAbsoluteDateRange (BigDecimal endDate, BigDecimal startDate, String type) {
    this.endDate = endDate;
    this.startDate = startDate;
    this.type = type;
  }

    
  @JsonProperty("end_date")
  public BigDecimal getEndDate() {
    return endDate;
  }
  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("start_date")
  public BigDecimal getStartDate() {
    return startDate;
  }
  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
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
    TemplateResponseDateRangeAbsoluteDateRange templateResponseDateRangeAbsoluteDateRange = (TemplateResponseDateRangeAbsoluteDateRange) o;
    return Objects.equals(endDate, templateResponseDateRangeAbsoluteDateRange.endDate) &&
        Objects.equals(startDate, templateResponseDateRangeAbsoluteDateRange.startDate) &&
        Objects.equals(type, templateResponseDateRangeAbsoluteDateRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeAbsoluteDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
