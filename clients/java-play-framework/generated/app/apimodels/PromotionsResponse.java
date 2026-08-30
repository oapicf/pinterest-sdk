package apimodels;

import apimodels.PromotionArrayElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PromotionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromotionsResponse   {
  @JsonProperty("promotions")
  @Valid

  private List<@Valid PromotionArrayElement> promotions = null;

  public PromotionsResponse promotions(List<@Valid PromotionArrayElement> promotions) {
    this.promotions = promotions;
    return this;
  }

  public PromotionsResponse addPromotionsItem(PromotionArrayElement promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * Get promotions
   * @return promotions
  **/
  public List<@Valid PromotionArrayElement> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<@Valid PromotionArrayElement> promotions) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

