package apimodels;

import apimodels.BusinessMemberAssetsSummaryAdAccountsInner;
import apimodels.BusinessMemberAssetsSummaryProfilesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad accounts and profiles the business member/partner has access to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessMemberAssetsSummary   {
  @JsonProperty("ad_accounts")
  @Valid

  private List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = null;

  @JsonProperty("profiles")
  @Valid

  private List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles = null;

  public BusinessMemberAssetsSummary adAccounts(List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
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
  **/
  public List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<@Valid BusinessMemberAssetsSummaryAdAccountsInner> adAccounts) {
    this.adAccounts = adAccounts;
  }

  public BusinessMemberAssetsSummary profiles(List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles) {
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
  **/
  public List<@Valid BusinessMemberAssetsSummaryProfilesInner> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<@Valid BusinessMemberAssetsSummaryProfilesInner> profiles) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

