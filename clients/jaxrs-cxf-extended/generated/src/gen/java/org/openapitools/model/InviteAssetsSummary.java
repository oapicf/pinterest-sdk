package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryAdAccountsInner;
import org.openapitools.model.InviteAssetsSummaryProfilesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
@ApiModel(description="Ad accounts and profiles the member/partner will be granted access to with this invite/request.")

public class InviteAssetsSummary  {
  
 /**
  * List of ad account IDs and respective permission levels that will be assigned.
  */
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels that will be assigned.")
  @Valid
  private List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();

 /**
  * List of profile IDs and respective permission levels that will be assigned.
  */
  @ApiModelProperty(value = "List of profile IDs and respective permission levels that will be assigned.")
  @Valid
  private List<@Valid InviteAssetsSummaryProfilesInner> profiles = new ArrayList<>();
 /**
  * List of ad account IDs and respective permission levels that will be assigned.
  * @return adAccounts
  */
  @JsonProperty("ad_accounts")
  public List<@Valid InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  /**
   * Sets the <code>adAccounts</code> property.
   */
 public void setAdAccounts(List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * Sets the <code>adAccounts</code> property.
   */
  public InviteAssetsSummary adAccounts(List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  /**
   * Adds a new item to the <code>adAccounts</code> list.
   */
  public InviteAssetsSummary addAdAccountsItem(InviteAssetsSummaryAdAccountsInner adAccountsItem) {
    this.adAccounts.add(adAccountsItem);
    return this;
  }

 /**
  * List of profile IDs and respective permission levels that will be assigned.
  * @return profiles
  */
  @JsonProperty("profiles")
  public List<@Valid InviteAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  /**
   * Sets the <code>profiles</code> property.
   */
 public void setProfiles(List<@Valid InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
  }

  /**
   * Sets the <code>profiles</code> property.
   */
  public InviteAssetsSummary profiles(List<@Valid InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  /**
   * Adds a new item to the <code>profiles</code> list.
   */
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

