package org.openapitools.model;

import org.openapitools.model.IneligibleProductTagsErrorDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response for requests containing ineligible product tags.
 */
@ApiModel(description="Error response for requests containing ineligible product tags.")

public class ProductTagsError  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer code;

 /**
  * Details about which product tags failed eligibility check.
  */
  @ApiModelProperty(value = "Details about which product tags failed eligibility check.")

  @Valid

  private IneligibleProductTagsErrorDetails details;

  @ApiModelProperty(required = true, value = "")

  private String message;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  @NotNull
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ProductTagsError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Details about which product tags failed eligibility check.
   * @return details
  **/
  @JsonProperty("details")
  public IneligibleProductTagsErrorDetails getDetails() {
    return details;
  }

  public void setDetails(IneligibleProductTagsErrorDetails details) {
    this.details = details;
  }

  public ProductTagsError details(IneligibleProductTagsErrorDetails details) {
    this.details = details;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProductTagsError message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

