package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Record processing counts
 */
@ApiModel(description="Record processing counts")

public class RecordCounts  {
  
 /**
  * Number of invalid records processed
  */
  @ApiModelProperty(example = "50", required = true, value = "Number of invalid records processed")
  private Integer invalid;

 /**
  * Number of records processed
  */
  @ApiModelProperty(example = "1000", required = true, value = "Number of records processed")
  private Integer processed;

 /**
  * Number of valid records processed
  */
  @ApiModelProperty(example = "950", required = true, value = "Number of valid records processed")
  private Integer valid;
 /**
  * Number of invalid records processed
  * @return invalid
  */
  @JsonProperty("invalid")
  @NotNull
  public Integer getInvalid() {
    return invalid;
  }

  /**
   * Sets the <code>invalid</code> property.
   */
 public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }

  /**
   * Sets the <code>invalid</code> property.
   */
  public RecordCounts invalid(Integer invalid) {
    this.invalid = invalid;
    return this;
  }

 /**
  * Number of records processed
  * @return processed
  */
  @JsonProperty("processed")
  @NotNull
  public Integer getProcessed() {
    return processed;
  }

  /**
   * Sets the <code>processed</code> property.
   */
 public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  /**
   * Sets the <code>processed</code> property.
   */
  public RecordCounts processed(Integer processed) {
    this.processed = processed;
    return this;
  }

 /**
  * Number of valid records processed
  * @return valid
  */
  @JsonProperty("valid")
  @NotNull
  public Integer getValid() {
    return valid;
  }

  /**
   * Sets the <code>valid</code> property.
   */
 public void setValid(Integer valid) {
    this.valid = valid;
  }

  /**
   * Sets the <code>valid</code> property.
   */
  public RecordCounts valid(Integer valid) {
    this.valid = valid;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

