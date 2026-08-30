package apimodels;

import apimodels.EntityLabel;
import apimodels.EntityLabelError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LabeledEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LabeledEntities   {
  @JsonProperty("entities_labels")
  @Valid

  private List<@Valid EntityLabel> entitiesLabels = null;

  @JsonProperty("errors")
  @Valid

  private List<@Valid EntityLabelError> errors = null;

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
  **/
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
  **/
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
    return Objects.equals(entitiesLabels, labeledEntities.entitiesLabels) &&
        Objects.equals(errors, labeledEntities.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesLabels, errors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

