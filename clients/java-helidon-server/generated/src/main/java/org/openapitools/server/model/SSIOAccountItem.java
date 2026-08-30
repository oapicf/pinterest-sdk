package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SSIOAccountAddress;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Salesforce account item with billing and terms information.
 */
public class SSIOAccountItem   {

    private List<@Valid SSIOAccountAddress> addresses = new ArrayList<>();
    private String id;
    private String ioTerms;
    private String ioTermsId;
    private String ioType;
    private String rowTerms;
    private String rowTermsId;
    private String usTerms;
    private String usTermsId;

    /**
     * Default constructor.
     */
    public SSIOAccountItem() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOAccountItem.
     *
     * @param addresses Address information that is associated with this account.
     * @param id Salesforce id for billto_info
     * @param ioTerms Salesforce text for IO Terms and Conditions
     * @param ioTermsId Salesforce id for IO Terms and Conditions
     * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper
     * @param rowTerms Salesforce text for Rest of the World Terms and Conditions
     * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions
     * @param usTerms Salesforce text for US Terms and Conditions
     * @param usTermsId Salesforce id for US Terms and Conditions
     */
    public SSIOAccountItem(
        List<@Valid SSIOAccountAddress> addresses, 
        String id, 
        String ioTerms, 
        String ioTermsId, 
        String ioType, 
        String rowTerms, 
        String rowTermsId, 
        String usTerms, 
        String usTermsId
    ) {
        this.addresses = addresses;
        this.id = id;
        this.ioTerms = ioTerms;
        this.ioTermsId = ioTermsId;
        this.ioType = ioType;
        this.rowTerms = rowTerms;
        this.rowTermsId = rowTermsId;
        this.usTerms = usTerms;
        this.usTermsId = usTermsId;
    }



    /**
     * Address information that is associated with this account.
     * @return addresses
     */
    public List<@Valid SSIOAccountAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<@Valid SSIOAccountAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * Salesforce id for billto_info
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Salesforce text for IO Terms and Conditions
     * @return ioTerms
     */
    public String getIoTerms() {
        return ioTerms;
    }

    public void setIoTerms(String ioTerms) {
        this.ioTerms = ioTerms;
    }

    /**
     * Salesforce id for IO Terms and Conditions
     * @return ioTermsId
     */
    public String getIoTermsId() {
        return ioTermsId;
    }

    public void setIoTermsId(String ioTermsId) {
        this.ioTermsId = ioTermsId;
    }

    /**
     * Insertion Order Type - Pinterest Paper or Agency Paper
     * @return ioType
     */
    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    /**
     * Salesforce text for Rest of the World Terms and Conditions
     * @return rowTerms
     */
    public String getRowTerms() {
        return rowTerms;
    }

    public void setRowTerms(String rowTerms) {
        this.rowTerms = rowTerms;
    }

    /**
     * Salesforce id for Rest of the World Terms and Conditions
     * @return rowTermsId
     */
    public String getRowTermsId() {
        return rowTermsId;
    }

    public void setRowTermsId(String rowTermsId) {
        this.rowTermsId = rowTermsId;
    }

    /**
     * Salesforce text for US Terms and Conditions
     * @return usTerms
     */
    public String getUsTerms() {
        return usTerms;
    }

    public void setUsTerms(String usTerms) {
        this.usTerms = usTerms;
    }

    /**
     * Salesforce id for US Terms and Conditions
     * @return usTermsId
     */
    public String getUsTermsId() {
        return usTermsId;
    }

    public void setUsTermsId(String usTermsId) {
        this.usTermsId = usTermsId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOAccountItem {\n");
        
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ioTerms: ").append(toIndentedString(ioTerms)).append("\n");
        sb.append("    ioTermsId: ").append(toIndentedString(ioTermsId)).append("\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    rowTerms: ").append(toIndentedString(rowTerms)).append("\n");
        sb.append("    rowTermsId: ").append(toIndentedString(rowTermsId)).append("\n");
        sb.append("    usTerms: ").append(toIndentedString(usTerms)).append("\n");
        sb.append("    usTermsId: ").append(toIndentedString(usTermsId)).append("\n");
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

