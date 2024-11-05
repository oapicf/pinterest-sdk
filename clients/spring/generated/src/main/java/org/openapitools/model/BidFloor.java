package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BidFloor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BidFloor {

  @Valid
  private List<Integer> bidFloors = new ArrayList<>();

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
   */
  
  @Schema(name = "bid_floors", example = "[100000,200000]", description = "A list of bid floors in micro currency. For example, [100000, 200000]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_floors")
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
   */
  
  @Schema(name = "type", example = "bidfloor", description = "Always the string 'bidfloor'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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

