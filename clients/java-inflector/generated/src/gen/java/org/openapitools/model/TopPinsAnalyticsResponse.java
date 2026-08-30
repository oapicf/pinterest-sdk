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
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopPinsSortBy;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TopPinsAnalyticsResponse   {
  @JsonProperty("date_availability")
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  @JsonProperty("pins")
  private List<TopPinsAnalyticsResponsePinsItems> pins = null;

  @JsonProperty("sort_by")
  private TopPinsSortBy sortBy;

  /**
   **/
  public TopPinsAnalyticsResponse dateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("date_availability")
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   **/
  public TopPinsAnalyticsResponse pins(List<TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pins")
  public List<TopPinsAnalyticsResponsePinsItems> getPins() {
    return pins;
  }
  public void setPins(List<TopPinsAnalyticsResponsePinsItems> pins) {
    this.pins = pins;
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

