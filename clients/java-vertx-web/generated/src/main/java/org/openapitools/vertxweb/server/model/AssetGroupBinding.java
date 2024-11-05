package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetGroupBinding   {
  
  private String id;
  private String assetGroupName;
  private String assetGroupDescription;
  private List<String> assetGroupTypes = new ArrayList<>();
  private List<String> adAccountsIds;
  private List<String> profilesIds;
  private Integer createdTime;
  private Integer updatedTime;
  private BusinessAccessUserSummary owner;
  private BusinessAccessUserSummary createdBy;

  public AssetGroupBinding () {

  }

  public AssetGroupBinding (String id, String assetGroupName, String assetGroupDescription, List<String> assetGroupTypes, List<String> adAccountsIds, List<String> profilesIds, Integer createdTime, Integer updatedTime, BusinessAccessUserSummary owner, BusinessAccessUserSummary createdBy) {
    this.id = id;
    this.assetGroupName = assetGroupName;
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupTypes = assetGroupTypes;
    this.adAccountsIds = adAccountsIds;
    this.profilesIds = profilesIds;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.owner = owner;
    this.createdBy = createdBy;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("asset_group_name")
  public String getAssetGroupName() {
    return assetGroupName;
  }
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

    
  @JsonProperty("asset_group_description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

    
  @JsonProperty("asset_group_types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

    
  @JsonProperty("ad_accounts_ids")
  public List<String> getAdAccountsIds() {
    return adAccountsIds;
  }
  public void setAdAccountsIds(List<String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

    
  @JsonProperty("profiles_ids")
  public List<String> getProfilesIds() {
    return profilesIds;
  }
  public void setProfilesIds(List<String> profilesIds) {
    this.profilesIds = profilesIds;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("owner")
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }
  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

    
  @JsonProperty("created_by")
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
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
    return Objects.equals(id, assetGroupBinding.id) &&
        Objects.equals(assetGroupName, assetGroupBinding.assetGroupName) &&
        Objects.equals(assetGroupDescription, assetGroupBinding.assetGroupDescription) &&
        Objects.equals(assetGroupTypes, assetGroupBinding.assetGroupTypes) &&
        Objects.equals(adAccountsIds, assetGroupBinding.adAccountsIds) &&
        Objects.equals(profilesIds, assetGroupBinding.profilesIds) &&
        Objects.equals(createdTime, assetGroupBinding.createdTime) &&
        Objects.equals(updatedTime, assetGroupBinding.updatedTime) &&
        Objects.equals(owner, assetGroupBinding.owner) &&
        Objects.equals(createdBy, assetGroupBinding.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assetGroupName, assetGroupDescription, assetGroupTypes, adAccountsIds, profilesIds, createdTime, updatedTime, owner, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupBinding {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assetGroupDescription: ").append(toIndentedString(assetGroupDescription)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
    sb.append("    adAccountsIds: ").append(toIndentedString(adAccountsIds)).append("\n");
    sb.append("    profilesIds: ").append(toIndentedString(profilesIds)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
