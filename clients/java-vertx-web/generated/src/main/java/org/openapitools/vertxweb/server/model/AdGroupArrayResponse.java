package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdGroupArrayResponseElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupArrayResponse   {
  
  private List<AdGroupArrayResponseElement> items = new ArrayList<>();

  public AdGroupArrayResponse () {

  }

  public AdGroupArrayResponse (List<AdGroupArrayResponseElement> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<AdGroupArrayResponseElement> getItems() {
    return items;
  }
  public void setItems(List<AdGroupArrayResponseElement> items) {
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
    AdGroupArrayResponse adGroupArrayResponse = (AdGroupArrayResponse) o;
    return Objects.equals(items, adGroupArrayResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupArrayResponse {\n");
    
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
