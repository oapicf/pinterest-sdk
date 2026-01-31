package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BrandAccountsCreate200Response  {
  
 /**
  * id of the newly created brand account
  */
  @ApiModelProperty(example = "666791336903426391", value = "id of the newly created brand account")
  private String brandAccountId;
 /**
  * id of the newly created brand account
  * @return brandAccountId
  */
  @JsonProperty("brand_account_id")
  public String getBrandAccountId() {
    return brandAccountId;
  }

  /**
   * Sets the <code>brandAccountId</code> property.
   */
 public void setBrandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
  }

  /**
   * Sets the <code>brandAccountId</code> property.
   */
  public BrandAccountsCreate200Response brandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

