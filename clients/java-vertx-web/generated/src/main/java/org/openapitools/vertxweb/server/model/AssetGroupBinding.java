package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetGroupBinding   {
  
  private List<String> adAccountsIds = new ArrayList<>();
  private String assetGroupDescription;
  private String assetGroupName;
  private List<String> assetGroupTypes = new ArrayList<>();
  private List<String> catalogsIds = new ArrayList<>();
  private BusinessAccessUserSummary createdBy;
  private Integer createdTime;
  private String id;
  private BusinessAccessUserSummary owner;
  private List<String> profilesIds = new ArrayList<>();
  private Integer updatedTime;

  public AssetGroupBinding () {

  }

  public AssetGroupBinding (List<String> adAccountsIds, String assetGroupDescription, String assetGroupName, List<String> assetGroupTypes, List<String> catalogsIds, BusinessAccessUserSummary createdBy, Integer createdTime, String id, BusinessAccessUserSummary owner, List<String> profilesIds, Integer updatedTime) {
    this.adAccountsIds = adAccountsIds;
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupName = assetGroupName;
    this.assetGroupTypes = assetGroupTypes;
    this.catalogsIds = catalogsIds;
    this.createdBy = createdBy;
    this.createdTime = createdTime;
    this.id = id;
    this.owner = owner;
    this.profilesIds = profilesIds;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_accounts_ids")
  public List<String> getAdAccountsIds() {
    return adAccountsIds;
  }
  public void setAdAccountsIds(List<String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

    
  @JsonProperty("asset_group_description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

    
  @JsonProperty("asset_group_name")
  public String getAssetGroupName() {
    return assetGroupName;
  }
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

    
  @JsonProperty("asset_group_types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

    
  @JsonProperty("catalogs_ids")
  public List<String> getCatalogsIds() {
    return catalogsIds;
  }
  public void setCatalogsIds(List<String> catalogsIds) {
    this.catalogsIds = catalogsIds;
  }

    
  @JsonProperty("created_by")
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("owner")
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }
  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

    
  @JsonProperty("profiles_ids")
  public List<String> getProfilesIds() {
    return profilesIds;
  }
  public void setProfilesIds(List<String> profilesIds) {
    this.profilesIds = profilesIds;
  }

    
  @JsonProperty("updated_time")
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
    return Objects.equals(adAccountsIds, assetGroupBinding.adAccountsIds) &&
        Objects.equals(assetGroupDescription, assetGroupBinding.assetGroupDescription) &&
        Objects.equals(assetGroupName, assetGroupBinding.assetGroupName) &&
        Objects.equals(assetGroupTypes, assetGroupBinding.assetGroupTypes) &&
        Objects.equals(catalogsIds, assetGroupBinding.catalogsIds) &&
        Objects.equals(createdBy, assetGroupBinding.createdBy) &&
        Objects.equals(createdTime, assetGroupBinding.createdTime) &&
        Objects.equals(id, assetGroupBinding.id) &&
        Objects.equals(owner, assetGroupBinding.owner) &&
        Objects.equals(profilesIds, assetGroupBinding.profilesIds) &&
        Objects.equals(updatedTime, assetGroupBinding.updatedTime);
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
