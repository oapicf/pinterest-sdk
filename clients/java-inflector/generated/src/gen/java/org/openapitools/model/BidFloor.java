package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BidFloor   {
  @JsonProperty("bid_floors")
  private List<Integer> bidFloors = null;

  @JsonProperty("type")
  private String type = "bidfloor";

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
  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  /**
   * Always the string 'bidfloor'
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
    return Objects.equals(bidFloors, bidFloor.bidFloors) &&
        Objects.equals(type, bidFloor.type);
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

