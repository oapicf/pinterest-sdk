/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummary   {
  
  private List<InviteAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();
  private List<InviteAssetsSummaryProfilesInner> profiles = new ArrayList<>();

  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   */
  public InviteAssetsSummary adAccounts(List<InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels that will be assigned.")
  @JsonProperty("ad_accounts")
  public List<InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * List of profile IDs and respective permission levels that will be assigned.
   */
  public InviteAssetsSummary profiles(List<InviteAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  
  @ApiModelProperty(value = "List of profile IDs and respective permission levels that will be assigned.")
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

