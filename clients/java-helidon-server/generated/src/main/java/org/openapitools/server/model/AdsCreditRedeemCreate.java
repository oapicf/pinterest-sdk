package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class AdsCreditRedeemCreate   {

    private String offerCodeHash;
    private Boolean validateOnly;

    /**
     * Default constructor.
     */
    public AdsCreditRedeemCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsCreditRedeemCreate.
     *
     * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
     * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
     */
    public AdsCreditRedeemCreate(
        String offerCodeHash, 
        Boolean validateOnly
    ) {
        this.offerCodeHash = offerCodeHash;
        this.validateOnly = validateOnly;
    }



    /**
     * Takes in a SHA256 hash of the offerCode.
     * @return offerCodeHash
     */
    public String getOfferCodeHash() {
        return offerCodeHash;
    }

    public void setOfferCodeHash(String offerCodeHash) {
        this.offerCodeHash = offerCodeHash;
    }

    /**
     * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
     * @return validateOnly
     */
    public Boolean getValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsCreditRedeemCreate {\n");
        
        sb.append("    offerCodeHash: ").append(toIndentedString(offerCodeHash)).append("\n");
        sb.append("    validateOnly: ").append(toIndentedString(validateOnly)).append("\n");
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

