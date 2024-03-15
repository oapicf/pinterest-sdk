package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BidFloor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BidFloor   {
  private @Valid List<Integer> bidFloors;
  private @Valid String type = "bidfloor";

  /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   **/
  public BidFloor bidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
    return this;
  }

  
  @ApiModelProperty(example = "[100000,200000]", value = "A list of bid floors in micro currency. For example, [100000, 200000]")
  @JsonProperty("bid_floors")
  public List<Integer> getBidFloors() {
    return bidFloors;
  }

  @JsonProperty("bid_floors")
  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  public BidFloor addBidFloorsItem(Integer bidFloorsItem) {
    if (this.bidFloors == null) {
      this.bidFloors = new ArrayList<>();
    }

    this.bidFloors.add(bidFloorsItem);
    return this;
  }

  public BidFloor removeBidFloorsItem(Integer bidFloorsItem) {
    if (bidFloorsItem != null && this.bidFloors != null) {
      this.bidFloors.remove(bidFloorsItem);
    }

    return this;
  }
  /**
   * Always the string &#39;bidfloor&#39;
   **/
  public BidFloor type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "bidfloor", value = "Always the string 'bidfloor'")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
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

