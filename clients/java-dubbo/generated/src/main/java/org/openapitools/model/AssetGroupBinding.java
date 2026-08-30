package org.openapitools.model;

import org.openapitools.model.BusinessAccessUserSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssetGroupBinding implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of ad account IDs under the asset group
   */
  @JsonProperty("ad_accounts_ids")
  private List<String> adAccountsIds = new ArrayList<>();

  /**
   * Asset group description
   */
  @JsonProperty("asset_group_description")
  private String assetGroupDescription;

  /**
   * Asset Group name
   */
  @JsonProperty("asset_group_name")
  private String assetGroupName;

  /**
   * Asset group types
   */
  @JsonProperty("asset_group_types")
  private List<String> assetGroupTypes = new ArrayList<>();

  /**
   * A list of catalog IDs under asset group
   */
  @JsonProperty("catalogs_ids")
  private List<String> catalogsIds = new ArrayList<>();

  /**
   * The data of the user that created the asset group.
   */
  @JsonProperty("created_by")
  private BusinessAccessUserSummary createdBy;

  /**
   * The creation time of the asset group
   */
  @JsonProperty("created_time")
  private Integer createdTime;

  /**
   * Asset Group ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The data of the business that owns the asset group.
   */
  @JsonProperty("owner")
  private BusinessAccessUserSummary owner;

  /**
   * A list of profile IDs under asset group
   */
  @JsonProperty("profiles_ids")
  private List<String> profilesIds = new ArrayList<>();

  /**
   * The last update time of the asset group
   */
  @JsonProperty("updated_time")
  private Integer updatedTime;

  /**
   * A list of ad account IDs under the asset group
   * @return adAccountsIds
   */
  public List<String> getAdAccountsIds() {
    return adAccountsIds;
  }

  public void setAdAccountsIds(List<String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  /**
   * Asset group description
   * @return assetGroupDescription
   */
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name
   * @return assetGroupName
   */
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset group types
   * @return assetGroupTypes
   */
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   * A list of catalog IDs under asset group
   * @return catalogsIds
   */
  public List<String> getCatalogsIds() {
    return catalogsIds;
  }

  public void setCatalogsIds(List<String> catalogsIds) {
    this.catalogsIds = catalogsIds;
  }

  /**
   * The data of the user that created the asset group.
   * @return createdBy
   */
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * The creation time of the asset group
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Asset Group ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The data of the business that owns the asset group.
   * @return owner
   */
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  /**
   * A list of profile IDs under asset group
   * @return profilesIds
   */
  public List<String> getProfilesIds() {
    return profilesIds;
  }

  public void setProfilesIds(List<String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  /**
   * The last update time of the asset group
   * @return updatedTime
   */
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupBinding assetGroupBinding = (AssetGroupBinding) o;
    return Objects.equals(this.adAccountsIds, assetGroupBinding.adAccountsIds) &&
        Objects.equals(this.assetGroupDescription, assetGroupBinding.assetGroupDescription) &&
        Objects.equals(this.assetGroupName, assetGroupBinding.assetGroupName) &&
        Objects.equals(this.assetGroupTypes, assetGroupBinding.assetGroupTypes) &&
        Objects.equals(this.catalogsIds, assetGroupBinding.catalogsIds) &&
        Objects.equals(this.createdBy, assetGroupBinding.createdBy) &&
        Objects.equals(this.createdTime, assetGroupBinding.createdTime) &&
        Objects.equals(this.id, assetGroupBinding.id) &&
        Objects.equals(this.owner, assetGroupBinding.owner) &&
        Objects.equals(this.profilesIds, assetGroupBinding.profilesIds) &&
        Objects.equals(this.updatedTime, assetGroupBinding.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountsIds, assetGroupDescription, assetGroupName, assetGroupTypes, catalogsIds, createdBy, createdTime, id, owner, profilesIds, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupBinding {\n");
    
    sb.append("    adAccountsIds: ").append(toIndentedString(adAccountsIds)).append("\n");
    sb.append("    assetGroupDescription: ").append(toIndentedString(assetGroupDescription)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
    sb.append("    catalogsIds: ").append(toIndentedString(catalogsIds)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    profilesIds: ").append(toIndentedString(profilesIds)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
