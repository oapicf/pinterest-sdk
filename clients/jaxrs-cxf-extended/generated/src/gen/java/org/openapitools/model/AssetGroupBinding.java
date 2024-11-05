package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupBinding  {
  
 /**
  * Asset Group ID.
  */
  @ApiModelProperty(example = "666791336903426391", value = "Asset Group ID.")
  private String id;

 /**
  * Asset Group name
  */
  @ApiModelProperty(example = "Canada Ad Accounts", value = "Asset Group name")
  private String assetGroupName;

 /**
  * Asset group description
  */
  @ApiModelProperty(example = "Asset group that has ad accounts used in Canada", value = "Asset group description")
  private String assetGroupDescription;

 /**
  * Asset group types
  */
  @ApiModelProperty(example = "[\"LOCATION_OR_LANGUAGE\"]", value = "Asset group types")
  private List<String> assetGroupTypes = new ArrayList<>();

 /**
  * A list of ad account IDs under the asset group
  */
  @ApiModelProperty(example = "[\"549755885175\"]", value = "A list of ad account IDs under the asset group")
  private List<@Pattern(regexp = "^\\d+$")String> adAccountsIds;

 /**
  * A list of profile IDs under asset group
  */
  @ApiModelProperty(example = "[\"630433785246278264\"]", value = "A list of profile IDs under asset group")
  private List<@Pattern(regexp = "^\\d+$")String> profilesIds;

 /**
  * The creation time of the asset group
  */
  @ApiModelProperty(example = "1646767577816", value = "The creation time of the asset group")
  private Integer createdTime;

 /**
  * The last update time of the asset group
  */
  @ApiModelProperty(example = "1646767577816", value = "The last update time of the asset group")
  private Integer updatedTime;

 /**
  * The data of the business that owns the asset group.
  */
  @ApiModelProperty(value = "The data of the business that owns the asset group.")
  @Valid
  private BusinessAccessUserSummary owner;

 /**
  * The data of the user that created the asset group.
  */
  @ApiModelProperty(value = "The data of the user that created the asset group.")
  @Valid
  private BusinessAccessUserSummary createdBy;
 /**
  * Asset Group ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Asset Group name
  * @return assetGroupName
  */
  @JsonProperty("asset_group_name")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  /**
   * Sets the <code>assetGroupName</code> property.
   */
 public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Sets the <code>assetGroupName</code> property.
   */
  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

 /**
  * Asset group description
  * @return assetGroupDescription
  */
  @JsonProperty("asset_group_description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  /**
   * Sets the <code>assetGroupDescription</code> property.
   */
 public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Sets the <code>assetGroupDescription</code> property.
   */
  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

 /**
  * Asset group types
  * @return assetGroupTypes
  */
  @JsonProperty("asset_group_types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  /**
   * Sets the <code>assetGroupTypes</code> property.
   */
 public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   * Sets the <code>assetGroupTypes</code> property.
   */
  public AssetGroupBinding assetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>assetGroupTypes</code> list.
   */
  public AssetGroupBinding addAssetGroupTypesItem(String assetGroupTypesItem) {
    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

 /**
  * A list of ad account IDs under the asset group
  * @return adAccountsIds
  */
  @JsonProperty("ad_accounts_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }

  /**
   * Sets the <code>adAccountsIds</code> property.
   */
 public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  /**
   * Sets the <code>adAccountsIds</code> property.
   */
  public AssetGroupBinding adAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adAccountsIds</code> list.
   */
  public AssetGroupBinding addAdAccountsIdsItem(String adAccountsIdsItem) {
    this.adAccountsIds.add(adAccountsIdsItem);
    return this;
  }

 /**
  * A list of profile IDs under asset group
  * @return profilesIds
  */
  @JsonProperty("profiles_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }

  /**
   * Sets the <code>profilesIds</code> property.
   */
 public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  /**
   * Sets the <code>profilesIds</code> property.
   */
  public AssetGroupBinding profilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
    return this;
  }

  /**
   * Adds a new item to the <code>profilesIds</code> list.
   */
  public AssetGroupBinding addProfilesIdsItem(String profilesIdsItem) {
    this.profilesIds.add(profilesIdsItem);
    return this;
  }

 /**
  * The creation time of the asset group
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * The last update time of the asset group
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * The data of the business that owns the asset group.
  * @return owner
  */
  @JsonProperty("owner")
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
 public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
  public AssetGroupBinding owner(BusinessAccessUserSummary owner) {
    this.owner = owner;
    return this;
  }

 /**
  * The data of the user that created the asset group.
  * @return createdBy
  */
  @JsonProperty("created_by")
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }

  /**
   * Sets the <code>createdBy</code> property.
   */
 public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Sets the <code>createdBy</code> property.
   */
  public AssetGroupBinding createdBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

