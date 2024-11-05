package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMemberAssetsSummaryAdAccountsInner;
import org.openapitools.model.BusinessMemberAssetsSummaryProfilesInner;



/**
 * Ad accounts and profiles the business member/partner has access to.
 **/

@ApiModel(description = "Ad accounts and profiles the business member/partner has access to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMemberAssetsSummary   {
  @JsonProperty("ad_accounts")
  private List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = null;

  @JsonProperty("profiles")
  private List<BusinessMemberAssetsSummaryProfilesInner> profiles = null;

  /**
   * List of ad account IDs and respective permission levels.
   **/
  public BusinessMemberAssetsSummary adAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
    return this;
  }

  
  @ApiModelProperty(value = "List of ad account IDs and respective permission levels.")
  @JsonProperty("ad_accounts")
  public List<BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }
  public void setAdAccounts(List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * List of profile IDs and respective permission levels.
   **/
  public BusinessMemberAssetsSummary profiles(List<BusinessMemberAssetsSummaryProfilesInner> profiles) {
    this.profiles = profiles;
    return this;
  }

  
  @ApiModelProperty(value = "List of profile IDs and respective permission levels.")
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

