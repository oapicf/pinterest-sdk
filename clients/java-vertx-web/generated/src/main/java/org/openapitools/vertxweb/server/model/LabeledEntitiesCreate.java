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
public class LabeledEntitiesCreate   {
  
  private List<String> entityIds = new ArrayList<>();

  public LabeledEntitiesCreate () {

  }

  public LabeledEntitiesCreate (List<String> entityIds) {
    this.entityIds = entityIds;
  }

    
  @JsonProperty("entity_ids")
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
    return Objects.equals(entityIds, labeledEntitiesCreate.entityIds);
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
