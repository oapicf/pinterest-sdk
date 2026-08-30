package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.DynamicTitlesProcessCSVError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicTitlesProcessCSV   {
  
  private List<DynamicTitlesProcessCSVError> errors = new ArrayList<>();
  private String status;

  public DynamicTitlesProcessCSV () {

  }

  public DynamicTitlesProcessCSV (List<DynamicTitlesProcessCSVError> errors, String status) {
    this.errors = errors;
    this.status = status;
  }

    
  @JsonProperty("errors")
  public List<DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }
  public void setErrors(List<DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

    
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
    return Objects.equals(errors, dynamicTitlesProcessCSV.errors) &&
        Objects.equals(status, dynamicTitlesProcessCSV.status);
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
