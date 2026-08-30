package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceAccountType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("SharedAudienceAccount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SharedAudienceAccount   {
  private String accountId;
  private String accountName;
  private AudienceAccountType accountType;
  private Integer sharedOnTimestamp;

  public SharedAudienceAccount() {
  }

  @JsonCreator
  public SharedAudienceAccount(
    @JsonProperty(required = true, value = "account_id") String accountId,
    @JsonProperty(required = true, value = "account_name") String accountName,
    @JsonProperty(required = true, value = "account_type") AudienceAccountType accountType,
    @JsonProperty(required = true, value = "shared_on_timestamp") Integer sharedOnTimestamp
  ) {
    this.accountId = accountId;
    this.accountName = accountName;
    this.accountType = accountType;
    this.sharedOnTimestamp = sharedOnTimestamp;
  }

  /**
   * Account ID (ad account or business ID).
   **/
  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Account ID (ad account or business ID).")
  @JsonProperty(required = true, value = "account_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAccountId() {
    return accountId;
  }

  @JsonProperty(required = true, value = "account_id")
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
  @JsonProperty(required = true, value = "account_name")
  @NotNull public String getAccountName() {
    return accountName;
  }

  @JsonProperty(required = true, value = "account_name")
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * account type
   **/
  public SharedAudienceAccount accountType(AudienceAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "account type")
  @JsonProperty(required = true, value = "account_type")
  @NotNull public AudienceAccountType getAccountType() {
    return accountType;
  }

  @JsonProperty(required = true, value = "account_type")
  public void setAccountType(AudienceAccountType accountType) {
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
  @JsonProperty(required = true, value = "shared_on_timestamp")
  @NotNull public Integer getSharedOnTimestamp() {
    return sharedOnTimestamp;
  }

  @JsonProperty(required = true, value = "shared_on_timestamp")
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
