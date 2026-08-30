package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "AdsCreditRedeemCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditRedeemCreate {

  private String offerCodeHash;

  private Boolean validateOnly;

  public AdsCreditRedeemCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdsCreditRedeemCreate(String offerCodeHash, Boolean validateOnly) {
    this.offerCodeHash = offerCodeHash;
    this.validateOnly = validateOnly;
  }

  public AdsCreditRedeemCreate offerCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
    return this;
  }

  /**
   * Takes in a SHA256 hash of the offerCode.
   * @return offerCodeHash
   */
  @NotNull @Pattern(regexp = "^[a-z0-9]*$") 
  @Schema(name = "offerCodeHash", example = "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", description = "Takes in a SHA256 hash of the offerCode.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerCodeHash")
  public String getOfferCodeHash() {
    return offerCodeHash;
  }

  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

  public AdsCreditRedeemCreate validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   * @return validateOnly
   */
  @NotNull 
  @Schema(name = "validateOnly", example = "true", description = "If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validateOnly")
  public Boolean getValidateOnly() {
    return validateOnly;
  }

  public void setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsCreditRedeemCreate adsCreditRedeemCreate = (AdsCreditRedeemCreate) o;
    return Objects.equals(this.offerCodeHash, adsCreditRedeemCreate.offerCodeHash) &&
        Objects.equals(this.validateOnly, adsCreditRedeemCreate.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCodeHash, validateOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeemCreate {\n");
    sb.append("    offerCodeHash: ").append(toIndentedString(offerCodeHash)).append("\n");
    sb.append("    validateOnly: ").append(toIndentedString(validateOnly)).append("\n");
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

