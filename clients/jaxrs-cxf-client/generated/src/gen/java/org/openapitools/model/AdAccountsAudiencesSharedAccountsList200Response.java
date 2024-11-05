package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SharedAudienceAccount;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountsAudiencesSharedAccountsList200Response  {
  
  @ApiModelProperty(required = true, value = "")
  private List<SharedAudienceAccount> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<SharedAudienceAccount> getItems() {
    return items;
  }

  public void setItems(List<SharedAudienceAccount> items) {
    this.items = items;
  }

  public AdAccountsAudiencesSharedAccountsList200Response items(List<SharedAudienceAccount> items) {
    this.items = items;
    return this;
  }

  public AdAccountsAudiencesSharedAccountsList200Response addItemsItem(SharedAudienceAccount itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get bookmark
   * @return bookmark
  **/
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public AdAccountsAudiencesSharedAccountsList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
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
    AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList200Response = (AdAccountsAudiencesSharedAccountsList200Response) o;
    return Objects.equals(this.items, adAccountsAudiencesSharedAccountsList200Response.items) &&
        Objects.equals(this.bookmark, adAccountsAudiencesSharedAccountsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudiencesSharedAccountsList200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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

