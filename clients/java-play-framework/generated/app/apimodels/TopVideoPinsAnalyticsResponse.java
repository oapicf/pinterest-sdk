package apimodels;

import apimodels.TopVideoPinsAnalyticsResponseDateAvailability;
import apimodels.TopVideoPinsAnalyticsResponsePinsItems;
import apimodels.TopVideoPinsSortBy;
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
 * TopVideoPinsAnalyticsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TopVideoPinsAnalyticsResponse   {
  @JsonProperty("date_availability")
  @Valid

  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  @Valid

  private List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins = null;

  @JsonProperty("sort_by")
  @Valid

  private TopVideoPinsSortBy sortBy;

  public TopVideoPinsAnalyticsResponse dateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

   /**
   * Get dateAvailability
   * @return dateAvailability
  **/
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopVideoPinsAnalyticsResponse pins(List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  public TopVideoPinsAnalyticsResponse addPinsItem(TopVideoPinsAnalyticsResponsePinsItems pinsItem) {
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
  public List<@Valid TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }

  public void setPins(List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  public TopVideoPinsAnalyticsResponse sortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  public TopVideoPinsSortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(TopVideoPinsSortBy sortBy) {
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
    TopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = (TopVideoPinsAnalyticsResponse) o;
    return Objects.equals(dateAvailability, topVideoPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(pins, topVideoPinsAnalyticsResponse.pins) &&
        Objects.equals(sortBy, topVideoPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponse {\n");
    
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

