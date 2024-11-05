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
import org.openapitools.model.UserBusinessRoleBinding;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetBusinessEmployers200Response   {
  @JsonProperty("items")
  private List<UserBusinessRoleBinding> items = new ArrayList<>();

  @JsonProperty("bookmark")
  private String bookmark;

  /**
   * List of employers.
   **/
  public GetBusinessEmployers200Response items(List<UserBusinessRoleBinding> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of employers.")
  @JsonProperty("items")
  public List<UserBusinessRoleBinding> getItems() {
    return items;
  }
  public void setItems(List<UserBusinessRoleBinding> items) {
    this.items = items;
  }

  /**
   **/
  public GetBusinessEmployers200Response bookmark(String bookmark) {
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
    GetBusinessEmployers200Response getBusinessEmployers200Response = (GetBusinessEmployers200Response) o;
    return Objects.equals(items, getBusinessEmployers200Response.items) &&
        Objects.equals(bookmark, getBusinessEmployers200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessEmployers200Response {\n");
    
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

