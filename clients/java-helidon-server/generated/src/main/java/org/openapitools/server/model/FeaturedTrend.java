package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.InterestsEnum;
import org.openapitools.server.model.ProductCategoryRegion;
import org.openapitools.server.model.TrendingTopic;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Featured trending topics for a specific interest and market
 */
public class FeaturedTrend   {

    private InterestsEnum interest;
    private ProductCategoryRegion market;
    private List<@Valid TrendingTopic> trends = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FeaturedTrend() {
    // JSON-B / Jackson
    }

    /**
     * Create FeaturedTrend.
     *
     * @param interest The main interest category
     * @param market Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)
     * @param trends List of trending topics within this interest category
     */
    public FeaturedTrend(
        InterestsEnum interest, 
        ProductCategoryRegion market, 
        List<@Valid TrendingTopic> trends
    ) {
        this.interest = interest;
        this.market = market;
        this.trends = trends;
    }



    /**
     * The main interest category
     * @return interest
     */
    public InterestsEnum getInterest() {
        return interest;
    }

    public void setInterest(InterestsEnum interest) {
        this.interest = interest;
    }

    /**
     * Market code (e.g., 'US', 'UK', etc.)
     * @return market
     */
    public ProductCategoryRegion getMarket() {
        return market;
    }

    public void setMarket(ProductCategoryRegion market) {
        this.market = market;
    }

    /**
     * List of trending topics within this interest category
     * @return trends
     */
    public List<@Valid TrendingTopic> getTrends() {
        return trends;
    }

    public void setTrends(List<@Valid TrendingTopic> trends) {
        this.trends = trends;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeaturedTrend {\n");
        
        sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
        sb.append("    market: ").append(toIndentedString(market)).append("\n");
        sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

