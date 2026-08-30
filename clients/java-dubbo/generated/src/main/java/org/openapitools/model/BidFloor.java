package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Bid floor request and response model.
 */
public class BidFloor implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   */
  @JsonProperty("bid_floors")
  private List<Integer> bidFloors = new ArrayList<>();

  /**
   * Always the string &#39;bidfloor&#39;.
   */
  @JsonProperty("type")
  private String type = "bidfloor";

  /**
   * A list of bid floors in micro currency. For example, [100000, 200000]
   * @return bidFloors
   */
  public List<Integer> getBidFloors() {
    return bidFloors;
  }

  public void setBidFloors(List<Integer> bidFloors) {
    this.bidFloors = bidFloors;
  }

  /**
   * Always the string &#39;bidfloor&#39;.
   * @return type
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
