package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdsCreditRedeemResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdsCreditRedeemResponse {

  private JsonNullable<Integer> errorCode = JsonNullable.<Integer>undefined();

  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  private Boolean success;

  public AdsCreditRedeemResponse errorCode(Integer errorCode) {
    this.errorCode = JsonNullable.of(errorCode);
    return this;
  }

  /**
   * Error code type if error occurs
   * @return errorCode
   */
  
  @Schema(name = "errorCode", example = "2708", description = "Error code type if error occurs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public JsonNullable<Integer> getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(JsonNullable<Integer> errorCode) {
    this.errorCode = errorCode;
  }

  public AdsCreditRedeemResponse errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.of(errorMessage);
    return this;
  }

  /**
   * Reason for failure
   * @return errorMessage
   */
  
  @Schema(name = "errorMessage", example = "The offer has already been redeemed by this advertiser", description = "Reason for failure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public JsonNullable<String> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AdsCreditRedeemResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
   * @return success
   */
  
  @Schema(name = "success", example = "false", description = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsCreditRedeemResponse adsCreditRedeemResponse = (AdsCreditRedeemResponse) o;
    return equalsNullable(this.errorCode, adsCreditRedeemResponse.errorCode) &&
        equalsNullable(this.errorMessage, adsCreditRedeemResponse.errorMessage) &&
        Objects.equals(this.success, adsCreditRedeemResponse.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(errorCode), hashCodeNullable(errorMessage), success);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeemResponse {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

