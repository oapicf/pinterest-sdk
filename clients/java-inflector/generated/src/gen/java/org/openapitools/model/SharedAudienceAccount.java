package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SharedAudienceAccount   {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("account_name")
  private String accountName;

  /**
   * account type
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("account_type")
  private AccountTypeEnum accountType;

  @JsonProperty("shared_on_timestamp")
  private Integer sharedOnTimestamp;

  /**
   * Account ID (ad account or business ID).
   **/
  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Account ID (ad account or business ID).")
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Account name.
   **/
  public SharedAudienceAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  
  @ApiModelProperty(example = "Home Depot USA", required = true, value = "Account name.")
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * account type
   **/
  public SharedAudienceAccount accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "account type")
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Epoch timestamp in seconds for the shared audience event
   **/
  public SharedAudienceAccount sharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1677003860", required = true, value = "Epoch timestamp in seconds for the shared audience event")
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

