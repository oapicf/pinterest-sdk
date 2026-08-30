package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("entity_ids")
  @NotNull
  public List<String> getEntityIds() {
    return entityIds;
  }

  /**
   * Sets the <code>entityIds</code> property.
   */
 public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

  /**
   * Sets the <code>entityIds</code> property.
   */
  public LabeledEntitiesCreate entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  /**
   * Adds a new item to the <code>entityIds</code> list.
   */
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

