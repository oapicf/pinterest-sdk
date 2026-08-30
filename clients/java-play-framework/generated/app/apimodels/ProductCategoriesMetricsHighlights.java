package apimodels;

import apimodels.InnerProductCategoriesMetricsHighlights;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Key performance metrics highlights for this product category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductCategoriesMetricsHighlights   {
  @JsonProperty("engagement")
  @Valid

  private InnerProductCategoriesMetricsHighlights engagement;

  @JsonProperty("outbound_clicks")
  @Valid

  private InnerProductCategoriesMetricsHighlights outboundClicks;

  @JsonProperty("pin_saves")
  @Valid

  private InnerProductCategoriesMetricsHighlights pinSaves;

  public ProductCategoriesMetricsHighlights engagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

   /**
   * Engagement metric value
   * @return engagement
  **/
  public InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }

  public void setEngagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
  }

  public ProductCategoriesMetricsHighlights outboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
    return this;
  }

   /**
   * Number of outbound clicks
   * @return outboundClicks
  **/
  public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }

  public void setOutboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
  }

  public ProductCategoriesMetricsHighlights pinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
    return this;
  }

   /**
   * Number of pin saves
   * @return pinSaves
  **/
  public InnerProductCategoriesMetricsHighlights getPinSaves() {
    return pinSaves;
  }

  public void setPinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCategoriesMetricsHighlights productCategoriesMetricsHighlights = (ProductCategoriesMetricsHighlights) o;
    return Objects.equals(engagement, productCategoriesMetricsHighlights.engagement) &&
        Objects.equals(outboundClicks, productCategoriesMetricsHighlights.outboundClicks) &&
        Objects.equals(pinSaves, productCategoriesMetricsHighlights.pinSaves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagement, outboundClicks, pinSaves);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCategoriesMetricsHighlights {\n");
    
    sb.append("    engagement: ").append(toIndentedString(engagement)).append("\n");
    sb.append("    outboundClicks: ").append(toIndentedString(outboundClicks)).append("\n");
    sb.append("    pinSaves: ").append(toIndentedString(pinSaves)).append("\n");
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

