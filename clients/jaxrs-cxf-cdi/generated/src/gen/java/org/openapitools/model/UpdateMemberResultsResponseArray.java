package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberResult;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UpdateMemberResultsResponseArray   {
  
  private List<@Valid UpdateMemberResult> items = new ArrayList<>();

  /**
   * List of members with updated business access role.
   **/
  public UpdateMemberResultsResponseArray items(List<@Valid UpdateMemberResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of members with updated business access role.")
  @JsonProperty("items")
  public List<@Valid UpdateMemberResult> getItems() {
    return items;
  }
  public void setItems(List<@Valid UpdateMemberResult> items) {
    this.items = items;
  }

  public UpdateMemberResultsResponseArray addItemsItem(UpdateMemberResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

