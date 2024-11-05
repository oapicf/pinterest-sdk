package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing an item processing record
 **/
@ApiModel(description="Object describing an item processing record")

public class CreativeAssetsProcessingRecord  {
  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
 /**
   * The catalog creative assets id in the merchant namespace
  **/
  private String creativeAssetsId;

  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
 /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  **/
  private List<ItemValidationEvent> errors = new ArrayList<>();

  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
 /**
   * Array with the validation warnings for the item processing record
  **/
  private List<ItemValidationEvent> warnings = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ItemProcessingStatus status;
 /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CreativeAssetsProcessingRecord creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public CreativeAssetsProcessingRecord errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public CreativeAssetsProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Array with the validation warnings for the item processing record
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  public CreativeAssetsProcessingRecord warnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CreativeAssetsProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

  public CreativeAssetsProcessingRecord status(ItemProcessingStatus status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

