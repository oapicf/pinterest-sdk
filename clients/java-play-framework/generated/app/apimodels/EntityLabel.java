package apimodels;

import apimodels.EntityLabelStatus;
import apimodels.LabelParentType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EntityLabel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EntityLabel   {
  @JsonProperty("entity_id")
  @NotNull

  private String entityId;

  @JsonProperty("entity_type")
  @Valid

  private LabelParentType entityType;

  @JsonProperty("label_id")
  @NotNull

  private String labelId;

  @JsonProperty("status")
  @Valid

  private EntityLabelStatus status;

  public EntityLabel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Entity ID to apply label to.
   * @return entityId
  **/
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntityLabel entityType(LabelParentType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  public LabelParentType getEntityType() {
    return entityType;
  }

  public void setEntityType(LabelParentType entityType) {
    this.entityType = entityType;
  }

  public EntityLabel labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Label ID.
   * @return labelId
  **/
  public String getLabelId() {
    return labelId;
  }

  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }

  public EntityLabel status(EntityLabelStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

