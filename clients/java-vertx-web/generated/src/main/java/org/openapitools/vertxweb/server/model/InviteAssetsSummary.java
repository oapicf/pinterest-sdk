package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.InviteAssetsSummaryItem;

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteAssetsSummary   {
  
  private List<InviteAssetsSummaryItem> adAccounts = new ArrayList<>();
  private List<InviteAssetsSummaryItem> profiles = new ArrayList<>();

  public InviteAssetsSummary () {

  }

  public InviteAssetsSummary (List<InviteAssetsSummaryItem> adAccounts, List<InviteAssetsSummaryItem> profiles) {
    this.adAccounts = adAccounts;
    this.profiles = profiles;
  }

    
  @JsonProperty("ad_accounts")
  public List<InviteAssetsSummaryItem> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<InviteAssetsSummaryItem> adAccounts) {
    this.adAccounts = adAccounts;
  }

    
  @JsonProperty("profiles")
  public List<InviteAssetsSummaryItem> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<InviteAssetsSummaryItem> profiles) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
