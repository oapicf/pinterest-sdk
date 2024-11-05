package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.UpdatePartnerAssetsResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePartnerAssetsResultsResponseArray   {
  
  private List<UpdatePartnerAssetsResult> items = new ArrayList<>();

  public UpdatePartnerAssetsResultsResponseArray () {

  }

  public UpdatePartnerAssetsResultsResponseArray (List<UpdatePartnerAssetsResult> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<UpdatePartnerAssetsResult> getItems() {
    return items;
  }
  public void setItems(List<UpdatePartnerAssetsResult> items) {
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
    UpdatePartnerAssetsResultsResponseArray updatePartnerAssetsResultsResponseArray = (UpdatePartnerAssetsResultsResponseArray) o;
    return Objects.equals(items, updatePartnerAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResultsResponseArray {\n");
    
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
