package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TemplateResponseDateRange  {
  
  @ApiModelProperty(value = "")
  @Valid
  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;

  @ApiModelProperty(value = "")
  @Valid
  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;

  @ApiModelProperty(value = "")
  @Valid
  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;
 /**
  * Get dynamicDateRange
  * @return dynamicDateRange
  */
  @JsonProperty("dynamic_date_range")
  public TemplateResponseDateRangeDynamicDateRange getDynamicDateRange() {
    return dynamicDateRange;
  }

  /**
   * Sets the <code>dynamicDateRange</code> property.
   */
 public void setDynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

  /**
   * Sets the <code>dynamicDateRange</code> property.
   */
  public TemplateResponseDateRange dynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
    return this;
  }

 /**
  * Get relativeDateRange
  * @return relativeDateRange
  */
  @JsonProperty("relative_date_range")
  public TemplateResponseDateRangeRelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }

  /**
   * Sets the <code>relativeDateRange</code> property.
   */
 public void setRelativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }

  /**
   * Sets the <code>relativeDateRange</code> property.
   */
  public TemplateResponseDateRange relativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
    return this;
  }

 /**
  * Get absoluteDateRange
  * @return absoluteDateRange
  */
  @JsonProperty("absolute_date_range")
  public TemplateResponseDateRangeAbsoluteDateRange getAbsoluteDateRange() {
    return absoluteDateRange;
  }

  /**
   * Sets the <code>absoluteDateRange</code> property.
   */
 public void setAbsoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
  }

  /**
   * Sets the <code>absoluteDateRange</code> property.
   */
  public TemplateResponseDateRange absoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
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
    TemplateResponseDateRange templateResponseDateRange = (TemplateResponseDateRange) o;
    return Objects.equals(this.dynamicDateRange, templateResponseDateRange.dynamicDateRange) &&
        Objects.equals(this.relativeDateRange, templateResponseDateRange.relativeDateRange) &&
        Objects.equals(this.absoluteDateRange, templateResponseDateRange.absoluteDateRange);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

