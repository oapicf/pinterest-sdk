package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IneligibleProductTagsErrorDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Error response for requests containing ineligible product tags.
 **/
@ApiModel(description = "Error response for requests containing ineligible product tags.")
@JsonTypeName("ProductTagsError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagsError   {
  private Integer code;
  private IneligibleProductTagsErrorDetails details;
  private String message;

  public ProductTagsError() {
  }

  @JsonCreator
  public ProductTagsError(
    @JsonProperty(required = true, value = "code") Integer code,
    @JsonProperty(required = true, value = "message") String message
  ) {
    this.code = code;
    this.message = message;
  }

  /**
   **/
  public ProductTagsError code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "code")
  @NotNull public Integer getCode() {
    return code;
  }

  @JsonProperty(required = true, value = "code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Details about which product tags failed eligibility check.
   **/
  public ProductTagsError details(IneligibleProductTagsErrorDetails details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Details about which product tags failed eligibility check.")
  @JsonProperty("details")
  @Valid public IneligibleProductTagsErrorDetails getDetails() {
    return details;
  }

  @JsonProperty("details")
  public void setDetails(IneligibleProductTagsErrorDetails details) {
    this.details = details;
  }

  /**
   **/
  public ProductTagsError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty(required = true, value = "message")
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
