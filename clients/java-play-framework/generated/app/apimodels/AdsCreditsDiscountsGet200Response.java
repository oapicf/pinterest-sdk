package apimodels;

import apimodels.AdsCreditDiscountsResponse;
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
 * AdsCreditsDiscountsGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsCreditsDiscountsGet200Response   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid AdsCreditDiscountsResponse> items = new ArrayList<>();

  @JsonProperty("bookmark")
  
  private String bookmark;

  public AdsCreditsDiscountsGet200Response items(List<@Valid AdsCreditDiscountsResponse> items) {
    this.items = items;
    return this;
  }

  public AdsCreditsDiscountsGet200Response addItemsItem(AdsCreditDiscountsResponse itemsItem) {
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
  public List<@Valid AdsCreditDiscountsResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdsCreditDiscountsResponse> items) {
    this.items = items;
  }

  public AdsCreditsDiscountsGet200Response bookmark(String bookmark) {
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
    AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet200Response = (AdsCreditsDiscountsGet200Response) o;
    return Objects.equals(items, adsCreditsDiscountsGet200Response.items) &&
        Objects.equals(bookmark, adsCreditsDiscountsGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditsDiscountsGet200Response {\n");
    
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

