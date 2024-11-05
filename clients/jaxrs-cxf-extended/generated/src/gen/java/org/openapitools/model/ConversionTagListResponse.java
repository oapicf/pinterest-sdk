package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionTagResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagListResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid ConversionTagResponse> items = new ArrayList<>();
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid ConversionTagResponse> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ConversionTagResponse> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ConversionTagListResponse items(List<@Valid ConversionTagResponse> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ConversionTagListResponse addItemsItem(ConversionTagResponse itemsItem) {
    this.items.add(itemsItem);
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
    ConversionTagListResponse conversionTagListResponse = (ConversionTagListResponse) o;
    return Objects.equals(this.items, conversionTagListResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagListResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

