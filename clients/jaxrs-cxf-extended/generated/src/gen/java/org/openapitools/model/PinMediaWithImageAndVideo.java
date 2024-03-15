package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin with a mix of images and videos.
 */
@ApiModel(description="Pin with a mix of images and videos.")

public class PinMediaWithImageAndVideo extends PinMedia {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid PinMediaMetadata> items;
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid PinMediaMetadata> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid PinMediaMetadata> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public PinMediaWithImageAndVideo items(List<@Valid PinMediaMetadata> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public PinMediaWithImageAndVideo addItemsItem(PinMediaMetadata itemsItem) {
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
    PinMediaWithImageAndVideo pinMediaWithImageAndVideo = (PinMediaWithImageAndVideo) o;
    return super.equals(o) && Objects.equals(this.items, pinMediaWithImageAndVideo.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAndVideo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

