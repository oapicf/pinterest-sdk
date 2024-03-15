package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TopPinsAnalyticsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopPinsAnalyticsResponse {

  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @Valid
  private List<@Valid TopPinsAnalyticsResponsePinsInner> pins;

  /**
   * Gets or Sets sortBy
   */
  public enum SortByEnum {
    ENGAGEMENT("ENGAGEMENT"),
    
    SAVE("SAVE"),
    
    IMPRESSION("IMPRESSION"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    PIN_CLICK("PIN_CLICK");

    private String value;

    SortByEnum(String value) {
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
    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SortByEnum sortBy;

  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
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
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopPinsAnalyticsResponse pins(List<@Valid TopPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
    return this;
  }

  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsInner pinsItem) {
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
  public List<@Valid TopPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }

  public void setPins(List<@Valid TopPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
  */
  
  @Schema(name = "sort_by", example = "IMPRESSION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_by")
  public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

