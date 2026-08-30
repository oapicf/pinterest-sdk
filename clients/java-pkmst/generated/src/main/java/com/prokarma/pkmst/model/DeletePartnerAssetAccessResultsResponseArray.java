package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DeletePartnerAssetAccessResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeletePartnerAssetAccessResultsResponseArray
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessResultsResponseArray   {
  @JsonProperty("items")
  
  private List<DeletePartnerAssetAccessResult> items = null;

  public DeletePartnerAssetAccessResultsResponseArray items(List<DeletePartnerAssetAccessResult> items) {
    this.items = items;
    return this;
  }

  public DeletePartnerAssetAccessResultsResponseArray addItemsItem(DeletePartnerAssetAccessResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of terminated partner asset accesses.
   * @return items
   */
  @ApiModelProperty(value = "List of terminated partner asset accesses.")
  public List<DeletePartnerAssetAccessResult> getItems() {
    return items;
  }

  public void setItems(List<DeletePartnerAssetAccessResult> items) {
    this.items = items;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

