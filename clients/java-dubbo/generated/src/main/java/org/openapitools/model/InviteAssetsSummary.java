package org.openapitools.model;

import org.openapitools.model.InviteAssetsSummaryItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
public class InviteAssetsSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   */
  @JsonProperty("ad_accounts")
  private List<InviteAssetsSummaryItem> adAccounts = new ArrayList<>();

  /**
   * List of profile IDs and respective permission levels that will be assigned.
   */
  @JsonProperty("profiles")
  private List<InviteAssetsSummaryItem> profiles = new ArrayList<>();

  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   * @return adAccounts
   */
  public List<InviteAssetsSummaryItem> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<InviteAssetsSummaryItem> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * List of profile IDs and respective permission levels that will be assigned.
   * @return profiles
   */
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
