package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CancelInviteResultItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelInvitesResponse  {
  
  @ApiModelProperty(value = "")

  private List<CancelInviteResultItem> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<CancelInviteResultItem> getItems() {
    return items;
  }

  public void setItems(List<CancelInviteResultItem> items) {
    this.items = items;
  }

  public CancelInvitesResponse items(List<CancelInviteResultItem> items) {
    this.items = items;
    return this;
  }

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

