package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryItem;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
@ApiModel(description = "Ad accounts and profiles the member/partner will be granted access to with this invite/request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteAssetsSummary   {
  @JsonProperty("ad_accounts")
  private List<@Valid InviteAssetsSummaryItem> adAccounts = null;

  @JsonProperty("profiles")
  private List<@Valid InviteAssetsSummaryItem> profiles = null;

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
  **/
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels that will be assigned.")
  public List<@Valid InviteAssetsSummaryItem> getAdAccounts() {
    return adAccounts;
  }

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
  **/
  @ApiModelProperty(value = "List of profile IDs and respective permission levels that will be assigned.")
  public List<@Valid InviteAssetsSummaryItem> getProfiles() {
    return profiles;
  }

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

