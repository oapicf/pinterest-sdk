package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOOrderLine;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SsioOrderLinesGetByAdAccount200Response
 */

@JsonTypeName("ssio_order_lines_get_by_ad_account_200_response")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SsioOrderLinesGetByAdAccount200Response {

  @Valid
  private List<@Valid SSIOOrderLine> items = new ArrayList<>();

  private JsonNullable<String> bookmark = JsonNullable.<String>undefined();

  public SsioOrderLinesGetByAdAccount200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SsioOrderLinesGetByAdAccount200Response(List<@Valid SSIOOrderLine> items) {
    this.items = items;
  }

  public SsioOrderLinesGetByAdAccount200Response items(List<@Valid SSIOOrderLine> items) {
    this.items = items;
    return this;
  }

  public SsioOrderLinesGetByAdAccount200Response addItemsItem(SSIOOrderLine itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * SSIO order lines by ad acount id
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "SSIO order lines by ad acount id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid SSIOOrderLine> getItems() {
    return items;
  }

  public void setItems(List<@Valid SSIOOrderLine> items) {
    this.items = items;
  }

  public SsioOrderLinesGetByAdAccount200Response bookmark(String bookmark) {
    this.bookmark = JsonNullable.of(bookmark);
    return this;
  }

  /**
   * Get bookmark
   * @return bookmark
  */
  
  @Schema(name = "bookmark", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookmark")
  public JsonNullable<String> getBookmark() {
    return bookmark;
  }

  public void setBookmark(JsonNullable<String> bookmark) {
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
    SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount200Response = (SsioOrderLinesGetByAdAccount200Response) o;
    return Objects.equals(this.items, ssioOrderLinesGetByAdAccount200Response.items) &&
        equalsNullable(this.bookmark, ssioOrderLinesGetByAdAccount200Response.bookmark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, hashCodeNullable(bookmark));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioOrderLinesGetByAdAccount200Response {\n");
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

