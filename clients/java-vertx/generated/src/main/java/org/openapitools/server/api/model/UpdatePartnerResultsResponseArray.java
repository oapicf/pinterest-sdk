package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.UpdatePartnerResultsResponseArrayItemsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePartnerResultsResponseArray   {
  
  private List<UpdatePartnerResultsResponseArrayItemsInner> items = new ArrayList<>();

  public UpdatePartnerResultsResponseArray () {

  }

  public UpdatePartnerResultsResponseArray (List<UpdatePartnerResultsResponseArrayItemsInner> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<UpdatePartnerResultsResponseArrayItemsInner> getItems() {
    return items;
  }
  public void setItems(List<UpdatePartnerResultsResponseArrayItemsInner> items) {
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
    UpdatePartnerResultsResponseArray updatePartnerResultsResponseArray = (UpdatePartnerResultsResponseArray) o;
    return Objects.equals(items, updatePartnerResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerResultsResponseArray {\n");
    
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
