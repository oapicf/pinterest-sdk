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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BidFloor {
  
  @SerializedName("bid_floors")
  private List<Integer> bidFloors = null;
  @SerializedName("type")
  private String type = bidfloor;

  /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   **/
  @ApiModelProperty(value = "A list of bid floors in micro currency. For example, [100000, 200000]")
  public List<Integer> getBidFloors() {
    return bidFloors;
  }
  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  /**
   * Always the string 'bidfloor'
   **/
  @ApiModelProperty(value = "Always the string 'bidfloor'")
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
    return (this.bidFloors == null ? bidFloor.bidFloors == null : this.bidFloors.equals(bidFloor.bidFloors)) &&
        (this.type == null ? bidFloor.type == null : this.type.equals(bidFloor.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bidFloors == null ? 0: this.bidFloors.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloor {\n");
    
    sb.append("  bidFloors: ").append(bidFloors).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
