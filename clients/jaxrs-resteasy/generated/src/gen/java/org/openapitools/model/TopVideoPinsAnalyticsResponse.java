package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopVideoPinsAnalyticsResponse   {
  
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;
  private List<@Valid TopVideoPinsAnalyticsResponsePinsInner> pins;

  /**
   * Gets or Sets sortBy
   */
  public enum SortByEnum {
    SAVE("SAVE"),

        IMPRESSION("IMPRESSION"),

        OUTBOUND_CLICK("OUTBOUND_CLICK"),

        VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),

        VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),

        VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),

        QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),

        VIDEO_10S_VIEW("VIDEO_10S_VIEW"),

        VIDEO_START("VIDEO_START");
    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SortByEnum sortBy;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date_availability")
  @Valid
  public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
    return dateAvailability;
  }
  public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
    this.dateAvailability = dateAvailability;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pins")
  @Valid
  public List<@Valid TopVideoPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }
  public void setPins(List<@Valid TopVideoPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

  /**
   **/
  
  @ApiModelProperty(example = "IMPRESSION", value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

