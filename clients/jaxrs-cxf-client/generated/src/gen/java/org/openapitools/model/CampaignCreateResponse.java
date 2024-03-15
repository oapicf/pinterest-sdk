package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignCreateResponseItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignCreateResponse  {
  
  @ApiModelProperty(value = "")
  private List<CampaignCreateResponseItem> items;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<CampaignCreateResponseItem> getItems() {
    return items;
  }

  public void setItems(List<CampaignCreateResponseItem> items) {
    this.items = items;
  }

  public CampaignCreateResponse items(List<CampaignCreateResponseItem> items) {
    this.items = items;
    return this;
  }

  public CampaignCreateResponse addItemsItem(CampaignCreateResponseItem itemsItem) {
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
    CampaignCreateResponse campaignCreateResponse = (CampaignCreateResponse) o;
    return Objects.equals(this.items, campaignCreateResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateResponse {\n");
    
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

