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
public class LabeledEntitiesCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Entity IDs to apply label to.
   */
  @JsonProperty("entity_ids")
  private List<String> entityIds = new ArrayList<>();

  /**
   * Entity IDs to apply label to.
   * @return entityIds
   */
  public List<String> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabeledEntitiesCreate labeledEntitiesCreate = (LabeledEntitiesCreate) o;
    return Objects.equals(this.entityIds, labeledEntitiesCreate.entityIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabeledEntitiesCreate {\n");
    
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
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
