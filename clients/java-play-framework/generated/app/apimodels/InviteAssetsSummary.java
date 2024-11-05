package apimodels;

import apimodels.InviteAssetsSummaryAdAccountsInner;
import apimodels.InviteAssetsSummaryProfilesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteAssetsSummary   {
  @JsonProperty("ad_accounts")
  @Valid

  private List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts = null;

  @JsonProperty("profiles")
  @Valid

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
    return Objects.equals(adAccounts, inviteAssetsSummary.adAccounts) &&
        Objects.equals(profiles, inviteAssetsSummary.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccounts, profiles);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

