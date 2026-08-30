package org.openapitools.model;

import org.openapitools.model.AssetIdWithPermissions;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Ad accounts and profiles the business member/partner has access to.
 */
public class BusinessMemberAssetsSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of ad account IDs and respective permission levels.
   */
  @JsonProperty("ad_accounts")
  private List<AssetIdWithPermissions> adAccounts = new ArrayList<>();

  /**
   * List of profile IDs and respective permission levels.
   */
  @JsonProperty("profiles")
  private List<AssetIdWithPermissions> profiles = new ArrayList<>();

  /**
   * List of ad account IDs and respective permission levels.
   * @return adAccounts
   */
  public List<AssetIdWithPermissions> getAdAccounts() {
    return adAccounts;
  }

  public void setAdAccounts(List<AssetIdWithPermissions> adAccounts) {
    this.adAccounts = adAccounts;
  }

  /**
   * List of profile IDs and respective permission levels.
   * @return profiles
   */
  public List<AssetIdWithPermissions> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<AssetIdWithPermissions> profiles) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
