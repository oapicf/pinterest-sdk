package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RecordCounts
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RecordCounts   {
  @JsonProperty("invalid")
  private Integer invalid;

  @JsonProperty("processed")
  private Integer processed;

  @JsonProperty("valid")
  private Integer valid;

  public RecordCounts invalid(Integer invalid) {
    this.invalid = invalid;
    return this;
  }

  /**
   * Number of invalid records processed
   * @return invalid
   */
  @ApiModelProperty(required = true, value = "Number of invalid records processed")
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
  @ApiModelProperty(required = true, value = "Number of records processed")
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
  @ApiModelProperty(required = true, value = "Number of valid records processed")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

