package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnerAssetAccessResultsResponseArray  {
  
 /**
  * List of terminated partner asset accesses.
  */
  @ApiModelProperty(value = "List of terminated partner asset accesses.")

  private List<DeletePartnerAssetAccessResult> items = new ArrayList<>();
 /**
   * List of terminated partner asset accesses.
   * @return items
  **/
  @JsonProperty("items")
  public List<DeletePartnerAssetAccessResult> getItems() {
    return items;
  }

  public void setItems(List<DeletePartnerAssetAccessResult> items) {
    this.items = items;
  }

  public DeletePartnerAssetAccessResultsResponseArray items(List<DeletePartnerAssetAccessResult> items) {
    this.items = items;
    return this;
  }

  public DeletePartnerAssetAccessResultsResponseArray addItemsItem(DeletePartnerAssetAccessResult itemsItem) {
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
    DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessResultsResponseArray = (DeletePartnerAssetAccessResultsResponseArray) o;
    return Objects.equals(this.items, deletePartnerAssetAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResultsResponseArray {\n");
    
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

