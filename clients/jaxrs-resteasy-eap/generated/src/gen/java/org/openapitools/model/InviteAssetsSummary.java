package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteAssetsSummaryAdAccountsInner;
import org.openapitools.model.InviteAssetsSummaryProfilesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Ad accounts and profiles the member/partner will be granted access to with this invite/request.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummary   {
  
  private List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();
  private List<@Valid InviteAssetsSummaryProfilesInner> profiles = new ArrayList<>();

  /**
   * List of ad account IDs and respective permission levels that will be assigned.
   **/
  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels that will be assigned.")
  @JsonProperty("ad_accounts")
  public List<@Valid InviteAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<@Valid InviteAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * List of profile IDs and respective permission levels that will be assigned.
   **/
  
  @ApiModelProperty(value = "List of profile IDs and respective permission levels that will be assigned.")
  @JsonProperty("profiles")
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

