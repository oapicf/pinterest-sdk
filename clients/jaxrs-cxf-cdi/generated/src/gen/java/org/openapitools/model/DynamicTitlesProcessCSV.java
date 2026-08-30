package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DynamicTitlesProcessCSVError;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class DynamicTitlesProcessCSV   {
  
  private List<@Valid DynamicTitlesProcessCSVError> errors = new ArrayList<>();

  private String status;

  /**
   * List of validation errors. Empty on success.
   **/
  public DynamicTitlesProcessCSV errors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "List of validation errors. Empty on success.")
  @JsonProperty("errors")
  public List<@Valid DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  public DynamicTitlesProcessCSV addErrorsItem(DynamicTitlesProcessCSVError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * Processing status. Present on success.
   **/
  public DynamicTitlesProcessCSV status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "SUCCESS", value = "Processing status. Present on success.")
  @JsonProperty("status")
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

