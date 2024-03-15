package apimodels;

import apimodels.CatalogsProductGroupsList200ResponseAllOfItemsInner;
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
 * CatalogsProductGroupsList200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupsList200Response   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items = new ArrayList<>();

  @JsonProperty("bookmark")
  
  private String bookmark;

  public CatalogsProductGroupsList200Response items(List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items) {
    this.items = items;
    return this;
  }

  public CatalogsProductGroupsList200Response addItemsItem(CatalogsProductGroupsList200ResponseAllOfItemsInner itemsItem) {
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
  public List<CatalogsProductGroupsList200ResponseAllOfItemsInner> getItems() {
    return items;
  }

  public void setItems(List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items) {
    this.items = items;
  }

  public CatalogsProductGroupsList200Response bookmark(String bookmark) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupsList200Response catalogsProductGroupsList200Response = (CatalogsProductGroupsList200Response) o;
    return Objects.equals(items, catalogsProductGroupsList200Response.items) &&
        Objects.equals(bookmark, catalogsProductGroupsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsList200Response {\n");
    
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

