package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object describing an item processing record
 **/
@ApiModel(description = "Object describing an item processing record")
@JsonTypeName("CreativeAssetsProcessingRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreativeAssetsProcessingRecord   {
  private String creativeAssetsId;
  private @Valid List<@Valid ItemValidationEvent> errors = new ArrayList<>();
  private @Valid List<@Valid ItemValidationEvent> warnings = new ArrayList<>();
  private ItemProcessingStatus status;

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  public CreativeAssetsProcessingRecord creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  @JsonProperty("creative_assets_id")
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public CreativeAssetsProcessingRecord errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  @Valid public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public CreativeAssetsProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public CreativeAssetsProcessingRecord removeErrorsItem(ItemValidationEvent errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Array with the validation warnings for the item processing record
   **/
  public CreativeAssetsProcessingRecord warnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  @Valid public List<@Valid ItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public CreativeAssetsProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }

    this.warnings.add(warningsItem);
    return this;
  }

  public CreativeAssetsProcessingRecord removeWarningsItem(ItemValidationEvent warningsItem) {
    if (warningsItem != null && this.warnings != null) {
      this.warnings.remove(warningsItem);
    }

    return this;
  }
  /**
   **/
  public CreativeAssetsProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(ItemProcessingStatus status) {
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
    CreativeAssetsProcessingRecord creativeAssetsProcessingRecord = (CreativeAssetsProcessingRecord) o;
    return Objects.equals(this.creativeAssetsId, creativeAssetsProcessingRecord.creativeAssetsId) &&
        Objects.equals(this.errors, creativeAssetsProcessingRecord.errors) &&
        Objects.equals(this.warnings, creativeAssetsProcessingRecord.warnings) &&
        Objects.equals(this.status, creativeAssetsProcessingRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, errors, warnings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAssetsProcessingRecord {\n");
    
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

