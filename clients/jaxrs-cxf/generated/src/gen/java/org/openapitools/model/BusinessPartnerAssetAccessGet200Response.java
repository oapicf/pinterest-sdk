package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPartnerAssetsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessPartnerAssetAccessGet200Response  {
  
  @ApiModelProperty(required = true, value = "List assets on which you granted access to your partner or assets on which your partner has granted you access.")
  @Valid
 /**
   * List assets on which you granted access to your partner or assets on which your partner has granted you access.
  **/
  private List<@Valid GetPartnerAssetsResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * List assets on which you granted access to your partner or assets on which your partner has granted you access.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid GetPartnerAssetsResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GetPartnerAssetsResponse> items) {
    this.items = items;
  }

  public BusinessPartnerAssetAccessGet200Response items(List<@Valid GetPartnerAssetsResponse> items) {
    this.items = items;
    return this;
  }

  public BusinessPartnerAssetAccessGet200Response addItemsItem(GetPartnerAssetsResponse itemsItem) {
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

  public BusinessPartnerAssetAccessGet200Response bookmark(String bookmark) {
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
    BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet200Response = (BusinessPartnerAssetAccessGet200Response) o;
    return Objects.equals(this.items, businessPartnerAssetAccessGet200Response.items) &&
        Objects.equals(this.bookmark, businessPartnerAssetAccessGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPartnerAssetAccessGet200Response {\n");
    
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

