/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BrandAccountsCreate200Response   {
  
  private String brandAccountId;

  /**
   * id of the newly created brand account
   */
  public BrandAccountsCreate200Response brandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "666791336903426391", value = "id of the newly created brand account")
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
    return Objects.equals(brandAccountId, brandAccountsCreate200Response.brandAccountId);
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

