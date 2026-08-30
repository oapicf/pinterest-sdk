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
 * BrandAccount
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BrandAccount {

  private String brandAccountId;

  public BrandAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BrandAccount(String brandAccountId) {
    this.brandAccountId = brandAccountId;
  }

  public BrandAccount brandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
    return this;
  }

  /**
   * Get brandAccountId
   * @return brandAccountId
   */
  
  @Schema(name = "brand_account_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brand_account_id")
  public String getBrandAccountId() {
    return brandAccountId;
  }

  public void setBrandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAccount brandAccount = (BrandAccount) o;
    return Objects.equals(this.brandAccountId, brandAccount.brandAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccount {\n");
    sb.append("    brandAccountId: ").append(toIndentedString(brandAccountId)).append("\n");
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

