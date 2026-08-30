package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopPinsSortBy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TopPinsAnalyticsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopPinsAnalyticsResponse   {
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;
  private @Valid List<@Valid TopPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();
  private TopPinsSortBy sortBy;

  public TopPinsAnalyticsResponse() {
  }

  /**
   **/
  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("date_availability")
  @Valid public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  @JsonProperty("date_availability")
  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   **/
  public TopPinsAnalyticsResponse pins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pins")
  @Valid public List<@Valid TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  @JsonProperty("pins")
  public void setPins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsItems pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }

    this.pins.add(pinsItem);
    return this;
  }

  public TopPinsAnalyticsResponse removePinsItem(TopPinsAnalyticsResponsePinsItems pinsItem) {
    if (pinsItem != null && this.pins != null) {
      this.pins.remove(pinsItem);
    }

    return this;
  }
  /**
   **/
  public TopPinsAnalyticsResponse sortBy(TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sort_by")
  public TopPinsSortBy getSortBy() {
    return sortBy;
  }

  @JsonProperty("sort_by")
  public void setSortBy(TopPinsSortBy sortBy) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
