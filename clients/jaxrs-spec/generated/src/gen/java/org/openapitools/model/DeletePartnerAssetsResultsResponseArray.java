package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeletePartnerAssetsResultsResponseArray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetsResultsResponseArray   {
  private @Valid List<DeletePartnerAssetsResult> items = new ArrayList<>();

  /**
   * List of terminated asset access.
   **/
  public DeletePartnerAssetsResultsResponseArray items(List<DeletePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of terminated asset access.")
  @JsonProperty("items")
  @Valid public List<@Valid DeletePartnerAssetsResult> getItems() {
    return items;
  }

  @JsonProperty("items")
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

  public DeletePartnerAssetsResultsResponseArray removeItemsItem(DeletePartnerAssetsResult itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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

