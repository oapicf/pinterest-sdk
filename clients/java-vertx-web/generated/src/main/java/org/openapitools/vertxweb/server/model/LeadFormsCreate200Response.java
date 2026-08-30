package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LeadFormsCreate200ResponseItemsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormsCreate200Response   {
  
  private List<LeadFormsCreate200ResponseItemsInner> items = new ArrayList<>();

  public LeadFormsCreate200Response () {

  }

  public LeadFormsCreate200Response (List<LeadFormsCreate200ResponseItemsInner> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
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
    return Objects.equals(items, leadFormsCreate200Response.items);
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
