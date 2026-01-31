/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The dynamic date range of the template
 */

@ApiModel(description = "The dynamic date range of the template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TemplateResponseDateRangeDynamicDateRange   {
  


  public enum RangeEnum {
    YEAR_TO_DATE("YEAR_TO_DATE"),
    QUARTER_TO_DATE("QUARTER_TO_DATE"),
    MONTH_TO_DATE("MONTH_TO_DATE"),
    LAST_MONTH("LAST_MONTH"),
    LAST_QUARTER("LAST_QUARTER");

    private String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RangeEnum range;
  private String type;

  /**
   * The dynamic range type
   */
  public TemplateResponseDateRangeDynamicDateRange range(RangeEnum range) {
    this.range = range;
    return this;
  }

  
  @ApiModelProperty(example = "YEAR_TO_DATE", value = "The dynamic range type")
  @JsonProperty("range")
  public RangeEnum getRange() {
    return range;
  }
  public void setRange(RangeEnum range) {
    this.range = range;
  }

  /**
   * The date range type
   */
  public TemplateResponseDateRangeDynamicDateRange type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "dynamic", value = "The date range type")
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
    TemplateResponseDateRangeDynamicDateRange templateResponseDateRangeDynamicDateRange = (TemplateResponseDateRangeDynamicDateRange) o;
    return Objects.equals(range, templateResponseDateRangeDynamicDateRange.range) &&
        Objects.equals(type, templateResponseDateRangeDynamicDateRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeDynamicDateRange {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

