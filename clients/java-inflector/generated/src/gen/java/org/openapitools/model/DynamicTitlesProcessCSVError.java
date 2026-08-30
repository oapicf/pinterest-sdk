package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesProcessCSVError   {
  @JsonProperty("error_type")
  private String errorType;

  @JsonProperty("row_number")
  private Integer rowNumber;

  /**
   * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
   **/
  public DynamicTitlesProcessCSVError errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  
  @ApiModelProperty(example = "ROW_VALIDATION_FAILED", value = "The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.")
  @JsonProperty("error_type")
  public String getErrorType() {
    return errorType;
  }
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  /**
   * The row number with a validation error. -1 indicates a file-level error.
   **/
  public DynamicTitlesProcessCSVError rowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

  
  @ApiModelProperty(example = "15", value = "The row number with a validation error. -1 indicates a file-level error.")
  @JsonProperty("row_number")
  public Integer getRowNumber() {
    return rowNumber;
  }
  public void setRowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
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
    return Objects.equals(errorType, dynamicTitlesProcessCSVError.errorType) &&
        Objects.equals(rowNumber, dynamicTitlesProcessCSVError.rowNumber);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

