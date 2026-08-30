package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Product tag request item containing the pin_id of the product to tag.
 */
@ApiModel(description="Product tag request item containing the pin_id of the product to tag.")

public class ProductTagItem  {
  
 /**
  * Pin ID of the product pin to tag onto the hero pin.
  */
  @ApiModelProperty(required = true, value = "Pin ID of the product pin to tag onto the hero pin.")

  private String pinId;
 /**
   * Pin ID of the product pin to tag onto the hero pin.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public ProductTagItem pinId(String pinId) {
    this.pinId = pinId;
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
    ProductTagItem productTagItem = (ProductTagItem) o;
    return Objects.equals(this.pinId, productTagItem.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagItem {\n");
    
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

