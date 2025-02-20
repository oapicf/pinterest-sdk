/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TemplateResponseDateRange
 */
@JsonPropertyOrder({
  TemplateResponseDateRange.JSON_PROPERTY_DYNAMIC_DATE_RANGE,
  TemplateResponseDateRange.JSON_PROPERTY_RELATIVE_DATE_RANGE,
  TemplateResponseDateRange.JSON_PROPERTY_ABSOLUTE_DATE_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TemplateResponseDateRange   {
  public static final String JSON_PROPERTY_DYNAMIC_DATE_RANGE = "dynamic_date_range";
  @JsonProperty(JSON_PROPERTY_DYNAMIC_DATE_RANGE)
  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;

  public static final String JSON_PROPERTY_RELATIVE_DATE_RANGE = "relative_date_range";
  @JsonProperty(JSON_PROPERTY_RELATIVE_DATE_RANGE)
  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;

  public static final String JSON_PROPERTY_ABSOLUTE_DATE_RANGE = "absolute_date_range";
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_DATE_RANGE)
  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;

  public TemplateResponseDateRange dynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
    return this;
  }

  /**
   * Get dynamicDateRange
   * @return dynamicDateRange
   **/
  @JsonProperty(value = "dynamic_date_range")
  @ApiModelProperty(value = "")
  @Valid 
  public TemplateResponseDateRangeDynamicDateRange getDynamicDateRange() {
    return dynamicDateRange;
  }

  public void setDynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

  public TemplateResponseDateRange relativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
    return this;
  }

  /**
   * Get relativeDateRange
   * @return relativeDateRange
   **/
  @JsonProperty(value = "relative_date_range")
  @ApiModelProperty(value = "")
  @Valid 
  public TemplateResponseDateRangeRelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }

  public void setRelativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }

  public TemplateResponseDateRange absoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
    return this;
  }

  /**
   * Get absoluteDateRange
   * @return absoluteDateRange
   **/
  @JsonProperty(value = "absolute_date_range")
  @ApiModelProperty(value = "")
  @Valid 
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

