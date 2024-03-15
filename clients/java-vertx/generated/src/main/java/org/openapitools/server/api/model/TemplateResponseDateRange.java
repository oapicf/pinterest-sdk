package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.server.api.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.server.api.model.TemplateResponseDateRangeRelativeDateRange;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateResponseDateRange   {
  
  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;
  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;
  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;

  public TemplateResponseDateRange () {

  }

  public TemplateResponseDateRange (TemplateResponseDateRangeDynamicDateRange dynamicDateRange, TemplateResponseDateRangeRelativeDateRange relativeDateRange, TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.dynamicDateRange = dynamicDateRange;
    this.relativeDateRange = relativeDateRange;
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

    
  @JsonProperty("absolute_date_range")
  public TemplateResponseDateRangeAbsoluteDateRange getAbsoluteDateRange() {
    return absoluteDateRange;
  }
  public void setAbsoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
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
    return Objects.equals(dynamicDateRange, templateResponseDateRange.dynamicDateRange) &&
        Objects.equals(relativeDateRange, templateResponseDateRange.relativeDateRange) &&
        Objects.equals(absoluteDateRange, templateResponseDateRange.absoluteDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicDateRange, relativeDateRange, absoluteDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRange {\n");
    
    sb.append("    dynamicDateRange: ").append(toIndentedString(dynamicDateRange)).append("\n");
    sb.append("    relativeDateRange: ").append(toIndentedString(relativeDateRange)).append("\n");
    sb.append("    absoluteDateRange: ").append(toIndentedString(absoluteDateRange)).append("\n");
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
