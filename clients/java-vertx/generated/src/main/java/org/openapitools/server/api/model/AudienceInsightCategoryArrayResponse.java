package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.AudienceInsightCategoryCommon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceInsightCategoryArrayResponse   {
  
  private List<AudienceInsightCategoryCommon> items = new ArrayList<>();

  public AudienceInsightCategoryArrayResponse () {

  }

  public AudienceInsightCategoryArrayResponse (List<AudienceInsightCategoryCommon> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<AudienceInsightCategoryCommon> getItems() {
    return items;
  }
  public void setItems(List<AudienceInsightCategoryCommon> items) {
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
    AudienceInsightCategoryArrayResponse audienceInsightCategoryArrayResponse = (AudienceInsightCategoryArrayResponse) o;
    return Objects.equals(items, audienceInsightCategoryArrayResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightCategoryArrayResponse {\n");
    
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
