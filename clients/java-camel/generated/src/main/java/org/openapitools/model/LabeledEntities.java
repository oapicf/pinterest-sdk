package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabeledEntities
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabeledEntities {

  @Valid
  private List<@Valid EntityLabel> entitiesLabels = new ArrayList<>();

  @Valid
  private List<@Valid EntityLabelError> errors = new ArrayList<>();

  public LabeledEntities entitiesLabels(List<@Valid EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
    return this;
  }

  public LabeledEntities addEntitiesLabelsItem(EntityLabel entitiesLabelsItem) {
    if (this.entitiesLabels == null) {
      this.entitiesLabels = new ArrayList<>();
    }
    this.entitiesLabels.add(entitiesLabelsItem);
    return this;
  }

  /**
   * Get entitiesLabels
   * @return entitiesLabels
   */
  @Valid 
  @Schema(name = "entities_labels", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entities_labels")
  public List<@Valid EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }

  public void setEntitiesLabels(List<@Valid EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
  }

  public LabeledEntities errors(List<@Valid EntityLabelError> errors) {
    this.errors = errors;
    return this;
  }

  public LabeledEntities addErrorsItem(EntityLabelError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Labels that were not successfully applied.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", accessMode = Schema.AccessMode.READ_ONLY, description = "Labels that were not successfully applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid EntityLabelError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid EntityLabelError> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabeledEntities labeledEntities = (LabeledEntities) o;
    return Objects.equals(this.entitiesLabels, labeledEntities.entitiesLabels) &&
        Objects.equals(this.errors, labeledEntities.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesLabels, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabeledEntities {\n");
    sb.append("    entitiesLabels: ").append(toIndentedString(entitiesLabels)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

