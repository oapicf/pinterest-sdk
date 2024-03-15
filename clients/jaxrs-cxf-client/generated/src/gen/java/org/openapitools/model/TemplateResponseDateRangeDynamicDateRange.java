package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The dynamic date range of the template
 **/
@ApiModel(description="The dynamic date range of the template")

public class TemplateResponseDateRangeDynamicDateRange  {
  
  @ApiModelProperty(example = "dynamic", value = "The date range type")
 /**
   * The date range type
  **/
  private String type;

public enum RangeEnum {

YEAR_TO_DATE(String.valueOf("YEAR_TO_DATE")), QUARTER_TO_DATE(String.valueOf("QUARTER_TO_DATE")), MONTH_TO_DATE(String.valueOf("MONTH_TO_DATE")), LAST_MONTH(String.valueOf("LAST_MONTH"));


    private String value;

    RangeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RangeEnum fromValue(String value) {
        for (RangeEnum b : RangeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "YEAR_TO_DATE", value = "The dynamic range type")
 /**
   * The dynamic range type
  **/
  private RangeEnum range;
 /**
   * The date range type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TemplateResponseDateRangeDynamicDateRange type(String type) {
    this.type = type;
    return this;
  }

 /**
   * The dynamic range type
   * @return range
  **/
  @JsonProperty("range")
  public String getRange() {
    if (range == null) {
      return null;
    }
    return range.value();
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public TemplateResponseDateRangeDynamicDateRange range(RangeEnum range) {
    this.range = range;
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
    TemplateResponseDateRangeDynamicDateRange templateResponseDateRangeDynamicDateRange = (TemplateResponseDateRangeDynamicDateRange) o;
    return Objects.equals(this.type, templateResponseDateRangeDynamicDateRange.type) &&
        Objects.equals(this.range, templateResponseDateRangeDynamicDateRange.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeDynamicDateRange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

