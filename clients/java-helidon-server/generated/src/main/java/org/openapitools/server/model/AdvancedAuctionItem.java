package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AdvancedAuctionBidOptions;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.Language;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdvancedAuctionItem   {

    private AdvancedAuctionBidOptions bidOptions;
    private Country country;
    private String itemId;
    private Language language;

    /**
     * Default constructor.
     */
    public AdvancedAuctionItem() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionItem.
     *
     * @param bidOptions bidOptions
     * @param country country
     * @param itemId The catalog retail item id in the merchant namespace
     * @param language language
     */
    public AdvancedAuctionItem(
        AdvancedAuctionBidOptions bidOptions, 
        Country country, 
        String itemId, 
        Language language
    ) {
        this.bidOptions = bidOptions;
        this.country = country;
        this.itemId = itemId;
        this.language = language;
    }



    /**
     * Get bidOptions
     * @return bidOptions
     */
    public AdvancedAuctionBidOptions getBidOptions() {
        return bidOptions;
    }

    public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
        this.bidOptions = bidOptions;
    }

    /**
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * The catalog retail item id in the merchant namespace
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Get language
     * @return language
     */
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionItem {\n");
        
        sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

