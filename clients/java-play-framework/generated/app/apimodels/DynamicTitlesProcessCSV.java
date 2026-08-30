package apimodels;

import apimodels.DynamicTitlesProcessCSVError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DynamicTitlesProcessCSV
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DynamicTitlesProcessCSV   {
  @JsonProperty("errors")
  @Valid

  private List<@Valid DynamicTitlesProcessCSVError> errors = null;

  @JsonProperty("status")
  
  private String status;

  public DynamicTitlesProcessCSV errors(List<@Valid DynamicTitlesProcessCSVError> errors) {
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
  **/
  public List<@Valid DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  public DynamicTitlesProcessCSV status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Processing status. Present on success.
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

