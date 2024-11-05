package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.InviteAssetsSummaryAdAccountsInner;
import org.openapitools.server.api.model.InviteAssetsSummaryProfilesInner;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteAssetsSummary   {
  
  private List<InviteAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();
  private List<InviteAssetsSummaryProfilesInner> profiles = new ArrayList<>();

  public InviteAssetsSummary () {

  }

  public InviteAssetsSummary (List<InviteAssetsSummaryAdAccountsInner> adAccounts, List<InviteAssetsSummaryProfilesInner> profiles) {
    this.adAccounts = adAccounts;
    this.profiles = profiles;
  }

    
  @JsonProperty("ad_accounts")
  public List<InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

    
  @JsonProperty("profiles")
  public List<InviteAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<InviteAssetsSummaryProfilesInner> profiles) {
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
