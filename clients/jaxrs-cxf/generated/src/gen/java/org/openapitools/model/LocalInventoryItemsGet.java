package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocalInventoryItemResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for getting local inventory items
 */
@ApiModel(description="Model for getting local inventory items")

public class LocalInventoryItemsGet  {
  
 /**
  * Array of local inventory items
  */
  @ApiModelProperty(required = true, value = "Array of local inventory items")

  @Valid

  private List<@Valid LocalInventoryItemResponse> items = new ArrayList<>();
 /**
   * Array of local inventory items
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid LocalInventoryItemResponse> getItems() {
    return items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalInventoryItemsGet localInventoryItemsGet = (LocalInventoryItemsGet) o;
    return Objects.equals(this.items, localInventoryItemsGet.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsGet {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

