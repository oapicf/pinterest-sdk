package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Record processing counts
 */

@Schema(name = "RecordCounts", description = "Record processing counts")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RecordCounts {

  private Integer invalid;

  private Integer processed;

  private Integer valid;

  public RecordCounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecordCounts(Integer invalid, Integer processed, Integer valid) {
    this.invalid = invalid;
    this.processed = processed;
    this.valid = valid;
  }

  public RecordCounts invalid(Integer invalid) {
    this.invalid = invalid;
    return this;
  }

  /**
   * Number of invalid records processed
   * @return invalid
   */
  @NotNull 
  @Schema(name = "invalid", example = "50", description = "Number of invalid records processed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invalid")
  public Integer getInvalid() {
    return invalid;
  }

  public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }

  public RecordCounts processed(Integer processed) {
    this.processed = processed;
    return this;
  }

  /**
   * Number of records processed
   * @return processed
   */
  @NotNull 
  @Schema(name = "processed", example = "1000", description = "Number of records processed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("processed")
  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  public RecordCounts valid(Integer valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Number of valid records processed
   * @return valid
   */
  @NotNull 
  @Schema(name = "valid", example = "950", description = "Number of valid records processed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("valid")
  public Integer getValid() {
    return valid;
  }

  public void setValid(Integer valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordCounts recordCounts = (RecordCounts) o;
    return Objects.equals(this.invalid, recordCounts.invalid) &&
        Objects.equals(this.processed, recordCounts.processed) &&
        Objects.equals(this.valid, recordCounts.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalid, processed, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordCounts {\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

