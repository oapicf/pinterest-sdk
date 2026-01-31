package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.InnerProductCategoriesMetricsHighlights;

/**
 * Key performance metrics highlights for this product category
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCategoriesMetricsHighlights   {
  
  private InnerProductCategoriesMetricsHighlights engagement;
  private InnerProductCategoriesMetricsHighlights outboundClicks;
  private InnerProductCategoriesMetricsHighlights pinSaves;

  public ProductCategoriesMetricsHighlights () {

  }

  public ProductCategoriesMetricsHighlights (InnerProductCategoriesMetricsHighlights engagement, InnerProductCategoriesMetricsHighlights outboundClicks, InnerProductCategoriesMetricsHighlights pinSaves) {
    this.engagement = engagement;
    this.outboundClicks = outboundClicks;
    this.pinSaves = pinSaves;
  }

    
  @JsonProperty("engagement")
  public InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }
  public void setEngagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
  }

    
  @JsonProperty("outbound_clicks")
  public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }
  public void setOutboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
  }

    
  @JsonProperty("pin_saves")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
