package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsPlacementMultipliers   {

    private BigDecimal browse;
    private BigDecimal relatedPins;
    private BigDecimal search;

    /**
     * Default constructor.
     */
    public BidOptionsPlacementMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create BidOptionsPlacementMultipliers.
     *
     * @param browse browse
     * @param relatedPins relatedPins
     * @param search search
     */
    public BidOptionsPlacementMultipliers(
        BigDecimal browse, 
        BigDecimal relatedPins, 
        BigDecimal search
    ) {
        this.browse = browse;
        this.relatedPins = relatedPins;
        this.search = search;
    }



    /**
     * Get browse
     * @return browse
     */
    public BigDecimal getBrowse() {
        return browse;
    }

    public void setBrowse(BigDecimal browse) {
        this.browse = browse;
    }

    /**
     * Get relatedPins
     * @return relatedPins
     */
    public BigDecimal getRelatedPins() {
        return relatedPins;
    }

    public void setRelatedPins(BigDecimal relatedPins) {
        this.relatedPins = relatedPins;
    }

    /**
     * Get search
     * @return search
     */
    public BigDecimal getSearch() {
        return search;
    }

    public void setSearch(BigDecimal search) {
        this.search = search;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidOptionsPlacementMultipliers {\n");
        
        sb.append("    browse: ").append(toIndentedString(browse)).append("\n");
        sb.append("    relatedPins: ").append(toIndentedString(relatedPins)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
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

