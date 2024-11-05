package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMemberAssetsSummaryAdAccountsInner;
import org.openapitools.model.BusinessMemberAssetsSummaryProfilesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ad accounts and profiles the business member/partner has access to.
 **/
@ApiModel(description="Ad accounts and profiles the business member/partner has access to.")

public class BusinessMemberAssetsSummary  {
  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels.")
 /**
   * List of ad account IDs and respective permission levels.
  **/
  private List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();

  @ApiModelProperty(value = "List of profile IDs and respective permission levels.")
 /**
   * List of profile IDs and respective permission levels.
  **/
  private List<BusinessMemberAssetsSummaryProfilesInner> profiles = new ArrayList<>();
 /**
   * List of ad account IDs and respective permission levels.
   * @return adAccounts
  **/
  @JsonProperty("ad_accounts")
  public List<BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public BusinessMemberAssetsSummary adAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  public BusinessMemberAssetsSummary addAdAccountsItem(BusinessMemberAssetsSummaryAdAccountsInner adAccountsItem) {
    this.adAccounts.add(adAccountsItem);
    return this;
  }

 /**
   * List of profile IDs and respective permission levels.
   * @return profiles
  **/
  @JsonProperty("profiles")
  public List<BusinessMemberAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
  }

  public BusinessMemberAssetsSummary profiles(List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  public BusinessMemberAssetsSummary addProfilesItem(BusinessMemberAssetsSummaryProfilesInner profilesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

