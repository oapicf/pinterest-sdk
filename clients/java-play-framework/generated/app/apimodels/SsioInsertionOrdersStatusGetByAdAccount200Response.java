package apimodels;

import apimodels.SSIOInsertionOrderStatus;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SsioInsertionOrdersStatusGetByAdAccount200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SsioInsertionOrdersStatusGetByAdAccount200Response   {
  @JsonProperty("bookmark")
  
  private String bookmark;

  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid SSIOInsertionOrderStatus> items = new ArrayList<>();

  public SsioInsertionOrdersStatusGetByAdAccount200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

   /**
   * Get bookmark
   * @return bookmark
  **/
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public SsioInsertionOrdersStatusGetByAdAccount200Response items(List<@Valid SSIOInsertionOrderStatus> items) {
    this.items = items;
    return this;
  }

  public SsioInsertionOrdersStatusGetByAdAccount200Response addItemsItem(SSIOInsertionOrderStatus itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<@Valid SSIOInsertionOrderStatus> getItems() {
    return items;
  }

  public void setItems(List<@Valid SSIOInsertionOrderStatus> items) {
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
    SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount200Response = (SsioInsertionOrdersStatusGetByAdAccount200Response) o;
    return Objects.equals(bookmark, ssioInsertionOrdersStatusGetByAdAccount200Response.bookmark) &&
        Objects.equals(items, ssioInsertionOrdersStatusGetByAdAccount200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioInsertionOrdersStatusGetByAdAccount200Response {\n");
    
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

