package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The dynamic date range of the template
 */

@Schema(name = "TemplateResponse_date_range_dynamic_date_range", description = "The dynamic date range of the template")
@JsonTypeName("TemplateResponse_date_range_dynamic_date_range")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TemplateResponseDateRangeDynamicDateRange {

  /**
   * The dynamic range type
   */
  public enum RangeEnum {
    YEAR_TO_DATE("YEAR_TO_DATE"),
    
    QUARTER_TO_DATE("QUARTER_TO_DATE"),
    
    MONTH_TO_DATE("MONTH_TO_DATE"),
    
    LAST_MONTH("LAST_MONTH"),
    
    LAST_QUARTER("LAST_QUARTER");

    private final String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RangeEnum fromValue(String value) {
      for (RangeEnum b : RangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable RangeEnum range;

  private @Nullable String type;

  public TemplateResponseDateRangeDynamicDateRange range(@Nullable RangeEnum range) {
    this.range = range;
    return this;
  }

  /**
   * The dynamic range type
   * @return range
   */
  
  @Schema(name = "range", example = "YEAR_TO_DATE", description = "The dynamic range type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("range")
  public @Nullable RangeEnum getRange() {
    return range;
  }

  public void setRange(@Nullable RangeEnum range) {
    this.range = range;
  }

  public TemplateResponseDateRangeDynamicDateRange type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The date range type
   * @return type
   */
  
  @Schema(name = "type", example = "dynamic", description = "The date range type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
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

