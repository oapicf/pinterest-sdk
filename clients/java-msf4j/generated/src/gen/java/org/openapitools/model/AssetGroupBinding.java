package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;

/**
 * AssetGroupBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssetGroupBinding   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("asset_group_name")
  private String assetGroupName;

  @JsonProperty("asset_group_description")
  private String assetGroupDescription;

  @JsonProperty("asset_group_types")
  private List<String> assetGroupTypes = null;

  @JsonProperty("ad_accounts_ids")
  private List<@Pattern(regexp = "^\\d+$")String> adAccountsIds = null;

  @JsonProperty("profiles_ids")
  private List<@Pattern(regexp = "^\\d+$")String> profilesIds = null;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("owner")
  private BusinessAccessUserSummary owner;

  @JsonProperty("created_by")
  private BusinessAccessUserSummary createdBy;

  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Asset Group ID.
   * @return id
  **/
  @ApiModelProperty(example = "666791336903426391", value = "Asset Group ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

   /**
   * Asset Group name
   * @return assetGroupName
  **/
  @ApiModelProperty(example = "Canada Ad Accounts", value = "Asset Group name")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

   /**
   * Asset group description
   * @return assetGroupDescription
  **/
  @ApiModelProperty(example = "Asset group that has ad accounts used in Canada", value = "Asset group description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  public AssetGroupBinding assetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  public AssetGroupBinding addAssetGroupTypesItem(String assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }
    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

   /**
   * Asset group types
   * @return assetGroupTypes
  **/
  @ApiModelProperty(example = "[\"LOCATION_OR_LANGUAGE\"]", value = "Asset group types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupBinding adAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
    return this;
  }

  public AssetGroupBinding addAdAccountsIdsItem(String adAccountsIdsItem) {
    if (this.adAccountsIds == null) {
      this.adAccountsIds = ;
    }
    this.adAccountsIds.add(adAccountsIdsItem);
    return this;
  }

   /**
   * A list of ad account IDs under the asset group
   * @return adAccountsIds
  **/
  @ApiModelProperty(example = "[\"549755885175\"]", value = "A list of ad account IDs under the asset group")
  public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }

  public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  public AssetGroupBinding profilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
    return this;
  }

  public AssetGroupBinding addProfilesIdsItem(String profilesIdsItem) {
    if (this.profilesIds == null) {
      this.profilesIds = ;
    }
    this.profilesIds.add(profilesIdsItem);
    return this;
  }

   /**
   * A list of profile IDs under asset group
   * @return profilesIds
  **/
  @ApiModelProperty(example = "[\"630433785246278264\"]", value = "A list of profile IDs under asset group")
  public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }

  public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The creation time of the asset group
   * @return createdTime
  **/
  @ApiModelProperty(example = "1646767577816", value = "The creation time of the asset group")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * The last update time of the asset group
   * @return updatedTime
  **/
  @ApiModelProperty(example = "1646767577816", value = "The last update time of the asset group")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AssetGroupBinding owner(BusinessAccessUserSummary owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The data of the business that owns the asset group.
   * @return owner
  **/
  @ApiModelProperty(value = "The data of the business that owns the asset group.")
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  public AssetGroupBinding createdBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The data of the user that created the asset group.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The data of the user that created the asset group.")
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
    return Objects.equals(this.id, assetGroupBinding.id) &&
        Objects.equals(this.assetGroupName, assetGroupBinding.assetGroupName) &&
        Objects.equals(this.assetGroupDescription, assetGroupBinding.assetGroupDescription) &&
        Objects.equals(this.assetGroupTypes, assetGroupBinding.assetGroupTypes) &&
        Objects.equals(this.adAccountsIds, assetGroupBinding.adAccountsIds) &&
        Objects.equals(this.profilesIds, assetGroupBinding.profilesIds) &&
        Objects.equals(this.createdTime, assetGroupBinding.createdTime) &&
        Objects.equals(this.updatedTime, assetGroupBinding.updatedTime) &&
        Objects.equals(this.owner, assetGroupBinding.owner) &&
        Objects.equals(this.createdBy, assetGroupBinding.createdBy);
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

