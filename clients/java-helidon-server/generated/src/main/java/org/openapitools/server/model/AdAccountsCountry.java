package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdAccountsCountry   {

    private Country code;
    private String currency;
    private BigDecimal index;
    private String name;

    /**
     * Default constructor.
     */
    public AdAccountsCountry() {
    // JSON-B / Jackson
    }

    /**
     * Create AdAccountsCountry.
     *
     * @param code code
     * @param currency Country currency.
     * @param index Country index
     * @param name Country name
     */
    public AdAccountsCountry(
        Country code, 
        String currency, 
        BigDecimal index, 
        String name
    ) {
        this.code = code;
        this.currency = currency;
        this.index = index;
        this.name = name;
    }



    /**
     * Get code
     * @return code
     */
    public Country getCode() {
        return code;
    }

    public void setCode(Country code) {
        this.code = code;
    }

    /**
     * Country currency.
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Country index
     * @return index
     */
    public BigDecimal getIndex() {
        return index;
    }

    public void setIndex(BigDecimal index) {
        this.index = index;
    }

    /**
     * Country name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdAccountsCountry {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

