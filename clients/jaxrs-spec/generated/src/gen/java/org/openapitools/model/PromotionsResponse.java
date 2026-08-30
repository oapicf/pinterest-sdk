package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionArrayElement;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PromotionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PromotionsResponse   {
  private @Valid List<@Valid PromotionArrayElement> promotions = new ArrayList<>();

  public PromotionsResponse() {
  }

  /**
   **/
  public PromotionsResponse promotions(List<@Valid PromotionArrayElement> promotions) {
    this.promotions = promotions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("promotions")
  @Valid public List<@Valid PromotionArrayElement> getPromotions() {
    return promotions;
  }

  @JsonProperty("promotions")
  public void setPromotions(List<@Valid PromotionArrayElement> promotions) {
    this.promotions = promotions;
  }

  public PromotionsResponse addPromotionsItem(PromotionArrayElement promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }

    this.promotions.add(promotionsItem);
    return this;
  }

  public PromotionsResponse removePromotionsItem(PromotionArrayElement promotionsItem) {
    if (promotionsItem != null && this.promotions != null) {
      this.promotions.remove(promotionsItem);
    }

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
    PromotionsResponse promotionsResponse = (PromotionsResponse) o;
    return Objects.equals(this.promotions, promotionsResponse.promotions);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
