/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.client.model.TopVideoPinsAnalyticsResponsePinsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TopVideoPinsAnalyticsResponse {
  
  @SerializedName("date_availability")
  private TopPinsAnalyticsResponseDateAvailability dateAvailability = null;
  @SerializedName("pins")
  private List<TopVideoPinsAnalyticsResponsePinsInner> pins = null;
  public enum SortByEnum {
     SAVE,  IMPRESSION,  OUTBOUND_CLICK,  VIDEO_MRC_VIEW,  VIDEO_AVG_WATCH_TIME,  VIDEO_V50_WATCH_TIME,  QUARTILE_95_PERCENT_VIEW,  VIDEO_10S_VIEW,  VIDEO_START, 
  };
  @SerializedName("sort_by")
  private SortByEnum sortBy = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TopVideoPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }
  public void setPins(List<TopVideoPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.dateAvailability == null ? topVideoPinsAnalyticsResponse.dateAvailability == null : this.dateAvailability.equals(topVideoPinsAnalyticsResponse.dateAvailability)) &&
        (this.pins == null ? topVideoPinsAnalyticsResponse.pins == null : this.pins.equals(topVideoPinsAnalyticsResponse.pins)) &&
        (this.sortBy == null ? topVideoPinsAnalyticsResponse.sortBy == null : this.sortBy.equals(topVideoPinsAnalyticsResponse.sortBy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dateAvailability == null ? 0: this.dateAvailability.hashCode());
    result = 31 * result + (this.pins == null ? 0: this.pins.hashCode());
    result = 31 * result + (this.sortBy == null ? 0: this.sortBy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopVideoPinsAnalyticsResponse {\n");
    
    sb.append("  dateAvailability: ").append(dateAvailability).append("\n");
    sb.append("  pins: ").append(pins).append("\n");
    sb.append("  sortBy: ").append(sortBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
