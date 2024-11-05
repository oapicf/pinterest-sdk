package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetsResult;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class DeletePartnerAssetsResultsResponseArray   {
  
  private List<DeletePartnerAssetsResult> items = new ArrayList<>();

  /**
   * List of terminated asset access.
   **/
  public DeletePartnerAssetsResultsResponseArray items(List<DeletePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of terminated asset access.")
  @JsonProperty("items")
  public List<DeletePartnerAssetsResult> getItems() {
    return items;
  }
  public void setItems(List<DeletePartnerAssetsResult> items) {
    this.items = items;
  }

  public DeletePartnerAssetsResultsResponseArray addItemsItem(DeletePartnerAssetsResult itemsItem) {
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
    DeletePartnerAssetsResultsResponseArray deletePartnerAssetsResultsResponseArray = (DeletePartnerAssetsResultsResponseArray) o;
    return Objects.equals(this.items, deletePartnerAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetsResultsResponseArray {\n");
    
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

