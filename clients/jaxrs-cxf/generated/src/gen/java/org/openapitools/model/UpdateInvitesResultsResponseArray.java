package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateInvitesResultsResponseArrayItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateInvitesResultsResponseArray  {
  
  @ApiModelProperty(value = "List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.")
  @Valid
 /**
   * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  **/
  private List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>();
 /**
   * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid UpdateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

  public UpdateInvitesResultsResponseArray items(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public UpdateInvitesResultsResponseArray addItemsItem(UpdateInvitesResultsResponseArrayItemsInner itemsItem) {
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
    UpdateInvitesResultsResponseArray updateInvitesResultsResponseArray = (UpdateInvitesResultsResponseArray) o;
    return Objects.equals(this.items, updateInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvitesResultsResponseArray {\n");
    
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

