package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TopVideoPinsAnalyticsResponse  {
  
  @ApiModelProperty(value = "")
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @ApiModelProperty(value = "")
  private List<TopVideoPinsAnalyticsResponsePinsInner> pins;

public enum SortByEnum {

SAVE(String.valueOf("SAVE")), IMPRESSION(String.valueOf("IMPRESSION")), OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), VIDEO_MRC_VIEW(String.valueOf("VIDEO_MRC_VIEW")), VIDEO_AVG_WATCH_TIME(String.valueOf("VIDEO_AVG_WATCH_TIME")), VIDEO_V50_WATCH_TIME(String.valueOf("VIDEO_V50_WATCH_TIME")), QUARTILE_95_PERCENT_VIEW(String.valueOf("QUARTILE_95_PERCENT_VIEW")), VIDEO_10S_VIEW(String.valueOf("VIDEO_10S_VIEW")), VIDEO_START(String.valueOf("VIDEO_START"));


    private String value;

    SortByEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SortByEnum fromValue(String value) {
        for (SortByEnum b : SortByEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "IMPRESSION", value = "")
  private SortByEnum sortBy;
 /**
   * Get dateAvailability
   * @return dateAvailability
  **/
  @JsonProperty("date_availability")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }

  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  public TopVideoPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

 /**
   * Get pins
   * @return pins
  **/
  @JsonProperty("pins")
  public List<TopVideoPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }

  public void setPins(List<TopVideoPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

  public TopVideoPinsAnalyticsResponse pins(List<TopVideoPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
    return this;
  }

  public TopVideoPinsAnalyticsResponse addPinsItem(TopVideoPinsAnalyticsResponsePinsInner pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
   * Get sortBy
   * @return sortBy
  **/
  @JsonProperty("sort_by")
  public String getSortBy() {
    if (sortBy == null) {
      return null;
    }
    return sortBy.value();
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }

  public TopVideoPinsAnalyticsResponse sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
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
    return Objects.equals(this.dateAvailability, topVideoPinsAnalyticsResponse.dateAvailability) &&
        Objects.equals(this.pins, topVideoPinsAnalyticsResponse.pins) &&
        Objects.equals(this.sortBy, topVideoPinsAnalyticsResponse.sortBy);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

