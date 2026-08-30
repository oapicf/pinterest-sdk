package org.openapitools.model;

import org.openapitools.model.AudienceAccountType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

 /**
  * account type
  */
  @ApiModelProperty(required = true, value = "account type")

  private AudienceAccountType accountType;

 /**
  * Epoch timestamp in seconds for the shared audience event
  */
  @ApiModelProperty(example = "1677003860", required = true, value = "Epoch timestamp in seconds for the shared audience event")

  private Integer sharedOnTimestamp;
 /**
   * Account ID (ad account or business ID).
   * @return accountId
  **/
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Account name.
   * @return accountName
  **/
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public SharedAudienceAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

 /**
   * account type
   * @return accountType
  **/
  @JsonProperty("account_type")
  public AudienceAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AudienceAccountType accountType) {
    this.accountType = accountType;
  }

  public SharedAudienceAccount accountType(AudienceAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Epoch timestamp in seconds for the shared audience event
   * @return sharedOnTimestamp
  **/
  @JsonProperty("shared_on_timestamp")
  public Integer getSharedOnTimestamp() {
    return sharedOnTimestamp;
  }

  public void setSharedOnTimestamp(Integer sharedOnTimestamp) {
    this.sharedOnTimestamp = sharedOnTimestamp;
  }

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

