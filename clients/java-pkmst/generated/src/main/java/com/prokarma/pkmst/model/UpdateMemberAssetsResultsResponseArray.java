package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateMemberAssetsResultsResponseArrayItemsInner;
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
 * UpdateMemberAssetsResultsResponseArray
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetsResultsResponseArray   {
  @JsonProperty("items")
  
  private List<UpdateMemberAssetsResultsResponseArrayItemsInner> items = null;

  public UpdateMemberAssetsResultsResponseArray items(List<UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public UpdateMemberAssetsResultsResponseArray addItemsItem(UpdateMemberAssetsResultsResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
   * @return items
   */
  @ApiModelProperty(value = "List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.")
  public List<UpdateMemberAssetsResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

