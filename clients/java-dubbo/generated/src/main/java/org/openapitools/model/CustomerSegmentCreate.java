package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class CustomerSegmentCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Audience IDs included in the customer segment.
   */
  @JsonProperty("audience_ids")
  private List<String> audienceIds = new ArrayList<>();

  /**
   * Customer segment name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Audience IDs included in the customer segment.
   * @return audienceIds
   */
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Customer segment name.
   * @return name
   */
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
    return Objects.equals(this.audienceIds, customerSegmentCreate.audienceIds) &&
        Objects.equals(this.name, customerSegmentCreate.name);
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
