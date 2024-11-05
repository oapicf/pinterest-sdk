package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedAudienceAccount   {
  
  private String accountId;
  private String accountName;


  public enum AccountTypeEnum {
    AD_ACCOUNT("AD_ACCOUNT"),
    BUSINESS_ACCOUNT("BUSINESS_ACCOUNT");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AccountTypeEnum accountType;
  private Integer sharedOnTimestamp;

  public SharedAudienceAccount () {

  }

  public SharedAudienceAccount (String accountId, String accountName, AccountTypeEnum accountType, Integer sharedOnTimestamp) {
    this.accountId = accountId;
    this.accountName = accountName;
    this.accountType = accountType;
    this.sharedOnTimestamp = sharedOnTimestamp;
  }

    
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

    
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

    
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

    
  @JsonProperty("shared_on_timestamp")
  public Integer getSharedOnTimestamp() {
    return sharedOnTimestamp;
  }
  public void setSharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAudienceAccount sharedAudienceAccount = (SharedAudienceAccount) o;
    return Objects.equals(accountId, sharedAudienceAccount.accountId) &&
        Objects.equals(accountName, sharedAudienceAccount.accountName) &&
        Objects.equals(accountType, sharedAudienceAccount.accountType) &&
        Objects.equals(sharedOnTimestamp, sharedAudienceAccount.sharedOnTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountType, sharedOnTimestamp);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
