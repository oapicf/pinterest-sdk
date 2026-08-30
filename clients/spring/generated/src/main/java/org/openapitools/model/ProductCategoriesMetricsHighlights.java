package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.InnerProductCategoriesMetricsHighlights;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Key performance metrics highlights for this product category
 */

@Schema(name = "ProductCategoriesMetricsHighlights", description = "Key performance metrics highlights for this product category")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductCategoriesMetricsHighlights {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable InnerProductCategoriesMetricsHighlights engagement;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable InnerProductCategoriesMetricsHighlights outboundClicks;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable InnerProductCategoriesMetricsHighlights pinSaves;

  public ProductCategoriesMetricsHighlights engagement(@Nullable InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
    return this;
  }

  /**
   * Engagement metric value
   * @return engagement
   */
  @Valid 
  @Schema(name = "engagement", description = "Engagement metric value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement")
  public @Nullable InnerProductCategoriesMetricsHighlights getEngagement() {
    return engagement;
  }

  @JsonProperty("engagement")
  public void setEngagement(@Nullable InnerProductCategoriesMetricsHighlights engagement) {
    this.engagement = engagement;
  }

  public ProductCategoriesMetricsHighlights outboundClicks(@Nullable InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
    return this;
  }

  /**
   * Number of outbound clicks
   * @return outboundClicks
   */
  @Valid 
  @Schema(name = "outbound_clicks", description = "Number of outbound clicks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outbound_clicks")
  public @Nullable InnerProductCategoriesMetricsHighlights getOutboundClicks() {
    return outboundClicks;
  }

  @JsonProperty("outbound_clicks")
  public void setOutboundClicks(@Nullable InnerProductCategoriesMetricsHighlights outboundClicks) {
    this.outboundClicks = outboundClicks;
  }

  public ProductCategoriesMetricsHighlights pinSaves(@Nullable InnerProductCategoriesMetricsHighlights pinSaves) {
    this.pinSaves = pinSaves;
    return this;
  }

  /**
   * Number of pin saves
   * @return pinSaves
   */
  @Valid 
  @Schema(name = "pin_saves", description = "Number of pin saves", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_saves")
  public @Nullable InnerProductCategoriesMetricsHighlights getPinSaves() {
    return pinSaves;
  }

  @JsonProperty("pin_saves")
  public void setPinSaves(@Nullable InnerProductCategoriesMetricsHighlights pinSaves) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

