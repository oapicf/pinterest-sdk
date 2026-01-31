package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandAccountsCreate200Response   {
  
  private String brandAccountId;

  public BrandAccountsCreate200Response () {

  }

  public BrandAccountsCreate200Response (String brandAccountId) {
    this.brandAccountId = brandAccountId;
  }

    
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
