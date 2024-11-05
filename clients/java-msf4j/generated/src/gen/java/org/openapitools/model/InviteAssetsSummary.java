package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryAdAccountsInner;
import org.openapitools.model.InviteAssetsSummaryProfilesInner;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
@ApiModel(description = "Ad accounts and profiles the member/partner will be granted access to with this invite/request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummary   {
  @JsonProperty("ad_accounts")
  private List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts = null;

  @JsonProperty("profiles")
  private List<@Valid InviteAssetsSummaryProfilesInner> profiles = null;

  public InviteAssetsSummary adAccounts(List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public InviteAssetsSummary addAdAccountsItem(InviteAssetsSummaryAdAccountsInner adAccountsItem) {
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
  public List<@Valid InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public InviteAssetsSummary profiles(List<@Valid InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  public InviteAssetsSummary addProfilesItem(InviteAssetsSummaryProfilesInner profilesItem) {
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
  public List<@Valid InviteAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<@Valid InviteAssetsSummaryProfilesInner> profiles) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

