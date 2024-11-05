package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.vertxweb.server.model.TopVideoPinsAnalyticsResponsePinsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopVideoPinsAnalyticsResponse   {
  
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;
  private List<TopVideoPinsAnalyticsResponsePinsInner> pins = new ArrayList<>();


  public enum SortByEnum {
    SAVE("SAVE"),
    IMPRESSION("IMPRESSION"),
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    VIDEO_10_S_VIEW("VIDEO_10S_VIEW"),
    VIDEO_START("VIDEO_START");

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

  public TopVideoPinsAnalyticsResponse () {

  }

  public TopVideoPinsAnalyticsResponse (TopPinsAnalyticsResponseDateAvailability dateAvailability, List<TopVideoPinsAnalyticsResponsePinsInner> pins, SortByEnum sortBy) {
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
  public List<TopVideoPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }
  public void setPins(List<TopVideoPinsAnalyticsResponsePinsInner> pins) {
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
    TopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = (TopVideoPinsAnalyticsResponse) o;
    return Objects.equals(dateAvailability, topVideoPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(pins, topVideoPinsAnalyticsResponse.pins) &&
        Objects.equals(sortBy, topVideoPinsAnalyticsResponse.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAvailability, pins, sortBy);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
