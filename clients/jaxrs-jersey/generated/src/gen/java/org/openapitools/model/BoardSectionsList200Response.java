/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import org.openapitools.model.BoardSection;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * BoardSectionsList200Response
 */
@JsonPropertyOrder({
  BoardSectionsList200Response.JSON_PROPERTY_ITEMS,
  BoardSectionsList200Response.JSON_PROPERTY_BOOKMARK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BoardSectionsList200Response   {
  public static final String JSON_PROPERTY_ITEMS = "items";
  @JsonProperty(JSON_PROPERTY_ITEMS)
  private List<@Valid BoardSection> items = new ArrayList<>();

  public static final String JSON_PROPERTY_BOOKMARK = "bookmark";
  @JsonProperty(JSON_PROPERTY_BOOKMARK)
  private String bookmark;

  public BoardSectionsList200Response items(List<@Valid BoardSection> items) {
    this.items = items;
    return this;
  }

  public BoardSectionsList200Response addItemsItem(BoardSection itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Board sections
   * @return items
   **/
  @JsonProperty(value = "items")
  @ApiModelProperty(required = true, value = "Board sections")
  @NotNull @Valid 
  public List<@Valid BoardSection> getItems() {
    return items;
  }

  public void setItems(List<@Valid BoardSection> items) {
    this.items = items;
  }

  public BoardSectionsList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  /**
   * Get bookmark
   * @return bookmark
   **/
  @JsonProperty(value = "bookmark")
  @ApiModelProperty(value = "")
  
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
    BoardSectionsList200Response boardSectionsList200Response = (BoardSectionsList200Response) o;
    return Objects.equals(this.items, boardSectionsList200Response.items) &&
        Objects.equals(this.bookmark, boardSectionsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSectionsList200Response {\n");
    
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
