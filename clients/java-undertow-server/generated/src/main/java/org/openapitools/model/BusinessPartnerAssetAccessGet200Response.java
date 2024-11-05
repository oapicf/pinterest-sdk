/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPartnerAssetsResponse;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessPartnerAssetAccessGet200Response   {
  
  private List<GetPartnerAssetsResponse> items = new ArrayList<>();
  private String bookmark;

  /**
   * List assets on which you granted access to your partner or assets on which your partner has granted you access.
   */
  public BusinessPartnerAssetAccessGet200Response items(List<GetPartnerAssetsResponse> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List assets on which you granted access to your partner or assets on which your partner has granted you access.")
  @JsonProperty("items")
  public List<GetPartnerAssetsResponse> getItems() {
    return items;
  }
  public void setItems(List<GetPartnerAssetsResponse> items) {
    this.items = items;
  }

  /**
   */
  public BusinessPartnerAssetAccessGet200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }
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
    BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet200Response = (BusinessPartnerAssetAccessGet200Response) o;
    return Objects.equals(items, businessPartnerAssetAccessGet200Response.items) &&
        Objects.equals(bookmark, businessPartnerAssetAccessGet200Response.bookmark);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

