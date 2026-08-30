package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */

@Schema(name = "InviteAssetsSummary", description = "Ad accounts and profiles the member/partner will be granted access to with this invite/request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteAssetsSummary {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid InviteAssetsSummaryItem> adAccounts = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid InviteAssetsSummaryItem> profiles = new ArrayList<>();

  public InviteAssetsSummary adAccounts(List<@Valid InviteAssetsSummaryItem> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public InviteAssetsSummary addAdAccountsItem(InviteAssetsSummaryItem adAccountsItem) {
    if (this.adAccounts == null) {
      this.adAccounts = new ArrayList<>();
    }
    this.adAccounts.add(adAccountsItem);
    return this;
  }

  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   * @return adAccounts
   */
  @Valid 
  @Schema(name = "ad_accounts", description = "List of ad account IDs and respective permission levels that will be assigned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_accounts")
  public List<@Valid InviteAssetsSummaryItem> getAdAccounts() {
    return adAccounts;
  }

  @JsonProperty("ad_accounts")
  public void setAdAccounts(List<@Valid InviteAssetsSummaryItem> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public InviteAssetsSummary profiles(List<@Valid InviteAssetsSummaryItem> profiles) {
    this.profiles = profiles;
    return this;
  }

  public InviteAssetsSummary addProfilesItem(InviteAssetsSummaryItem profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * List of profile IDs and respective permission levels that will be assigned.
   * @return profiles
   */
  @Valid 
  @Schema(name = "profiles", description = "List of profile IDs and respective permission levels that will be assigned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profiles")
  public List<@Valid InviteAssetsSummaryItem> getProfiles() {
    return profiles;
  }

  @JsonProperty("profiles")
  public void setProfiles(List<@Valid InviteAssetsSummaryItem> profiles) {
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
    InviteAssetsSummary inviteAssetsSummary = (InviteAssetsSummary) o;
    return Objects.equals(this.adAccounts, inviteAssetsSummary.adAccounts) &&
        Objects.equals(this.profiles, inviteAssetsSummary.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccounts, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAssetsSummary {\n");
    sb.append("    adAccounts: ").append(toIndentedString(adAccounts)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

