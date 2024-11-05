package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.DeleteMemberAccessResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteMemberAccessResultsResponseArray   {
  
  private List<DeleteMemberAccessResult> items = new ArrayList<>();

  public DeleteMemberAccessResultsResponseArray () {

  }

  public DeleteMemberAccessResultsResponseArray (List<DeleteMemberAccessResult> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<DeleteMemberAccessResult> getItems() {
    return items;
  }
  public void setItems(List<DeleteMemberAccessResult> items) {
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
    DeleteMemberAccessResultsResponseArray deleteMemberAccessResultsResponseArray = (DeleteMemberAccessResultsResponseArray) o;
    return Objects.equals(items, deleteMemberAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMemberAccessResultsResponseArray {\n");
    
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
