package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("DeletePartnerAssetAccessResultsResponseArray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessResultsResponseArray   {
  private @Valid List<@Valid DeletePartnerAssetAccessResult> items = new ArrayList<>();

  public DeletePartnerAssetAccessResultsResponseArray() {
  }

  /**
   * List of terminated partner asset accesses.
   **/
  public DeletePartnerAssetAccessResultsResponseArray items(List<@Valid DeletePartnerAssetAccessResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of terminated partner asset accesses.")
  @JsonProperty("items")
  @Valid public List<@Valid DeletePartnerAssetAccessResult> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid DeletePartnerAssetAccessResult> items) {
    this.items = items;
  }

  public DeletePartnerAssetAccessResultsResponseArray addItemsItem(DeletePartnerAssetAccessResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public DeletePartnerAssetAccessResultsResponseArray removeItemsItem(DeletePartnerAssetAccessResult itemsItem) {
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
