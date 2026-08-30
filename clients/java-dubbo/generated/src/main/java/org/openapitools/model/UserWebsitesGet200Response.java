package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserWebsite;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class UserWebsitesGet200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<UserWebsite> items = new ArrayList<>();

  /**
   * 
   * @return bookmark
   */
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * 
   * @return items
   */
  public List<UserWebsite> getItems() {
    return items;
  }

  public void setItems(List<UserWebsite> items) {
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
    UserWebsitesGet200Response userWebsitesGet200Response = (UserWebsitesGet200Response) o;
    return Objects.equals(this.bookmark, userWebsitesGet200Response.bookmark) &&
        Objects.equals(this.items, userWebsitesGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsitesGet200Response {\n");
    
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
