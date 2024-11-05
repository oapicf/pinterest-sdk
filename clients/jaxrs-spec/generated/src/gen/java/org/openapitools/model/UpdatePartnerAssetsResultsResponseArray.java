package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetsResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdatePartnerAssetsResultsResponseArray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetsResultsResponseArray   {
  private @Valid List<UpdatePartnerAssetsResult> items = new ArrayList<>();

  /**
   * List of assigned/updated partner asset access.
   **/
  public UpdatePartnerAssetsResultsResponseArray items(List<UpdatePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of assigned/updated partner asset access.")
  @JsonProperty("items")
  @Valid public List<@Valid UpdatePartnerAssetsResult> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<UpdatePartnerAssetsResult> items) {
    this.items = items;
  }

  public UpdatePartnerAssetsResultsResponseArray addItemsItem(UpdatePartnerAssetsResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public UpdatePartnerAssetsResultsResponseArray removeItemsItem(UpdatePartnerAssetsResult itemsItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

