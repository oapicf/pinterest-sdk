package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The absolute date range of the template
 */

@Schema(name = "TemplateResponse_date_range_absolute_date_range", description = "The absolute date range of the template")
@JsonTypeName("TemplateResponse_date_range_absolute_date_range")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TemplateResponseDateRangeAbsoluteDateRange {

  private @Nullable String type;

  private @Nullable BigDecimal startDate;

  private @Nullable BigDecimal endDate;

  public TemplateResponseDateRangeAbsoluteDateRange type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The date range type
   * @return type
   */
  
  @Schema(name = "type", example = "absolute", description = "The date range type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public TemplateResponseDateRangeAbsoluteDateRange startDate(@Nullable BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the date range
   * @return startDate
   */
  @Valid 
  @Schema(name = "start_date", example = "0.8008281904610115", description = "The start date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public @Nullable BigDecimal getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable BigDecimal startDate) {
    this.startDate = startDate;
  }

  public TemplateResponseDateRangeAbsoluteDateRange endDate(@Nullable BigDecimal endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the date range
   * @return endDate
   */
  @Valid 
  @Schema(name = "end_date", example = "6.027456183070403", description = "The end date of the date range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable BigDecimal getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable BigDecimal endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDateRangeAbsoluteDateRange templateResponseDateRangeAbsoluteDateRange = (TemplateResponseDateRangeAbsoluteDateRange) o;
    return Objects.equals(this.type, templateResponseDateRangeAbsoluteDateRange.type) &&
        Objects.equals(this.startDate, templateResponseDateRangeAbsoluteDateRange.startDate) &&
        Objects.equals(this.endDate, templateResponseDateRangeAbsoluteDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeAbsoluteDateRange {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

