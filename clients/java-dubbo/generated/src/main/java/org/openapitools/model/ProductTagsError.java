package org.openapitools.model;

import org.openapitools.model.IneligibleProductTagsErrorDetails;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Error response for requests containing ineligible product tags.
 */
public class ProductTagsError implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private Integer code;

  /**
   * Details about which product tags failed eligibility check.
   */
  @JsonProperty("details")
  private IneligibleProductTagsErrorDetails details;

  @JsonProperty("message")
  private String message;

  /**
   * 
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Details about which product tags failed eligibility check.
   * @return details
   */
  public IneligibleProductTagsErrorDetails getDetails() {
    return details;
  }

  public void setDetails(IneligibleProductTagsErrorDetails details) {
    this.details = details;
  }

  /**
   * 
   * @return message
   */
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
    return Objects.equals(this.code, productTagsError.code) &&
        Objects.equals(this.details, productTagsError.details) &&
        Objects.equals(this.message, productTagsError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

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
