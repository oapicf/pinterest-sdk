package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SharedAudienceAccount;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ad_accounts_audiences_shared_accounts_list_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-26T05:38:03.166641305Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountsAudiencesSharedAccountsList200Response   {
  private @Valid List<@Valid SharedAudienceAccount> items = new ArrayList<>();
  private String bookmark;

  public AdAccountsAudiencesSharedAccountsList200Response() {
  }

  @JsonCreator
  public AdAccountsAudiencesSharedAccountsList200Response(
    @JsonProperty(required = true, value = "items") List<@Valid SharedAudienceAccount> items
  ) {
    this.items = items;
  }

  /**
   **/
  public AdAccountsAudiencesSharedAccountsList200Response items(List<@Valid SharedAudienceAccount> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid SharedAudienceAccount> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid SharedAudienceAccount> items) {
    this.items = items;
  }

  public AdAccountsAudiencesSharedAccountsList200Response addItemsItem(SharedAudienceAccount itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public AdAccountsAudiencesSharedAccountsList200Response removeItemsItem(SharedAudienceAccount itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
  /**
   **/
  public AdAccountsAudiencesSharedAccountsList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  @JsonProperty("bookmark")
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

