package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The dynamic date range of the template")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TemplateResponseDateRangeDynamicDateRange   {
  

  /**
   * The dynamic range type
   */
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
      return String.valueOf(value);
    }
  }

  private RangeEnum range;
  private String type;

  /**
   * The dynamic range type
   **/
  
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
   **/
  
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
    return Objects.equals(this.range, templateResponseDateRangeDynamicDateRange.range) &&
        Objects.equals(this.type, templateResponseDateRangeDynamicDateRange.type);
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

