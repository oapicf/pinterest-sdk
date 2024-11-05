package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SharedAudienceAccount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SharedAudienceAccount   {
  private String accountId;
  private String accountName;
  public enum AccountTypeEnum {

    AD_ACCOUNT(String.valueOf("AD_ACCOUNT")), BUSINESS_ACCOUNT(String.valueOf("BUSINESS_ACCOUNT"));


    private String value;

    AccountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AccountTypeEnum fromString(String s) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AccountTypeEnum accountType;
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
  @NotNull  @Pattern(regexp="^\\d+$")public String getAccountId() {
    return accountId;
  }

  @JsonProperty("account_id")
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
  @NotNull public String getAccountName() {
    return accountName;
  }

  @JsonProperty("account_name")
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
  @NotNull public AccountTypeEnum getAccountType() {
    return accountType;
  }

  @JsonProperty("account_type")
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
  @NotNull public Integer getSharedOnTimestamp() {
    return sharedOnTimestamp;
  }

  @JsonProperty("shared_on_timestamp")
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

