package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InnerProductCategoriesMetricsHighlights;



/**
 * Key performance metrics highlights for this product category
 **/

@ApiModel(description = "Key performance metrics highlights for this product category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductCategoriesMetricsHighlights   {
  @JsonProperty("engagement")
  private InnerProductCategoriesMetricsHighlights engagement;

  @JsonProperty("outbound_clicks")
  private InnerProductCategoriesMetricsHighlights outboundClicks;

  @JsonProperty("pin_saves")
  private InnerProductCategoriesMetricsHighlights pinSaves;

  /**
   * Engagement metric value
   **/
  public ProductCategoriesMetricsHighlights engagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

  
  @ApiModelProperty(value = "Engagement metric value")
  @JsonProperty("engagement")
  public InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }
  public void setEngagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
  }

  /**
   * Number of outbound clicks
   **/
  public ProductCategoriesMetricsHighlights outboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
    return this;
  }

  
  @ApiModelProperty(value = "Number of outbound clicks")
  @JsonProperty("outbound_clicks")
  public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }
  public void setOutboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
  }

  /**
   * Number of pin saves
   **/
  public ProductCategoriesMetricsHighlights pinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
    return this;
  }

  
  @ApiModelProperty(value = "Number of pin saves")
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

