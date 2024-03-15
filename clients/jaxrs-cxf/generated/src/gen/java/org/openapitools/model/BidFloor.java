package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BidFloor  {
  
  @ApiModelProperty(example = "[100000,200000]", value = "A list of bid floors in micro currency. For example, [100000, 200000]")
 /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
  **/
  private List<Integer> bidFloors;

  @ApiModelProperty(example = "bidfloor", value = "Always the string 'bidfloor'")
 /**
   * Always the string 'bidfloor'
  **/
  private String type = "bidfloor";
 /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   * @return bidFloors
  **/
  @JsonProperty("bid_floors")
  public List<Integer> getBidFloors() {
    return bidFloors;
  }

  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  public BidFloor bidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
    return this;
  }

  public BidFloor addBidFloorsItem(Integer bidFloorsItem) {
    this.bidFloors.add(bidFloorsItem);
    return this;
  }

 /**
   * Always the string &#39;bidfloor&#39;
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BidFloor type(String type) {
    this.type = type;
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
    BidFloor bidFloor = (BidFloor) o;
    return Objects.equals(this.bidFloors, bidFloor.bidFloors) &&
        Objects.equals(this.type, bidFloor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidFloors, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloor {\n");
    
    sb.append("    bidFloors: ").append(toIndentedString(bidFloors)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

