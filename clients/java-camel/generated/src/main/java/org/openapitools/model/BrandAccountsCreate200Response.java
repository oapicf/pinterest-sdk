package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BrandAccountsCreate200Response
 */

@JsonTypeName("brand_accounts_create_200_response")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BrandAccountsCreate200Response {

  private String brandAccountId;

  public BrandAccountsCreate200Response brandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
    return this;
  }

  /**
   * id of the newly created brand account
   * @return brandAccountId
   */
  
  @Schema(name = "brand_account_id", example = "666791336903426391", description = "id of the newly created brand account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BrandAccountsCreate200Response brandAccountsCreate200Response = (BrandAccountsCreate200Response) o;
    return Objects.equals(this.brandAccountId, brandAccountsCreate200Response.brandAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountsCreate200Response {\n");
    sb.append("    brandAccountId: ").append(toIndentedString(brandAccountId)).append("\n");
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

