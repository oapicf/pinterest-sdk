package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetsResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnerAssetsResultsResponseArray  {
  
  @ApiModelProperty(value = "List of terminated asset access.")
 /**
   * List of terminated asset access.
  **/
  private List<DeletePartnerAssetsResult> items = new ArrayList<>();
 /**
   * List of terminated asset access.
   * @return items
  **/
  @JsonProperty("items")
  public List<DeletePartnerAssetsResult> getItems() {
    return items;
  }

  public void setItems(List<DeletePartnerAssetsResult> items) {
    this.items = items;
  }

  public DeletePartnerAssetsResultsResponseArray items(List<DeletePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  public DeletePartnerAssetsResultsResponseArray addItemsItem(DeletePartnerAssetsResult itemsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

