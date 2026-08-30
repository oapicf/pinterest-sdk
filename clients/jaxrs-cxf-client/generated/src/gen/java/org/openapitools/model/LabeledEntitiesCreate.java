package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LabeledEntitiesCreate  {
  
 /**
  * Entity IDs to apply label to.
  */
  @ApiModelProperty(required = true, value = "Entity IDs to apply label to.")

  private List<String> entityIds = new ArrayList<>();
 /**
   * Entity IDs to apply label to.
   * @return entityIds
  **/
  @JsonProperty("entity_ids")
  public List<String> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

  public LabeledEntitiesCreate entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public LabeledEntitiesCreate addEntityIdsItem(String entityIdsItem) {
    this.entityIds.add(entityIdsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

