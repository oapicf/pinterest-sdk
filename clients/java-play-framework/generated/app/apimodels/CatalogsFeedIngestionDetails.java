package apimodels;

import apimodels.CatalogsFeedIngestionErrors;
import apimodels.CatalogsFeedIngestionInfo;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsFeedIngestionDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedIngestionDetails   {
  @JsonProperty("errors")
  @NotNull
@Valid

  private CatalogsFeedIngestionErrors errors;

  @JsonProperty("info")
  @NotNull
@Valid

  private CatalogsFeedIngestionInfo info;

  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedIngestionDetails info(CatalogsFeedIngestionInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }

  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionDetails catalogsFeedIngestionDetails = (CatalogsFeedIngestionDetails) o;
    return Objects.equals(errors, catalogsFeedIngestionDetails.errors) &&
        Objects.equals(info, catalogsFeedIngestionDetails.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, info);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionDetails {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

