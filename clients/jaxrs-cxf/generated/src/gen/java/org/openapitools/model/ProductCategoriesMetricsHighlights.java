package org.openapitools.model;

import org.openapitools.model.InnerProductCategoriesMetricsHighlights;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key performance metrics highlights for this product category
 */
@ApiModel(description="Key performance metrics highlights for this product category")

public class ProductCategoriesMetricsHighlights  {
  
 /**
  * Engagement metric value
  */
  @ApiModelProperty(value = "Engagement metric value")

  @Valid

  private InnerProductCategoriesMetricsHighlights engagement;

 /**
  * Number of outbound clicks
  */
  @ApiModelProperty(value = "Number of outbound clicks")

  @Valid

  private InnerProductCategoriesMetricsHighlights outboundClicks;

 /**
  * Number of pin saves
  */
  @ApiModelProperty(value = "Number of pin saves")

  @Valid

  private InnerProductCategoriesMetricsHighlights pinSaves;
 /**
   * Engagement metric value
   * @return engagement
  **/
  @JsonProperty("engagement")
  public InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }

  public void setEngagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
  }

  public ProductCategoriesMetricsHighlights engagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

 /**
   * Number of outbound clicks
   * @return outboundClicks
  **/
  @JsonProperty("outbound_clicks")
  public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }

  public void setOutboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
  }

  public ProductCategoriesMetricsHighlights outboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
    return this;
  }

 /**
   * Number of pin saves
   * @return pinSaves
  **/
  @JsonProperty("pin_saves")
  public InnerProductCategoriesMetricsHighlights getPinSaves() {
    return pinSaves;
  }

  public void setPinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
  }

  public ProductCategoriesMetricsHighlights pinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
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
    ProductCategoriesMetricsHighlights productCategoriesMetricsHighlights = (ProductCategoriesMetricsHighlights) o;
    return Objects.equals(this.engagement, productCategoriesMetricsHighlights.engagement) &&
        Objects.equals(this.outboundClicks, productCategoriesMetricsHighlights.outboundClicks) &&
        Objects.equals(this.pinSaves, productCategoriesMetricsHighlights.pinSaves);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

