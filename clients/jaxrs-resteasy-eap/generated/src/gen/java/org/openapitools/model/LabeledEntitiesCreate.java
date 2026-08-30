package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabeledEntitiesCreate   {
  
  private List<String> entityIds = new ArrayList<>();

  /**
   * Entity IDs to apply label to.
   **/
  
  @ApiModelProperty(required = true, value = "Entity IDs to apply label to.")
  @JsonProperty("entity_ids")
  @NotNull
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

