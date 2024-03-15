package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BidFloor
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BidFloor   {
  @JsonProperty("bid_floors")
  
  private List<Integer> bidFloors = null;

  @JsonProperty("type")
  private String type = "bidfloor";

  public BidFloor bidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
    return this;
  }

  public BidFloor addBidFloorsItem(Integer bidFloorsItem) {
    if (this.bidFloors == null) {
      this.bidFloors = new ArrayList<>();
    }
    this.bidFloors.add(bidFloorsItem);
    return this;
  }

   /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   * @return bidFloors
  **/
  @ApiModelProperty(example = "[100000,200000]", value = "A list of bid floors in micro currency. For example, [100000, 200000]")
  public List<Integer> getBidFloors() {
    return bidFloors;
  }

  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  public BidFloor type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always the string 'bidfloor'
   * @return type
  **/
  @ApiModelProperty(example = "bidfloor", value = "Always the string 'bidfloor'")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

