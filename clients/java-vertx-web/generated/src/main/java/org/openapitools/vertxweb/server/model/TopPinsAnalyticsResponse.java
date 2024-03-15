package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponsePinsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopPinsAnalyticsResponse   {
  
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;
  private List<TopPinsAnalyticsResponsePinsInner> pins;


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

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SortByEnum sortBy;

  public TopPinsAnalyticsResponse () {

  }

  public TopPinsAnalyticsResponse (TopPinsAnalyticsResponseDateAvailability dateAvailability, List<TopPinsAnalyticsResponsePinsInner> pins, SortByEnum sortBy) {
    this.dateAvailability = dateAvailability;
    this.pins = pins;
    this.sortBy = sortBy;
  }

    
  @JsonProperty("date_availability")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

    
  @JsonProperty("pins")
  public List<TopPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }
  public void setPins(List<TopPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

    
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
    return Objects.equals(dateAvailability, topPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(pins, topPinsAnalyticsResponse.pins) &&
        Objects.equals(sortBy, topPinsAnalyticsResponse.sortBy);
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
