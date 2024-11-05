package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateInvitesResultsResponseArrayItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateInvitesResultsResponseArray  {
  
  @ApiModelProperty(value = "List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.")
  @Valid
 /**
   * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  **/
  private List<@Valid CreateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>();
 /**
   * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid CreateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid CreateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

  public CreateInvitesResultsResponseArray items(List<@Valid CreateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public CreateInvitesResultsResponseArray addItemsItem(CreateInvitesResultsResponseArrayItemsInner itemsItem) {
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
    CreateInvitesResultsResponseArray createInvitesResultsResponseArray = (CreateInvitesResultsResponseArray) o;
    return Objects.equals(this.items, createInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArray {\n");
    
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

