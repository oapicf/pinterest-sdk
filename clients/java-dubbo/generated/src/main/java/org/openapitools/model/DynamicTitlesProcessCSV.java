package org.openapitools.model;

import org.openapitools.model.DynamicTitlesProcessCSVError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DynamicTitlesProcessCSV implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of validation errors. Empty on success.
   */
  @JsonProperty("errors")
  private List<DynamicTitlesProcessCSVError> errors = new ArrayList<>();

  /**
   * Processing status. Present on success.
   */
  @JsonProperty("status")
  private String status;

  /**
   * List of validation errors. Empty on success.
   * @return errors
   */
  public List<DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }

  public void setErrors(List<DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  /**
   * Processing status. Present on success.
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    DynamicTitlesProcessCSV dynamicTitlesProcessCSV = (DynamicTitlesProcessCSV) o;
    return Objects.equals(this.errors, dynamicTitlesProcessCSV.errors) &&
        Objects.equals(this.status, dynamicTitlesProcessCSV.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesProcessCSV {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
