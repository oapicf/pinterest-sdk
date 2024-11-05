package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.BusinessMemberAssetsSummaryAdAccountsInner;
import org.openapitools.server.api.model.BusinessMemberAssetsSummaryProfilesInner;

/**
 * Ad accounts and profiles the business member/partner has access to.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessMemberAssetsSummary   {
  
  private List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>();
  private List<BusinessMemberAssetsSummaryProfilesInner> profiles = new ArrayList<>();

  public BusinessMemberAssetsSummary () {

  }

  public BusinessMemberAssetsSummary (List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts, List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.adAccounts = adAccounts;
    this.profiles = profiles;
  }

    
  @JsonProperty("ad_accounts")
  public List<BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

    
  @JsonProperty("profiles")
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
    return Objects.equals(adAccounts, businessMemberAssetsSummary.adAccounts) &&
        Objects.equals(profiles, businessMemberAssetsSummary.profiles);
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
