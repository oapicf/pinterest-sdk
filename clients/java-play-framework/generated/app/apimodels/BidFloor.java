package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BidFloor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

