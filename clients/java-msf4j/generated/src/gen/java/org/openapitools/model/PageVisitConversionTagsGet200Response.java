package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventResponse;

/**
 * PageVisitConversionTagsGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PageVisitConversionTagsGet200Response   {
  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<@Valid ConversionEventResponse> items = new ArrayList<>();

  public PageVisitConversionTagsGet200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

   /**
   * Get bookmark
   * @return bookmark
  **/
  @ApiModelProperty(value = "")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public PageVisitConversionTagsGet200Response items(List<@Valid ConversionEventResponse> items) {
    this.items = items;
    return this;
  }

  public PageVisitConversionTagsGet200Response addItemsItem(ConversionEventResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid ConversionEventResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid ConversionEventResponse> items) {
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
    PageVisitConversionTagsGet200Response pageVisitConversionTagsGet200Response = (PageVisitConversionTagsGet200Response) o;
    return Objects.equals(this.bookmark, pageVisitConversionTagsGet200Response.bookmark) &&
        Objects.equals(this.items, pageVisitConversionTagsGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageVisitConversionTagsGet200Response {\n");
    
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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

