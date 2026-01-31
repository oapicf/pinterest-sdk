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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionArrayElement;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionsResponse   {
  
  private List<PromotionArrayElement> promotions = new ArrayList<>();

  /**
   */
  public PromotionsResponse promotions(List<PromotionArrayElement> promotions) {
    this.promotions = promotions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("promotions")
  public List<PromotionArrayElement> getPromotions() {
    return promotions;
  }
  public void setPromotions(List<PromotionArrayElement> promotions) {
    this.promotions = promotions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionsResponse promotionsResponse = (PromotionsResponse) o;
    return Objects.equals(promotions, promotionsResponse.promotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionsResponse {\n");
    
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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

