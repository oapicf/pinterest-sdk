package org.openapitools.model;

import org.openapitools.model.DeletePartnerAssetAccessResult;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DeletePartnerAssetAccessResultsResponseArray implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of terminated partner asset accesses.
   */
  @JsonProperty("items")
  private List<DeletePartnerAssetAccessResult> items = new ArrayList<>();

  /**
   * List of terminated partner asset accesses.
   * @return items
   */
  public List<DeletePartnerAssetAccessResult> getItems() {
    return items;
  }

  public void setItems(List<DeletePartnerAssetAccessResult> items) {
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
    DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessResultsResponseArray = (DeletePartnerAssetAccessResultsResponseArray) o;
    return Objects.equals(this.items, deletePartnerAssetAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResultsResponseArray {\n");
    
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
