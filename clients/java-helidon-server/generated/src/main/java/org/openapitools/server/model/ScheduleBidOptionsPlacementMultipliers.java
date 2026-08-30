package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class ScheduleBidOptionsPlacementMultipliers   {

    private Double browse;
    private Double relatedPins;
    private Double search;

    /**
     * Default constructor.
     */
    public ScheduleBidOptionsPlacementMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleBidOptionsPlacementMultipliers.
     *
     * @param browse Browse (home-feed and related surfaces)
     * @param relatedPins Related-Pins placement
     * @param search Search placement
     */
    public ScheduleBidOptionsPlacementMultipliers(
        Double browse, 
        Double relatedPins, 
        Double search
    ) {
        this.browse = browse;
        this.relatedPins = relatedPins;
        this.search = search;
    }



    /**
     * Browse (home-feed and related surfaces)
     * @return browse
     */
    public Double getBrowse() {
        return browse;
    }

    public void setBrowse(Double browse) {
        this.browse = browse;
    }

    /**
     * Related-Pins placement
     * @return relatedPins
     */
    public Double getRelatedPins() {
        return relatedPins;
    }

    public void setRelatedPins(Double relatedPins) {
        this.relatedPins = relatedPins;
    }

    /**
     * Search placement
     * @return search
     */
    public Double getSearch() {
        return search;
    }

    public void setSearch(Double search) {
        this.search = search;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleBidOptionsPlacementMultipliers {\n");
        
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

