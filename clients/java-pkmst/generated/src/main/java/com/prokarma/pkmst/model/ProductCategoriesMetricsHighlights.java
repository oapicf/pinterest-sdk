package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.InnerProductCategoriesMetricsHighlights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Key performance metrics highlights for this product category
 */
@ApiModel(description = "Key performance metrics highlights for this product category")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductCategoriesMetricsHighlights   {
  @JsonProperty("engagement")
  private InnerProductCategoriesMetricsHighlights engagement;

  @JsonProperty("outbound_clicks")
  private InnerProductCategoriesMetricsHighlights outboundClicks;

  @JsonProperty("pin_saves")
  private InnerProductCategoriesMetricsHighlights pinSaves;

  public ProductCategoriesMetricsHighlights engagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

  /**
   * Engagement metric value
   * @return engagement
   */
  @ApiModelProperty(value = "Engagement metric value")
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
   */
  @ApiModelProperty(value = "Number of outbound clicks")
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
   */
  @ApiModelProperty(value = "Number of pin saves")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

