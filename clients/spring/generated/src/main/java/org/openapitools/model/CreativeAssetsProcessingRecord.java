package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing an item processing record
 */

@Schema(name = "CreativeAssetsProcessingRecord", description = "Object describing an item processing record")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreativeAssetsProcessingRecord {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String creativeAssetsId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ItemProcessingStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid ItemValidationEvent> warnings = new ArrayList<>();

  public CreativeAssetsProcessingRecord creativeAssetsId(@Nullable String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
   */
  
  @Schema(name = "creative_assets_id", example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_assets_id")
  public @Nullable String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  @JsonProperty("creative_assets_id")
  public void setCreativeAssetsId(@Nullable String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CreativeAssetsProcessingRecord errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public CreativeAssetsProcessingRecord addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public CreativeAssetsProcessingRecord status(@Nullable ItemProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable ItemProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable ItemProcessingStatus status) {
    this.status = status;
  }

  public CreativeAssetsProcessingRecord warnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CreativeAssetsProcessingRecord addWarningsItem(ItemValidationEvent warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Array with the validation warnings for the item processing record
   * @return warnings
   */
  @Valid 
  @Schema(name = "warnings", description = "Array with the validation warnings for the item processing record", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<@Valid ItemValidationEvent> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<@Valid ItemValidationEvent> warnings) {
    this.warnings = warnings;
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
        Objects.equals(this.status, creativeAssetsProcessingRecord.status) &&
        Objects.equals(this.warnings, creativeAssetsProcessingRecord.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, errors, status, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAssetsProcessingRecord {\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

