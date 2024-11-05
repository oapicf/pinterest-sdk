package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetsResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerAssetsResultsResponseArray  {
  
  @ApiModelProperty(value = "List of assigned/updated partner asset access.")
 /**
   * List of assigned/updated partner asset access.
  **/
  private List<UpdatePartnerAssetsResult> items = new ArrayList<>();
 /**
   * List of assigned/updated partner asset access.
   * @return items
  **/
  @JsonProperty("items")
  public List<UpdatePartnerAssetsResult> getItems() {
    return items;
  }

  public void setItems(List<UpdatePartnerAssetsResult> items) {
    this.items = items;
  }

  public UpdatePartnerAssetsResultsResponseArray items(List<UpdatePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  public UpdatePartnerAssetsResultsResponseArray addItemsItem(UpdatePartnerAssetsResult itemsItem) {
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
    UpdatePartnerAssetsResultsResponseArray updatePartnerAssetsResultsResponseArray = (UpdatePartnerAssetsResultsResponseArray) o;
    return Objects.equals(this.items, updatePartnerAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResultsResponseArray {\n");
    
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

