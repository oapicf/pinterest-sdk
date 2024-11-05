package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateInvitesResultsResponseArrayItemsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInvitesResultsResponseArray   {
  
  private List<CreateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>();

  public CreateInvitesResultsResponseArray () {

  }

  public CreateInvitesResultsResponseArray (List<CreateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<CreateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }
  public void setItems(List<CreateInvitesResultsResponseArrayItemsInner> items) {
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
    CreateInvitesResultsResponseArray createInvitesResultsResponseArray = (CreateInvitesResultsResponseArray) o;
    return Objects.equals(items, createInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArray {\n");
    
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
