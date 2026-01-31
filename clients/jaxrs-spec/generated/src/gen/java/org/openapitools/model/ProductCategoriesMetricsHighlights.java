package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InnerProductCategoriesMetricsHighlights;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Key performance metrics highlights for this product category
 **/
@ApiModel(description = "Key performance metrics highlights for this product category")
@JsonTypeName("ProductCategoriesMetricsHighlights")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductCategoriesMetricsHighlights   {
  private InnerProductCategoriesMetricsHighlights engagement;
  private InnerProductCategoriesMetricsHighlights outboundClicks;
  private InnerProductCategoriesMetricsHighlights pinSaves;

  public ProductCategoriesMetricsHighlights() {
  }

  /**
   * Engagement metric value
   **/
  public ProductCategoriesMetricsHighlights engagement(InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

  
  @ApiModelProperty(value = "Engagement metric value")
  @JsonProperty("engagement")
  @Valid public InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }

  @JsonProperty("engagement")
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
  @Valid public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }

  @JsonProperty("outbound_clicks")
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
  @Valid public InnerProductCategoriesMetricsHighlights getPinSaves() {
    return pinSaves;
  }

  @JsonProperty("pin_saves")
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

