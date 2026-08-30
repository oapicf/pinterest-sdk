package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Related Keyword information of the editorial article
 */
public class KeywordInfo   {

    private String name;
    private BigDecimal pctGrowthMom;

    /**
     * Default constructor.
     */
    public KeywordInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordInfo.
     *
     * @param name Keyword Name
     * @param pctGrowthMom MoM growth as a percentage, if there is no growth rate, this field is not present
     */
    public KeywordInfo(
        String name, 
        BigDecimal pctGrowthMom
    ) {
        this.name = name;
        this.pctGrowthMom = pctGrowthMom;
    }



    /**
     * Keyword Name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * MoM growth as a percentage, if there is no growth rate, this field is not present
     * @return pctGrowthMom
     */
    public BigDecimal getPctGrowthMom() {
        return pctGrowthMom;
    }

    public void setPctGrowthMom(BigDecimal pctGrowthMom) {
        this.pctGrowthMom = pctGrowthMom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordInfo {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
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

