package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("LabeledEntitiesCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-07T02:51:53.160510316Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LabeledEntitiesCreate   {
  private List<String> entityIds = new ArrayList<>();

  public LabeledEntitiesCreate() {
  }

  @JsonCreator
  public LabeledEntitiesCreate(
    @JsonProperty(required = true, value = "entity_ids") List<String> entityIds
  ) {
    this.entityIds = entityIds;
  }

  /**
   * Entity IDs to apply label to.
   **/
  public LabeledEntitiesCreate entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Entity IDs to apply label to.")
  @JsonProperty(required = true, value = "entity_ids")
  @NotNull public List<String> getEntityIds() {
    return entityIds;
  }

  @JsonProperty(required = true, value = "entity_ids")
  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

  public LabeledEntitiesCreate addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
    }

    this.entityIds.add(entityIdsItem);
    return this;
  }

  public LabeledEntitiesCreate removeEntityIdsItem(String entityIdsItem) {
    if (entityIdsItem != null && this.entityIds != null) {
      this.entityIds.remove(entityIdsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
