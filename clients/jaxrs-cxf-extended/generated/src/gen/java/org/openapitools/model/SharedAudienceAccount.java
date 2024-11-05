package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudienceAccount  {
  
 /**
  * Account ID (ad account or business ID).
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Account ID (ad account or business ID).")
  private String accountId;

 /**
  * Account name.
  */
  @ApiModelProperty(example = "Home Depot USA", required = true, value = "Account name.")
  private String accountName;

public enum AccountTypeEnum {

    @JsonProperty("AD_ACCOUNT") AD_ACCOUNT(String.valueOf("AD_ACCOUNT")),
    @JsonProperty("BUSINESS_ACCOUNT") BUSINESS_ACCOUNT(String.valueOf("BUSINESS_ACCOUNT"));

    private String value;

    AccountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * account type
  */
  @ApiModelProperty(required = true, value = "account type")
  private AccountTypeEnum accountType;

 /**
  * Epoch timestamp in seconds for the shared audience event
  */
  @ApiModelProperty(example = "1677003860", required = true, value = "Epoch timestamp in seconds for the shared audience event")
  private Integer sharedOnTimestamp;
 /**
  * Account ID (ad account or business ID).
  * @return accountId
  */
  @JsonProperty("account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAccountId() {
    return accountId;
  }

  /**
   * Sets the <code>accountId</code> property.
   */
 public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Sets the <code>accountId</code> property.
   */
  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
  * Account name.
  * @return accountName
  */
  @JsonProperty("account_name")
  @NotNull
  public String getAccountName() {
    return accountName;
  }

  /**
   * Sets the <code>accountName</code> property.
   */
 public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * Sets the <code>accountName</code> property.
   */
  public SharedAudienceAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

 /**
  * account type
  * @return accountType
  */
  @JsonProperty("account_type")
  @NotNull
  public String getAccountType() {
    return accountType == null ? null : accountType.value();
  }

  /**
   * Sets the <code>accountType</code> property.
   */
 public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Sets the <code>accountType</code> property.
   */
  public SharedAudienceAccount accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
  * Epoch timestamp in seconds for the shared audience event
  * @return sharedOnTimestamp
  */
  @JsonProperty("shared_on_timestamp")
  @NotNull
  public Integer getSharedOnTimestamp() {
    return sharedOnTimestamp;
  }

  /**
   * Sets the <code>sharedOnTimestamp</code> property.
   */
 public void setSharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
  }

  /**
   * Sets the <code>sharedOnTimestamp</code> property.
   */
  public SharedAudienceAccount sharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
    return this;
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
    return Objects.equals(this.accountId, sharedAudienceAccount.accountId) &&
        Objects.equals(this.accountName, sharedAudienceAccount.accountName) &&
        Objects.equals(this.accountType, sharedAudienceAccount.accountType) &&
        Objects.equals(this.sharedOnTimestamp, sharedAudienceAccount.sharedOnTimestamp);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

