package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SSIOAccountItem;
import org.openapitools.server.model.SSIOAccountPMPName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Salesforce account details including bill-to information.
 */
public class SSIOAccount   {

    private List<@Valid SSIOAccountItem> billtoInfos = new ArrayList<>();
    private Boolean canEdit;
    private String currency;
    private Boolean eligible;
    private String error;
    private List<@Valid SSIOAccountPMPName> pmpNames = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SSIOAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOAccount.
     *
     * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
     * @param canEdit Advertiser eligible to update order lines
     * @param currency currency
     * @param eligible Advertiser eligible to create order lines
     * @param error Error indicator from Salesforce which could be \&quot;No Error\&quot;
     * @param pmpNames pmpNames
     */
    public SSIOAccount(
        List<@Valid SSIOAccountItem> billtoInfos, 
        Boolean canEdit, 
        String currency, 
        Boolean eligible, 
        String error, 
        List<@Valid SSIOAccountPMPName> pmpNames
    ) {
        this.billtoInfos = billtoInfos;
        this.canEdit = canEdit;
        this.currency = currency;
        this.eligible = eligible;
        this.error = error;
        this.pmpNames = pmpNames;
    }



    /**
     * An array of Salesforce account information that includes address, io terms, etc.
     * @return billtoInfos
     */
    public List<@Valid SSIOAccountItem> getBilltoInfos() {
        return billtoInfos;
    }

    public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
        this.billtoInfos = billtoInfos;
    }

    /**
     * Advertiser eligible to update order lines
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    /**
     * Get currency
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Advertiser eligible to create order lines
     * @return eligible
     */
    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    /**
     * Error indicator from Salesforce which could be \"No Error\"
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * Get pmpNames
     * @return pmpNames
     */
    public List<@Valid SSIOAccountPMPName> getPmpNames() {
        return pmpNames;
    }

    public void setPmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
        this.pmpNames = pmpNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOAccount {\n");
        
        sb.append("    billtoInfos: ").append(toIndentedString(billtoInfos)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    pmpNames: ").append(toIndentedString(pmpNames)).append("\n");
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

