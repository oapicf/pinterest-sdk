package apimodels;

import apimodels.TopPinsAnalyticsResponseDateAvailability;
import apimodels.TopPinsAnalyticsResponsePinsItems;
import apimodels.TopPinsSortBy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TopPinsAnalyticsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TopPinsAnalyticsResponse   {
  @JsonProperty("date_availability")
  @Valid

  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  @Valid

  private List<@Valid TopPinsAnalyticsResponsePinsItems> pins = null;

  @JsonProperty("sort_by")
  @Valid

  private TopPinsSortBy sortBy;

  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

   /**
   * Get dateAvailability
   * @return dateAvailability
  **/
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
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
  **/
  public List<@Valid TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse sortBy(TopPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  public TopPinsSortBy getSortBy() {
    return sortBy;
  }

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
    return Objects.equals(dateAvailability, topPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(pins, topPinsAnalyticsResponse.pins) &&
        Objects.equals(sortBy, topPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

