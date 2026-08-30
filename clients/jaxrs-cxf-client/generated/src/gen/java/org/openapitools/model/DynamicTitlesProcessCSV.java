package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DynamicTitlesProcessCSVError;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DynamicTitlesProcessCSV  {
  
 /**
  * List of validation errors. Empty on success.
  */
  @ApiModelProperty(value = "List of validation errors. Empty on success.")

  private List<DynamicTitlesProcessCSVError> errors = new ArrayList<>();

 /**
  * Processing status. Present on success.
  */
  @ApiModelProperty(example = "SUCCESS", value = "Processing status. Present on success.")

  private String status;
 /**
   * List of validation errors. Empty on success.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }


 /**
   * Processing status. Present on success.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
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

