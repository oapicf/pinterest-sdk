package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Demographic detail for a single audience demographic
 */
public class AudienceDemographicValue   {

    private String key;
    private String name;
    private BigDecimal ratio;

    /**
     * Default constructor.
     */
    public AudienceDemographicValue() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceDemographicValue.
     *
     * @param key Unique key for demographic item
     * @param name Display name for demographic
     * @param ratio Value of demographic item as a percent of total audience
     */
    public AudienceDemographicValue(
        String key, 
        String name, 
        BigDecimal ratio
    ) {
        this.key = key;
        this.name = name;
        this.ratio = ratio;
    }



    /**
     * Unique key for demographic item
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Display name for demographic
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Value of demographic item as a percent of total audience
     * @return ratio
     */
    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceDemographicValue {\n");
        
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

