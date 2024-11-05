package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMemberResultsResponseArray  {
  
  @ApiModelProperty(value = "List of members with updated business access role.")
 /**
   * List of members with updated business access role.
  **/
  private List<UpdateMemberResult> items = new ArrayList<>();
 /**
   * List of members with updated business access role.
   * @return items
  **/
  @JsonProperty("items")
  public List<UpdateMemberResult> getItems() {
    return items;
  }

  public void setItems(List<UpdateMemberResult> items) {
    this.items = items;
  }

  public UpdateMemberResultsResponseArray items(List<UpdateMemberResult> items) {
    this.items = items;
    return this;
  }

  public UpdateMemberResultsResponseArray addItemsItem(UpdateMemberResult itemsItem) {
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
    UpdateMemberResultsResponseArray updateMemberResultsResponseArray = (UpdateMemberResultsResponseArray) o;
    return Objects.equals(this.items, updateMemberResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberResultsResponseArray {\n");
    
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

