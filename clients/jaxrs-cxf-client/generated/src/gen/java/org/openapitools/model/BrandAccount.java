package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BrandAccount  {
  
  @ApiModelProperty(required = true, value = "")

  private String brandAccountId;
 /**
   * Get brandAccountId
   * @return brandAccountId
  **/
  @JsonProperty("brand_account_id")
  public String getBrandAccountId() {
    return brandAccountId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

