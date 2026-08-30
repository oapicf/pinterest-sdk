package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Response model for batch campaign write operations.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Response model for batch campaign write operations.")
public class CampaignBatchWriteResponseModel   {
  
  private List<@Valid CampaignBatchItem> items = new ArrayList<>();

  /**
   **/
  public CampaignBatchWriteResponseModel items(List<@Valid CampaignBatchItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  public List<@Valid CampaignBatchItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid CampaignBatchItem> items) {
    this.items = items;
  }

  public CampaignBatchWriteResponseModel addItemsItem(CampaignBatchItem itemsItem) {
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
    CampaignBatchWriteResponseModel campaignBatchWriteResponseModel = (CampaignBatchWriteResponseModel) o;
    return Objects.equals(this.items, campaignBatchWriteResponseModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchWriteResponseModel {\n");
    
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

