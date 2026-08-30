package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DynamicTitlesProcessCSVError  {
  
 /**
  * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
  */
  @ApiModelProperty(example = "ROW_VALIDATION_FAILED", value = "The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.")

  private String errorType;

 /**
  * The row number with a validation error. -1 indicates a file-level error.
  */
  @ApiModelProperty(example = "15", value = "The row number with a validation error. -1 indicates a file-level error.")

  private Integer rowNumber;
 /**
   * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
   * @return errorType
  **/
  @JsonProperty("error_type")
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public DynamicTitlesProcessCSVError errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

 /**
   * The row number with a validation error. -1 indicates a file-level error.
   * @return rowNumber
  **/
  @JsonProperty("row_number")
  public Integer getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
  }

  public DynamicTitlesProcessCSVError rowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
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
    DynamicTitlesProcessCSVError dynamicTitlesProcessCSVError = (DynamicTitlesProcessCSVError) o;
    return Objects.equals(this.errorType, dynamicTitlesProcessCSVError.errorType) &&
        Objects.equals(this.rowNumber, dynamicTitlesProcessCSVError.rowNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, rowNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesProcessCSVError {\n");
    
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
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

