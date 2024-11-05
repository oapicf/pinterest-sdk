package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMemberAssetsSummaryAdAccountsInner;
import org.openapitools.model.BusinessMemberAssetsSummaryProfilesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ad accounts and profiles the business member/partner has access to.
 **/
@ApiModel(description = "Ad accounts and profiles the business member/partner has access to.")
@JsonTypeName("BusinessMemberAssetsSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMemberAssetsSummary   {
  private @Valid List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();
  private @Valid List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles = new ArrayList<>();

  /**
   * List of ad account IDs and respective permission levels.
   **/
  public BusinessMemberAssetsSummary adAccounts(List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels.")
  @JsonProperty("ad_accounts")
  @Valid public List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  @JsonProperty("ad_accounts")
  public void setAdAccounts(List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public BusinessMemberAssetsSummary addAdAccountsItem(BusinessMemberAssetsSummaryAdAccountsInner adAccountsItem) {
    if (this.adAccounts == null) {
      this.adAccounts = new ArrayList<>();
    }

    this.adAccounts.add(adAccountsItem);
    return this;
  }

  public BusinessMemberAssetsSummary removeAdAccountsItem(BusinessMemberAssetsSummaryAdAccountsInner adAccountsItem) {
    if (adAccountsItem != null && this.adAccounts != null) {
      this.adAccounts.remove(adAccountsItem);
    }

    return this;
  }
  /**
   * List of profile IDs and respective permission levels.
   **/
  public BusinessMemberAssetsSummary profiles(List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  
  @ApiModelProperty(value = "List of profile IDs and respective permission levels.")
  @JsonProperty("profiles")
  @Valid public List<@Valid BusinessMemberAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  @JsonProperty("profiles")
  public void setProfiles(List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
  }

  public BusinessMemberAssetsSummary addProfilesItem(BusinessMemberAssetsSummaryProfilesInner profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }

    this.profiles.add(profilesItem);
    return this;
  }

  public BusinessMemberAssetsSummary removeProfilesItem(BusinessMemberAssetsSummaryProfilesInner profilesItem) {
    if (profilesItem != null && this.profiles != null) {
      this.profiles.remove(profilesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

