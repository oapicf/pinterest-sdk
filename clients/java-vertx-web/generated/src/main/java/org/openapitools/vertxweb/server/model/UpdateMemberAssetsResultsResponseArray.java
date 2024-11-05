package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetsResultsResponseArrayItemsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMemberAssetsResultsResponseArray   {
  
  private List<UpdateMemberAssetsResultsResponseArrayItemsInner> items = new ArrayList<>();

  public UpdateMemberAssetsResultsResponseArray () {

  }

  public UpdateMemberAssetsResultsResponseArray (List<UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<UpdateMemberAssetsResultsResponseArrayItemsInner> getItems() {
    return items;
  }
  public void setItems(List<UpdateMemberAssetsResultsResponseArrayItemsInner> items) {
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
    UpdateMemberAssetsResultsResponseArray updateMemberAssetsResultsResponseArray = (UpdateMemberAssetsResultsResponseArray) o;
    return Objects.equals(items, updateMemberAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetsResultsResponseArray {\n");
    
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
