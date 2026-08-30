package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("RecordCounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RecordCounts   {
  private Integer invalid;
  private Integer processed;
  private Integer valid;

  public RecordCounts() {
  }

  @JsonCreator
  public RecordCounts(
    @JsonProperty(required = true, value = "invalid") Integer invalid,
    @JsonProperty(required = true, value = "processed") Integer processed,
    @JsonProperty(required = true, value = "valid") Integer valid
  ) {
    this.invalid = invalid;
    this.processed = processed;
    this.valid = valid;
  }

  /**
   * Number of invalid records processed
   **/
  public RecordCounts invalid(Integer invalid) {
    this.invalid = invalid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of invalid records processed")
  @JsonProperty(required = true, value = "invalid")
  @NotNull public Integer getInvalid() {
    return invalid;
  }

  @JsonProperty(required = true, value = "invalid")
  public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }

  /**
   * Number of records processed
   **/
  public RecordCounts processed(Integer processed) {
    this.processed = processed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of records processed")
  @JsonProperty(required = true, value = "processed")
  @NotNull public Integer getProcessed() {
    return processed;
  }

  @JsonProperty(required = true, value = "processed")
  public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  /**
   * Number of valid records processed
   **/
  public RecordCounts valid(Integer valid) {
    this.valid = valid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of valid records processed")
  @JsonProperty(required = true, value = "valid")
  @NotNull public Integer getValid() {
    return valid;
  }

  @JsonProperty(required = true, value = "valid")
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
