package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DynamicTitlesProcessCSVError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DynamicTitlesProcessCSV  {
  
 /**
  * List of validation errors. Empty on success.
  */
  @ApiModelProperty(value = "List of validation errors. Empty on success.")
  @Valid
  private List<@Valid DynamicTitlesProcessCSVError> errors = new ArrayList<>();

 /**
  * Processing status. Present on success.
  */
  @ApiModelProperty(example = "SUCCESS", value = "Processing status. Present on success.")
  private String status;
 /**
  * List of validation errors. Empty on success.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setErrors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public DynamicTitlesProcessCSV errors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public DynamicTitlesProcessCSV addErrorsItem(DynamicTitlesProcessCSVError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Processing status. Present on success.
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public DynamicTitlesProcessCSV status(String status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

