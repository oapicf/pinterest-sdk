package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BrandAccount   {
  
  private String brandAccountId;

  /**
   **/
  public BrandAccount brandAccountId(String brandAccountId) {
    this.brandAccountId = brandAccountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("brand_account_id")
  @NotNull
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

