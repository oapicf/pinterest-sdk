package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BusinessMemberAssetsSummaryAdAccountsInner;
import com.prokarma.pkmst.model.BusinessMemberAssetsSummaryProfilesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ad accounts and profiles the business member/partner has access to.
 */
@ApiModel(description = "Ad accounts and profiles the business member/partner has access to.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMemberAssetsSummary   {
  @JsonProperty("ad_accounts")
  
  private List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = null;

  @JsonProperty("profiles")
  
  private List<BusinessMemberAssetsSummaryProfilesInner> profiles = null;

  public BusinessMemberAssetsSummary adAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public BusinessMemberAssetsSummary addAdAccountsItem(BusinessMemberAssetsSummaryAdAccountsInner adAccountsItem) {
    if (this.adAccounts == null) {
      this.adAccounts = new ArrayList<>();
    }
    this.adAccounts.add(adAccountsItem);
    return this;
  }

  /**
   * List of ad account IDs and respective permission levels.
   * @return adAccounts
   */
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels.")
  public List<BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public BusinessMemberAssetsSummary profiles(List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  public BusinessMemberAssetsSummary addProfilesItem(BusinessMemberAssetsSummaryProfilesInner profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * List of profile IDs and respective permission levels.
   * @return profiles
   */
  @ApiModelProperty(value = "List of profile IDs and respective permission levels.")
  public List<BusinessMemberAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
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
    BusinessMemberAssetsSummary businessMemberAssetsSummary = (BusinessMemberAssetsSummary) o;
    return Objects.equals(this.adAccounts, businessMemberAssetsSummary.adAccounts) &&
        Objects.equals(this.profiles, businessMemberAssetsSummary.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccounts, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsSummary {\n");
    
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

