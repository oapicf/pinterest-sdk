package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AudienceAccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SharedAudienceAccount
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SharedAudienceAccount   {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("account_name")
  private String accountName;

  @JsonProperty("account_type")
  private AudienceAccountType accountType;

  @JsonProperty("shared_on_timestamp")
  private Integer sharedOnTimestamp;

  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account ID (ad account or business ID).
   * @return accountId
   */
  @ApiModelProperty(example = "549755885175", required = true, value = "Account ID (ad account or business ID).")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SharedAudienceAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Account name.
   * @return accountName
   */
  @ApiModelProperty(example = "Home Depot USA", required = true, value = "Account name.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public SharedAudienceAccount accountType(AudienceAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * account type
   * @return accountType
   */
  @ApiModelProperty(required = true, value = "account type")
  public AudienceAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AudienceAccountType accountType) {
    this.accountType = accountType;
  }

  public SharedAudienceAccount sharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
    return this;
  }

  /**
   * Epoch timestamp in seconds for the shared audience event
   * @return sharedOnTimestamp
   */
  @ApiModelProperty(example = "1677003860", required = true, value = "Epoch timestamp in seconds for the shared audience event")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

