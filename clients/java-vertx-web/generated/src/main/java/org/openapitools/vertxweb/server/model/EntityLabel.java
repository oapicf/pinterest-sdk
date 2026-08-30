package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EntityLabelStatus;
import org.openapitools.vertxweb.server.model.LabelParentType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityLabel   {
  
  private String entityId;
  private LabelParentType entityType;
  private String labelId;
  private EntityLabelStatus status;

  public EntityLabel () {

  }

  public EntityLabel (String entityId, LabelParentType entityType, String labelId, EntityLabelStatus status) {
    this.entityId = entityId;
    this.entityType = entityType;
    this.labelId = labelId;
    this.status = status;
  }

    
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

    
  @JsonProperty("entity_type")
  public LabelParentType getEntityType() {
    return entityType;
  }
  public void setEntityType(LabelParentType entityType) {
    this.entityType = entityType;
  }

    
  @JsonProperty("label_id")
  public String getLabelId() {
    return labelId;
  }
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }

    
  @JsonProperty("status")
  public EntityLabelStatus getStatus() {
    return status;
  }
  public void setStatus(EntityLabelStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLabel entityLabel = (EntityLabel) o;
    return Objects.equals(entityId, entityLabel.entityId) &&
        Objects.equals(entityType, entityLabel.entityType) &&
        Objects.equals(labelId, entityLabel.labelId) &&
        Objects.equals(status, entityLabel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, labelId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLabel {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
