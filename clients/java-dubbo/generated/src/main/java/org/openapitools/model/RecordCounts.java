package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RecordCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Number of invalid records processed
   */
  @JsonProperty("invalid")
  private Integer invalid;

  /**
   * Number of records processed
   */
  @JsonProperty("processed")
  private Integer processed;

  /**
   * Number of valid records processed
   */
  @JsonProperty("valid")
  private Integer valid;

  /**
   * Number of invalid records processed
   * @return invalid
   */
  public Integer getInvalid() {
    return invalid;
  }

  public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }

  /**
   * Number of records processed
   * @return processed
   */
  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }

  /**
   * Number of valid records processed
   * @return valid
   */
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
