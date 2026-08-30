package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchItem;

/**
 * Response model for batch campaign write operations.
 */
@ApiModel(description = "Response model for batch campaign write operations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchWriteResponseModel   {
  @JsonProperty("items")
  private List<@Valid CampaignBatchItem> items = new ArrayList<>();

  public CampaignBatchWriteResponseModel items(List<@Valid CampaignBatchItem> items) {
    this.items = items;
    return this;
  }

  public CampaignBatchWriteResponseModel addItemsItem(CampaignBatchItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid CampaignBatchItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid CampaignBatchItem> items) {
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

