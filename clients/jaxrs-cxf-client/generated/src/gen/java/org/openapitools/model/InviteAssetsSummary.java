package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryAdAccountsInner;
import org.openapitools.model.InviteAssetsSummaryProfilesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 **/
@ApiModel(description="Ad accounts and profiles the member/partner will be granted access to with this invite/request.")

public class InviteAssetsSummary  {
  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels that will be assigned.")
 /**
   * List of ad account IDs and respective permission levels that will be assigned.
  **/
  private List<InviteAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();

  @ApiModelProperty(value = "List of profile IDs and respective permission levels that will be assigned.")
 /**
   * List of profile IDs and respective permission levels that will be assigned.
  **/
  private List<InviteAssetsSummaryProfilesInner> profiles = new ArrayList<>();
 /**
   * List of ad account IDs and respective permission levels that will be assigned.
   * @return adAccounts
  **/
  @JsonProperty("ad_accounts")
  public List<InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public InviteAssetsSummary adAccounts(List<InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public InviteAssetsSummary addAdAccountsItem(InviteAssetsSummaryAdAccountsInner adAccountsItem) {
    this.adAccounts.add(adAccountsItem);
    return this;
  }

 /**
   * List of profile IDs and respective permission levels that will be assigned.
   * @return profiles
  **/
  @JsonProperty("profiles")
  public List<InviteAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
  }

  public InviteAssetsSummary profiles(List<InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  public InviteAssetsSummary addProfilesItem(InviteAssetsSummaryProfilesInner profilesItem) {
    this.profiles.add(profilesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

