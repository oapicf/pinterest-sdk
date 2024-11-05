package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */
@ApiModel(description="Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id")

public class DeleteInvitesResultsResponseArray  {
  
 /**
  * List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
  */
  @ApiModelProperty(value = "List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.")
  @Valid
  private List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items = new ArrayList<>();
 /**
  * List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid DeleteInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public DeleteInvitesResultsResponseArray items(List<@Valid DeleteInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public DeleteInvitesResultsResponseArray addItemsItem(DeleteInvitesResultsResponseArrayItemsInner itemsItem) {
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
    DeleteInvitesResultsResponseArray deleteInvitesResultsResponseArray = (DeleteInvitesResultsResponseArray) o;
    return Objects.equals(this.items, deleteInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInvitesResultsResponseArray {\n");
    
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

