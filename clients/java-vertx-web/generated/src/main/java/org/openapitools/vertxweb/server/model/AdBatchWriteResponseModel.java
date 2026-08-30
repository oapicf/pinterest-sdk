package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdBatchItem;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdBatchWriteResponseModel   {
  
  private List<AdBatchItem> items = new ArrayList<>();

  public AdBatchWriteResponseModel () {

  }

  public AdBatchWriteResponseModel (List<AdBatchItem> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<AdBatchItem> getItems() {
    return items;
  }
  public void setItems(List<AdBatchItem> items) {
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
    AdBatchWriteResponseModel adBatchWriteResponseModel = (AdBatchWriteResponseModel) o;
    return Objects.equals(items, adBatchWriteResponseModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdBatchWriteResponseModel {\n");
    
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
