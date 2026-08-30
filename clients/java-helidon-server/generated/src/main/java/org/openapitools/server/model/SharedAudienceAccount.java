package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AudienceAccountType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SharedAudienceAccount   {

    private String accountId;
    private String accountName;
    private AudienceAccountType accountType;
    private Integer sharedOnTimestamp;

    /**
     * Default constructor.
     */
    public SharedAudienceAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create SharedAudienceAccount.
     *
     * @param accountId Account ID (ad account or business ID).
     * @param accountName Account name.
     * @param accountType account type
     * @param sharedOnTimestamp Epoch timestamp in seconds for the shared audience event
     */
    public SharedAudienceAccount(
        String accountId, 
        String accountName, 
        AudienceAccountType accountType, 
        Integer sharedOnTimestamp
    ) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.sharedOnTimestamp = sharedOnTimestamp;
    }



    /**
     * Account ID (ad account or business ID).
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Account name.
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * account type
     * @return accountType
     */
    public AudienceAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AudienceAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Epoch timestamp in seconds for the shared audience event
     * @return sharedOnTimestamp
     */
    public Integer getSharedOnTimestamp() {
        return sharedOnTimestamp;
    }

    public void setSharedOnTimestamp(Integer sharedOnTimestamp) {
        this.sharedOnTimestamp = sharedOnTimestamp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharedAudienceAccount {\n");
        
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    sharedOnTimestamp: ").append(toIndentedString(sharedOnTimestamp)).append("\n");
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

