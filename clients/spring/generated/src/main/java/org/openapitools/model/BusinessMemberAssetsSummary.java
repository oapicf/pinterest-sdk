package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetIdWithPermissions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad accounts and profiles the business member/partner has access to.
 */

@Schema(name = "BusinessMemberAssetsSummary", description = "Ad accounts and profiles the business member/partner has access to.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-07T04:13:03.034594358Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BusinessMemberAssetsSummary {

  private List<@Valid AssetIdWithPermissions> adAccounts = new ArrayList<>();

  private List<@Valid AssetIdWithPermissions> profiles = new ArrayList<>();

  public BusinessMemberAssetsSummary adAccounts(List<@Valid AssetIdWithPermissions> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public BusinessMemberAssetsSummary addAdAccountsItem(AssetIdWithPermissions adAccountsItem) {
    if (this.adAccounts == null) {
      this.adAccounts = new ArrayList<>();
    }
    this.adAccounts.add(adAccountsItem);
    return this;
  }

  /**
   * List of ad account IDs and respective permission levels.
   * @return adAccounts
   */
  
  @Schema(name = "ad_accounts", description = "List of ad account IDs and respective permission levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_accounts")
  public List<@Valid AssetIdWithPermissions> getAdAccounts() {
    return adAccounts;
  }

  @JsonProperty("ad_accounts")
  public void setAdAccounts(List<@Valid AssetIdWithPermissions> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public BusinessMemberAssetsSummary profiles(List<@Valid AssetIdWithPermissions> profiles) {
    this.profiles = profiles;
    return this;
  }

  public BusinessMemberAssetsSummary addProfilesItem(AssetIdWithPermissions profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * List of profile IDs and respective permission levels.
   * @return profiles
   */
  
  @Schema(name = "profiles", description = "List of profile IDs and respective permission levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profiles")
  public List<@Valid AssetIdWithPermissions> getProfiles() {
    return profiles;
  }

  @JsonProperty("profiles")
  public void setProfiles(List<@Valid AssetIdWithPermissions> profiles) {
    this.profiles = profiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessMemberAssetsSummary businessMemberAssetsSummary = (BusinessMemberAssetsSummary) o;
    return Objects.equals(this.adAccounts, businessMemberAssetsSummary.adAccounts) &&
        Objects.equals(this.profiles, businessMemberAssetsSummary.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccounts, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsSummary {\n");
    sb.append("    adAccounts: ").append(toIndentedString(adAccounts)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

