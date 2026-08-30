package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DynamicTitlesProcessCSVError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DynamicTitlesProcessCSV
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesProcessCSV   {
  @JsonProperty("errors")
  
  private List<DynamicTitlesProcessCSVError> errors = null;

  @JsonProperty("status")
  private String status;

  public DynamicTitlesProcessCSV errors(List<DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
    return this;
  }

  public DynamicTitlesProcessCSV addErrorsItem(DynamicTitlesProcessCSVError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * List of validation errors. Empty on success.
   * @return errors
   */
  @ApiModelProperty(readOnly = true, value = "List of validation errors. Empty on success.")
  public List<DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }

  public void setErrors(List<DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  public DynamicTitlesProcessCSV status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Processing status. Present on success.
   * @return status
   */
  @ApiModelProperty(example = "SUCCESS", readOnly = true, value = "Processing status. Present on success.")
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

