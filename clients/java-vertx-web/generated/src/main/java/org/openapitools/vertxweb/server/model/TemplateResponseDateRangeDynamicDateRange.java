package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The dynamic date range of the template
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public TemplateResponseDateRangeDynamicDateRange () {

  }

  public TemplateResponseDateRangeDynamicDateRange (RangeEnum range, String type) {
    this.range = range;
    this.type = type;
  }

    
  @JsonProperty("range")
  public RangeEnum getRange() {
    return range;
  }
  public void setRange(RangeEnum range) {
    this.range = range;
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
