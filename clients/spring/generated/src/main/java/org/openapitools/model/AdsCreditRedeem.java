package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ads credit redemption
 */

@Schema(name = "AdsCreditRedeem", description = "Ads credit redemption")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditRedeem {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> errorCode = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean success;

  public AdsCreditRedeem errorCode(Integer errorCode) {
    this.errorCode = JsonNullable.of(errorCode);
    return this;
  }

  /**
   * Error code type if error occurs
   * @return errorCode
   */
  
  @Schema(name = "errorCode", accessMode = Schema.AccessMode.READ_ONLY, example = "2708", description = "Error code type if error occurs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public JsonNullable<Integer> getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(JsonNullable<Integer> errorCode) {
    this.errorCode = errorCode;
  }

  public AdsCreditRedeem errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.of(errorMessage);
    return this;
  }

  /**
   * Reason for failure
   * @return errorMessage
   */
  
  @Schema(name = "errorMessage", accessMode = Schema.AccessMode.READ_ONLY, example = "The offer has already been redeemed by this advertiser", description = "Reason for failure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public JsonNullable<String> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AdsCreditRedeem success(@Nullable Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
   * @return success
   */
  
  @Schema(name = "success", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public @Nullable Boolean getSuccess() {
    return success;
  }

  @JsonProperty("success")
  public void setSuccess(@Nullable Boolean success) {
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
    AdsCreditRedeem adsCreditRedeem = (AdsCreditRedeem) o;
    return equalsNullable(this.errorCode, adsCreditRedeem.errorCode) &&
        equalsNullable(this.errorMessage, adsCreditRedeem.errorMessage) &&
        Objects.equals(this.success, adsCreditRedeem.success);
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
    sb.append("class AdsCreditRedeem {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

