package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceAccountType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SharedAudienceAccount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SharedAudienceAccount {

  private String accountId;

  private String accountName;

  private AudienceAccountType accountType;

  private Integer sharedOnTimestamp;

  public SharedAudienceAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SharedAudienceAccount(String accountId, String accountName, AudienceAccountType accountType, Integer sharedOnTimestamp) {
    this.accountId = accountId;
    this.accountName = accountName;
    this.accountType = accountType;
    this.sharedOnTimestamp = sharedOnTimestamp;
  }

  public SharedAudienceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account ID (ad account or business ID).
   * @return accountId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "account_id", example = "549755885175", description = "Account ID (ad account or business ID).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("account_id")
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
  @NotNull 
  @Schema(name = "account_name", example = "Home Depot USA", description = "Account name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }

  @JsonProperty("account_name")
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
  @NotNull @Valid 
  @Schema(name = "account_type", description = "account type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account_type")
  public AudienceAccountType getAccountType() {
    return accountType;
  }

  @JsonProperty("account_type")
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
  @NotNull 
  @Schema(name = "shared_on_timestamp", example = "1677003860", description = "Epoch timestamp in seconds for the shared audience event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shared_on_timestamp")
  public Integer getSharedOnTimestamp() {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

