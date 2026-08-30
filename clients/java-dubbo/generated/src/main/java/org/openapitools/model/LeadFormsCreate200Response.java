package org.openapitools.model;

import org.openapitools.model.LeadFormsCreate200ResponseItemsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LeadFormsCreate200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("items")
  private List<LeadFormsCreate200ResponseItemsInner> items = new ArrayList<>();

  /**
   * 
   * @return items
   */
  public List<LeadFormsCreate200ResponseItemsInner> getItems() {
    return items;
  }

  public void setItems(List<LeadFormsCreate200ResponseItemsInner> items) {
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
    LeadFormsCreate200Response leadFormsCreate200Response = (LeadFormsCreate200Response) o;
    return Objects.equals(this.items, leadFormsCreate200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormsCreate200Response {\n");
    
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
