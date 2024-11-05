package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArrayItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMemberAssetsResultsResponseArray  {
  
  @ApiModelProperty(value = "List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.")
  @Valid
 /**
   * List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
  **/
  private List<@Valid UpdateMemberAssetsResultsResponseArrayItemsInner> items = new ArrayList<>();
 /**
   * List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid UpdateMemberAssetsResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

  public UpdateMemberAssetsResultsResponseArray items(List<@Valid UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public UpdateMemberAssetsResultsResponseArray addItemsItem(UpdateMemberAssetsResultsResponseArrayItemsInner itemsItem) {
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
    UpdateMemberAssetsResultsResponseArray updateMemberAssetsResultsResponseArray = (UpdateMemberAssetsResultsResponseArray) o;
    return Objects.equals(this.items, updateMemberAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetsResultsResponseArray {\n");
    
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

