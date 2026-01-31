package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Record processing counts
 **/

@ApiModel(description = "Record processing counts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RecordCounts   {
  @JsonProperty("invalid")
  private Integer invalid;

  @JsonProperty("processed")
  private Integer processed;

  @JsonProperty("valid")
  private Integer valid;

  /**
   * Number of invalid records processed
   **/
  public RecordCounts invalid(Integer invalid) {
    this.invalid = invalid;
    return this;
  }

  
  @ApiModelProperty(example = "50", required = true, value = "Number of invalid records processed")
  @JsonProperty("invalid")
  public Integer getInvalid() {
    return invalid;
  }
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

  
  @ApiModelProperty(example = "1000", required = true, value = "Number of records processed")
  @JsonProperty("processed")
  public Integer getProcessed() {
    return processed;
  }
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

  
  @ApiModelProperty(example = "950", required = true, value = "Number of valid records processed")
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
    return Objects.equals(invalid, recordCounts.invalid) &&
        Objects.equals(processed, recordCounts.processed) &&
        Objects.equals(valid, recordCounts.valid);
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

