package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CancelInviteResultItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelInvitesResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid CancelInviteResultItem> items = new ArrayList<>();
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid CancelInviteResultItem> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid CancelInviteResultItem> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public CancelInvitesResponse items(List<@Valid CancelInviteResultItem> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public CancelInvitesResponse addItemsItem(CancelInviteResultItem itemsItem) {
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
    CancelInvitesResponse cancelInvitesResponse = (CancelInvitesResponse) o;
    return Objects.equals(this.items, cancelInvitesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInvitesResponse {\n");
    
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

