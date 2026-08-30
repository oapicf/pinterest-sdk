package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicTitlesProcessCSVError   {
  
  private String errorType;
  private Integer rowNumber;

  public DynamicTitlesProcessCSVError () {

  }

  public DynamicTitlesProcessCSVError (String errorType, Integer rowNumber) {
    this.errorType = errorType;
    this.rowNumber = rowNumber;
  }

    
  @JsonProperty("error_type")
  public String getErrorType() {
    return errorType;
  }
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

    
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
