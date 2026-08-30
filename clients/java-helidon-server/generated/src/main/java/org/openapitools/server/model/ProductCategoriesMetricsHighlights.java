package org.openapitools.server.model;

import org.openapitools.server.model.InnerProductCategoriesMetricsHighlights;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Key performance metrics highlights for this product category
 */
public class ProductCategoriesMetricsHighlights   {

    private InnerProductCategoriesMetricsHighlights engagement;
    private InnerProductCategoriesMetricsHighlights outboundClicks;
    private InnerProductCategoriesMetricsHighlights pinSaves;

    /**
     * Default constructor.
     */
    public ProductCategoriesMetricsHighlights() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductCategoriesMetricsHighlights.
     *
     * @param engagement Engagement metric value
     * @param outboundClicks Number of outbound clicks
     * @param pinSaves Number of pin saves
     */
    public ProductCategoriesMetricsHighlights(
        InnerProductCategoriesMetricsHighlights engagement, 
        InnerProductCategoriesMetricsHighlights outboundClicks, 
        InnerProductCategoriesMetricsHighlights pinSaves
    ) {
        this.engagement = engagement;
        this.outboundClicks = outboundClicks;
        this.pinSaves = pinSaves;
    }



    /**
     * Engagement metric value
     * @return engagement
     */
    public InnerProductCategoriesMetricsHighlights getEngagement() {
        return engagement;
    }

    public void setEngagement(InnerProductCategoriesMetricsHighlights engagement) {
        this.engagement = engagement;
    }

    /**
     * Number of outbound clicks
     * @return outboundClicks
     */
    public InnerProductCategoriesMetricsHighlights getOutboundClicks() {
        return outboundClicks;
    }

    public void setOutboundClicks(InnerProductCategoriesMetricsHighlights outboundClicks) {
        this.outboundClicks = outboundClicks;
    }

    /**
     * Number of pin saves
     * @return pinSaves
     */
    public InnerProductCategoriesMetricsHighlights getPinSaves() {
        return pinSaves;
    }

    public void setPinSaves(InnerProductCategoriesMetricsHighlights pinSaves) {
        this.pinSaves = pinSaves;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

