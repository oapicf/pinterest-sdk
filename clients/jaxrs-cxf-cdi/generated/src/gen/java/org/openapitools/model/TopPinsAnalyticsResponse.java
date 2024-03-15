package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class TopPinsAnalyticsResponse   {
  
  private TopPinsAnalyticsResponseDateAvailability dateAvailability;

  private List<@Valid TopPinsAnalyticsResponsePinsInner> pins;


public enum SortByEnum {

    @JsonProperty("ENGAGEMENT") ENGAGEMENT(String.valueOf("ENGAGEMENT")), @JsonProperty("SAVE") SAVE(String.valueOf("SAVE")), @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), @JsonProperty("PIN_CLICK") PIN_CLICK(String.valueOf("PIN_CLICK"));


    private String value;

    SortByEnum(String v) {
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

  private SortByEnum sortBy;

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
  public TopPinsAnalyticsResponse pins(List<@Valid TopPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pins")
  public List<@Valid TopPinsAnalyticsResponsePinsInner> getPins() {
    return pins;
  }
  public void setPins(List<@Valid TopPinsAnalyticsResponsePinsInner> pins) {
    this.pins = pins;
  }

  public TopPinsAnalyticsResponse addPinsItem(TopPinsAnalyticsResponsePinsInner pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }


  /**
   **/
  public TopPinsAnalyticsResponse sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

