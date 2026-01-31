package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.vertxweb.server.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.vertxweb.server.model.TemplateResponseDateRangeRelativeDateRange;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateResponseDateRange   {
  
  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;
  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;
  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;

  public TemplateResponseDateRange () {

  }

  public TemplateResponseDateRange (TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange, TemplateResponseDateRangeDynamicDateRange dynamicDateRange, TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.absoluteDateRange = absoluteDateRange;
    this.dynamicDateRange = dynamicDateRange;
    this.relativeDateRange = relativeDateRange;
  }

    
  @JsonProperty("absolute_date_range")
  public TemplateResponseDateRangeAbsoluteDateRange getAbsoluteDateRange() {
    return absoluteDateRange;
  }
  public void setAbsoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
  }

    
  @JsonProperty("dynamic_date_range")
  public TemplateResponseDateRangeDynamicDateRange getDynamicDateRange() {
    return dynamicDateRange;
  }
  public void setDynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

    
  @JsonProperty("relative_date_range")
  public TemplateResponseDateRangeRelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }
  public void setRelativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDateRange templateResponseDateRange = (TemplateResponseDateRange) o;
    return Objects.equals(absoluteDateRange, templateResponseDateRange.absoluteDateRange) &&
        Objects.equals(dynamicDateRange, templateResponseDateRange.dynamicDateRange) &&
        Objects.equals(relativeDateRange, templateResponseDateRange.relativeDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteDateRange, dynamicDateRange, relativeDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRange {\n");
    
    sb.append("    absoluteDateRange: ").append(toIndentedString(absoluteDateRange)).append("\n");
    sb.append("    dynamicDateRange: ").append(toIndentedString(dynamicDateRange)).append("\n");
    sb.append("    relativeDateRange: ").append(toIndentedString(relativeDateRange)).append("\n");
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
