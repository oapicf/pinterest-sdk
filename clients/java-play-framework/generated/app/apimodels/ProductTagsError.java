package apimodels;

import apimodels.IneligibleProductTagsErrorDetails;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Error response for requests containing ineligible product tags.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductTagsError   {
  @JsonProperty("code")
  @NotNull

  private Integer code;

  @JsonProperty("details")
  @Valid

  private IneligibleProductTagsErrorDetails details;

  @JsonProperty("message")
  @NotNull

  private String message;

  public ProductTagsError code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ProductTagsError details(IneligibleProductTagsErrorDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Details about which product tags failed eligibility check.
   * @return details
  **/
  public IneligibleProductTagsErrorDetails getDetails() {
    return details;
  }

  public void setDetails(IneligibleProductTagsErrorDetails details) {
    this.details = details;
  }

  public ProductTagsError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTagsError productTagsError = (ProductTagsError) o;
    return Objects.equals(code, productTagsError.code) &&
        Objects.equals(details, productTagsError.details) &&
        Objects.equals(message, productTagsError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagsError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

