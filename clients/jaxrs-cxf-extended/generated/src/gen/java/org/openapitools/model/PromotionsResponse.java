package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionArrayElement;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid PromotionArrayElement> promotions = new ArrayList<>();
 /**
  * Get promotions
  * @return promotions
  */
  @JsonProperty("promotions")
  public List<@Valid PromotionArrayElement> getPromotions() {
    return promotions;
  }

  /**
   * Sets the <code>promotions</code> property.
   */
 public void setPromotions(List<@Valid PromotionArrayElement> promotions) {
    this.promotions = promotions;
  }

  /**
   * Sets the <code>promotions</code> property.
   */
  public PromotionsResponse promotions(List<@Valid PromotionArrayElement> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Adds a new item to the <code>promotions</code> list.
   */
  public PromotionsResponse addPromotionsItem(PromotionArrayElement promotionsItem) {
    this.promotions.add(promotionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

