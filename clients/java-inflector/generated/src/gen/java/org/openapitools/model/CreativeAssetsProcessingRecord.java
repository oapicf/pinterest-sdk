package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;



/**
 * Object describing an item processing record
 **/

@ApiModel(description = "Object describing an item processing record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreativeAssetsProcessingRecord   {
  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  @JsonProperty("errors")
  private List<ItemValidationEvent> errors = null;

  @JsonProperty("warnings")
  private List<ItemValidationEvent> warnings = null;

  @JsonProperty("status")
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
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   **/
  public CreativeAssetsProcessingRecord errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Array with the validation warnings for the item processing record
   **/
  public CreativeAssetsProcessingRecord warnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the validation warnings for the item processing record")
  @JsonProperty("warnings")
  public List<ItemValidationEvent> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<ItemValidationEvent> warnings) {
    this.warnings = warnings;
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
    return Objects.equals(creativeAssetsId, creativeAssetsProcessingRecord.creativeAssetsId) &&
        Objects.equals(errors, creativeAssetsProcessingRecord.errors) &&
        Objects.equals(warnings, creativeAssetsProcessingRecord.warnings) &&
        Objects.equals(status, creativeAssetsProcessingRecord.status);
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

