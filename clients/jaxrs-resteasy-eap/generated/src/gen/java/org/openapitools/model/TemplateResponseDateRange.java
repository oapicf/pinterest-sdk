package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRange   {
  
  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;
  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;
  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dynamic_date_range")
  public TemplateResponseDateRangeDynamicDateRange getDynamicDateRange() {
    return dynamicDateRange;
  }
  public void setDynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("relative_date_range")
  public TemplateResponseDateRangeRelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }
  public void setRelativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

