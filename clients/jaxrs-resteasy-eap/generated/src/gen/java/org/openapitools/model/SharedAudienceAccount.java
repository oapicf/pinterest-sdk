package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SharedAudienceAccount   {
  
  private String accountId;
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
  }

  private AccountTypeEnum accountType;
  private Integer sharedOnTimestamp;

  /**
   * Account ID (ad account or business ID).
   **/
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Account ID (ad account or business ID).")
  @JsonProperty("account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Account name.
   **/
  
  @ApiModelProperty(example = "Home Depot USA", required = true, value = "Account name.")
  @JsonProperty("account_name")
  @NotNull
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * account type
   **/
  
  @ApiModelProperty(required = true, value = "account type")
  @JsonProperty("account_type")
  @NotNull
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Epoch timestamp in seconds for the shared audience event
   **/
  
  @ApiModelProperty(example = "1677003860", required = true, value = "Epoch timestamp in seconds for the shared audience event")
  @JsonProperty("shared_on_timestamp")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

