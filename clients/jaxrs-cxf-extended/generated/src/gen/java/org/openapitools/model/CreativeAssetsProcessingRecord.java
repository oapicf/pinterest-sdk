package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing an item processing record
 */
@ApiModel(description="Object describing an item processing record")

public class CreativeAssetsProcessingRecord  {
  
 /**
  * The catalog creative assets id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  private String creativeAssetsId;

 /**
  * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  */
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @Valid
  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

 /**
  * Array with the validation warnings for the item processing record
  */
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @Valid
  private List<@Valid ItemValidationEvent> warnings = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ItemProcessingStatus status;
 /**
  * The catalog creative assets id in the merchant namespace
  * @return creativeAssetsId
  */
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
 public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
  public CreativeAssetsProcessingRecord creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
  * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public CreativeAssetsProcessingRecord errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public CreativeAssetsProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Array with the validation warnings for the item processing record
  * @return warnings
  */
  @JsonProperty("warnings")
  public List<@Valid ItemValidationEvent> getWarnings() {
    return warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
 public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
  public CreativeAssetsProcessingRecord warnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Adds a new item to the <code>warnings</code> list.
   */
  public CreativeAssetsProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public ItemProcessingStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(ItemProcessingStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
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

