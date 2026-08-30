package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopPinsSortBy;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TopPinsAnalyticsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopPinsAnalyticsResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid TopPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TopPinsSortBy sortBy;

  public TopPinsAnalyticsResponse dateAvailability(@Nullable TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  /**
   * Get dateAvailability
   * @return dateAvailability
   */
  @Valid 
  @Schema(name = "date_availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_availability")
  public @Nullable TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  @JsonProperty("date_availability")
  public void setDateAvailability(@Nullable TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopPinsAnalyticsResponse pins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsItems pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }

  /**
   * Get pins
   * @return pins
   */
  @Valid 
  @Schema(name = "pins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pins")
  public List<@Valid TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  @JsonProperty("pins")
  public void setPins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse sortBy(@Nullable TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  @Valid 
  @Schema(name = "sort_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_by")
  public @Nullable TopPinsSortBy getSortBy() {
    return sortBy;
  }

  @JsonProperty("sort_by")
  public void setSortBy(@Nullable TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopPinsAnalyticsResponse topPinsAnalyticsResponse = (TopPinsAnalyticsResponse) o;
    return Objects.equals(this.dateAvailability, topPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(this.pins, topPinsAnalyticsResponse.pins) &&
        Objects.equals(this.sortBy, topPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponse {\n");
    sb.append("    dateAvailability: ").append(toIndentedString(dateAvailability)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

