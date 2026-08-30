package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.TargetingSpecOptimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingTemplateUpdateRequestReadOrUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplateUpdateRequestReadOrUpdate {

  private String id;

  private AudienceUpdateOperationType operationType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TargetingSpecOptimal targetingAttributes;

  public TargetingTemplateUpdateRequestReadOrUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TargetingTemplateUpdateRequestReadOrUpdate(String id, AudienceUpdateOperationType operationType) {
    this.id = id;
    this.operationType = operationType;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeting template ID
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "643", description = "Targeting template ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   */
  @NotNull @Valid 
  @Schema(name = "operation_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty("operation_type")
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate targetingAttributes(@Nullable TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * targeting profile attributes
   * @return targetingAttributes
   */
  @Valid 
  @Schema(name = "targeting_attributes", description = "targeting profile attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_attributes")
  public @Nullable TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty("targeting_attributes")
  public void setTargetingAttributes(@Nullable TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate = (TargetingTemplateUpdateRequestReadOrUpdate) o;
    return Objects.equals(this.id, targetingTemplateUpdateRequestReadOrUpdate.id) &&
        Objects.equals(this.operationType, targetingTemplateUpdateRequestReadOrUpdate.operationType) &&
        Objects.equals(this.targetingAttributes, targetingTemplateUpdateRequestReadOrUpdate.targetingAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationType, targetingAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateUpdateRequestReadOrUpdate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

