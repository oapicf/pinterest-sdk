package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerSegmentCreate   {
  
  private List<String> audienceIds = new ArrayList<>();
  private String name;

  public CustomerSegmentCreate () {

  }

  public CustomerSegmentCreate (List<String> audienceIds, String name) {
    this.audienceIds = audienceIds;
    this.name = name;
  }

    
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSegmentCreate customerSegmentCreate = (CustomerSegmentCreate) o;
    return Objects.equals(audienceIds, customerSegmentCreate.audienceIds) &&
        Objects.equals(name, customerSegmentCreate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceIds, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegmentCreate {\n");
    
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
