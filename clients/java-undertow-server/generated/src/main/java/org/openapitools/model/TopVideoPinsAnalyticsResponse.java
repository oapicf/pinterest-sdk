/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopVideoPinsSortBy;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopVideoPinsAnalyticsResponse   {
  
  private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;
  private List<TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();
  private TopVideoPinsSortBy sortBy;

  /**
   */
  public TopVideoPinsAnalyticsResponse dateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("date_availability")
  public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   */
  public TopVideoPinsAnalyticsResponse pins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pins")
  public List<TopVideoPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }
  public void setPins(List<TopVideoPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
  }

  /**
   */
  public TopVideoPinsAnalyticsResponse sortBy(TopVideoPinsSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sort_by")
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

