package apimodels;

import apimodels.CatalogsFeedValidationErrors;
import apimodels.CatalogsFeedValidationWarnings;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsFeedValidationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedValidationDetails   {
  @JsonProperty("errors")
  @NotNull
@Valid

  private CatalogsFeedValidationErrors errors;

  @JsonProperty("warnings")
  @NotNull
@Valid

  private CatalogsFeedValidationWarnings warnings;

  public CatalogsFeedValidationDetails errors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  public CatalogsFeedValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedValidationDetails warnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  public CatalogsFeedValidationWarnings getWarnings() {
    return warnings;
  }

  public void setWarnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationDetails catalogsFeedValidationDetails = (CatalogsFeedValidationDetails) o;
    return Objects.equals(errors, catalogsFeedValidationDetails.errors) &&
        Objects.equals(warnings, catalogsFeedValidationDetails.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationDetails {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

