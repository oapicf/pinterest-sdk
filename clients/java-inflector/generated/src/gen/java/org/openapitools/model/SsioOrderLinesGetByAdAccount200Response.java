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
import org.openapitools.model.SSIOOrderLine;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SsioOrderLinesGetByAdAccount200Response   {
  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<SSIOOrderLine> items = new ArrayList<>();

  /**
   **/
  public SsioOrderLinesGetByAdAccount200Response bookmark(String bookmark) {
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

  /**
   * SSIO order lines by ad acount id
   **/
  public SsioOrderLinesGetByAdAccount200Response items(List<SSIOOrderLine> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "SSIO order lines by ad acount id")
  @JsonProperty("items")
  public List<SSIOOrderLine> getItems() {
    return items;
  }
  public void setItems(List<SSIOOrderLine> items) {
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
    SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount200Response = (SsioOrderLinesGetByAdAccount200Response) o;
    return Objects.equals(bookmark, ssioOrderLinesGetByAdAccount200Response.bookmark) &&
        Objects.equals(items, ssioOrderLinesGetByAdAccount200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioOrderLinesGetByAdAccount200Response {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

