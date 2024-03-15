package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange;
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange;
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TemplateResponseDateRange
 */

@JsonTypeName("TemplateResponse_date_range")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TemplateResponseDateRange {

  private JsonNullable<TemplateResponseDateRangeDynamicDateRange> dynamicDateRange = JsonNullable.<TemplateResponseDateRangeDynamicDateRange>undefined();

  private JsonNullable<TemplateResponseDateRangeRelativeDateRange> relativeDateRange = JsonNullable.<TemplateResponseDateRangeRelativeDateRange>undefined();

  private JsonNullable<TemplateResponseDateRangeAbsoluteDateRange> absoluteDateRange = JsonNullable.<TemplateResponseDateRangeAbsoluteDateRange>undefined();

  public TemplateResponseDateRange dynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = JsonNullable.of(dynamicDateRange);
    return this;
  }

  /**
   * Get dynamicDateRange
   * @return dynamicDateRange
  */
  @Valid 
  @Schema(name = "dynamic_date_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dynamic_date_range")
  public JsonNullable<TemplateResponseDateRangeDynamicDateRange> getDynamicDateRange() {
    return dynamicDateRange;
  }

  public void setDynamicDateRange(JsonNullable<TemplateResponseDateRangeDynamicDateRange> dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

  public TemplateResponseDateRange relativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = JsonNullable.of(relativeDateRange);
    return this;
  }

  /**
   * Get relativeDateRange
   * @return relativeDateRange
  */
  @Valid 
  @Schema(name = "relative_date_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relative_date_range")
  public JsonNullable<TemplateResponseDateRangeRelativeDateRange> getRelativeDateRange() {
    return relativeDateRange;
  }

  public void setRelativeDateRange(JsonNullable<TemplateResponseDateRangeRelativeDateRange> relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }

  public TemplateResponseDateRange absoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = JsonNullable.of(absoluteDateRange);
    return this;
  }

  /**
   * Get absoluteDateRange
   * @return absoluteDateRange
  */
  @Valid 
  @Schema(name = "absolute_date_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("absolute_date_range")
  public JsonNullable<TemplateResponseDateRangeAbsoluteDateRange> getAbsoluteDateRange() {
    return absoluteDateRange;
  }

  public void setAbsoluteDateRange(JsonNullable<TemplateResponseDateRangeAbsoluteDateRange> absoluteDateRange) {
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
    return equalsNullable(this.dynamicDateRange, templateResponseDateRange.dynamicDateRange) &&
        equalsNullable(this.relativeDateRange, templateResponseDateRange.relativeDateRange) &&
        equalsNullable(this.absoluteDateRange, templateResponseDateRange.absoluteDateRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dynamicDateRange), hashCodeNullable(relativeDateRange), hashCodeNullable(absoluteDateRange));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

