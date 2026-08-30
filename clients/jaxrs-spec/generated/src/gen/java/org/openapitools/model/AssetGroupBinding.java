package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AssetGroupBinding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupBinding   {
  private @Valid List<@Pattern(regexp = "^\\d+$")String> adAccountsIds = new ArrayList<>();
  private String assetGroupDescription;
  private String assetGroupName;
  private @Valid List<String> assetGroupTypes = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")String> catalogsIds = new ArrayList<>();
  private BusinessAccessUserSummary createdBy;
  private Integer createdTime;
  private String id;
  private BusinessAccessUserSummary owner;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> profilesIds = new ArrayList<>();
  private Integer updatedTime;

  public AssetGroupBinding() {
  }

  @JsonCreator
  public AssetGroupBinding(
    @JsonProperty(required = true, value = "ad_accounts_ids") List< @Pattern(regexp="^\\d+$")String> adAccountsIds,
    @JsonProperty(required = true, value = "asset_group_description") String assetGroupDescription,
    @JsonProperty(required = true, value = "asset_group_name") String assetGroupName,
    @JsonProperty(required = true, value = "asset_group_types") List<String> assetGroupTypes,
    @JsonProperty(required = true, value = "catalogs_ids") List< @Pattern(regexp="^\\d+$")String> catalogsIds,
    @JsonProperty(required = true, value = "created_by") BusinessAccessUserSummary createdBy,
    @JsonProperty(required = true, value = "created_time") Integer createdTime,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "owner") BusinessAccessUserSummary owner,
    @JsonProperty(required = true, value = "profiles_ids") List< @Pattern(regexp="^\\d+$")String> profilesIds,
    @JsonProperty(required = true, value = "updated_time") Integer updatedTime
  ) {
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

  /**
   * A list of ad account IDs under the asset group
   **/
  public AssetGroupBinding adAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"549755885175\"]", required = true, value = "A list of ad account IDs under the asset group")
  @JsonProperty(required = true, value = "ad_accounts_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }

  @JsonProperty(required = true, value = "ad_accounts_ids")
  public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  public AssetGroupBinding addAdAccountsIdsItem(String adAccountsIdsItem) {
    if (this.adAccountsIds == null) {
      this.adAccountsIds = new ArrayList<>();
    }

    this.adAccountsIds.add(adAccountsIdsItem);
    return this;
  }

  public AssetGroupBinding removeAdAccountsIdsItem(String adAccountsIdsItem) {
    if (adAccountsIdsItem != null && this.adAccountsIds != null) {
      this.adAccountsIds.remove(adAccountsIdsItem);
    }

    return this;
  }
  /**
   * Asset group description
   **/
  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

  
  @ApiModelProperty(example = "Asset group that has ad accounts used in Canada", required = true, value = "Asset group description")
  @JsonProperty(required = true, value = "asset_group_description")
  @NotNull public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  @JsonProperty(required = true, value = "asset_group_description")
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name
   **/
  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name")
  @JsonProperty(required = true, value = "asset_group_name")
  @NotNull public String getAssetGroupName() {
    return assetGroupName;
  }

  @JsonProperty(required = true, value = "asset_group_name")
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset group types
   **/
  public AssetGroupBinding assetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"LOCATION_OR_LANGUAGE\"]", required = true, value = "Asset group types")
  @JsonProperty(required = true, value = "asset_group_types")
  @NotNull public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty(required = true, value = "asset_group_types")
  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupBinding addAssetGroupTypesItem(String assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }

    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

  public AssetGroupBinding removeAssetGroupTypesItem(String assetGroupTypesItem) {
    if (assetGroupTypesItem != null && this.assetGroupTypes != null) {
      this.assetGroupTypes.remove(assetGroupTypesItem);
    }

    return this;
  }
  /**
   * A list of catalog IDs under asset group
   **/
  public AssetGroupBinding catalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
    this.catalogsIds = catalogsIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"4836859046874\"]", required = true, value = "A list of catalog IDs under asset group")
  @JsonProperty(required = true, value = "catalogs_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getCatalogsIds() {
    return catalogsIds;
  }

  @JsonProperty(required = true, value = "catalogs_ids")
  public void setCatalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
    this.catalogsIds = catalogsIds;
  }

  public AssetGroupBinding addCatalogsIdsItem(String catalogsIdsItem) {
    if (this.catalogsIds == null) {
      this.catalogsIds = new ArrayList<>();
    }

    this.catalogsIds.add(catalogsIdsItem);
    return this;
  }

  public AssetGroupBinding removeCatalogsIdsItem(String catalogsIdsItem) {
    if (catalogsIdsItem != null && this.catalogsIds != null) {
      this.catalogsIds.remove(catalogsIdsItem);
    }

    return this;
  }
  /**
   * The data of the user that created the asset group.
   **/
  public AssetGroupBinding createdBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The data of the user that created the asset group.")
  @JsonProperty(required = true, value = "created_by")
  @NotNull @Valid public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }

  @JsonProperty(required = true, value = "created_by")
  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * The creation time of the asset group
   **/
  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "1646767577816", required = true, value = "The creation time of the asset group")
  @JsonProperty(required = true, value = "created_time")
  @NotNull public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty(required = true, value = "created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Asset Group ID.
   **/
  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "666791336903426391", required = true, value = "Asset Group ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The data of the business that owns the asset group.
   **/
  public AssetGroupBinding owner(BusinessAccessUserSummary owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The data of the business that owns the asset group.")
  @JsonProperty(required = true, value = "owner")
  @NotNull @Valid public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  @JsonProperty(required = true, value = "owner")
  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  /**
   * A list of profile IDs under asset group
   **/
  public AssetGroupBinding profilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"630433785246278264\"]", required = true, value = "A list of profile IDs under asset group")
  @JsonProperty(required = true, value = "profiles_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }

  @JsonProperty(required = true, value = "profiles_ids")
  public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  public AssetGroupBinding addProfilesIdsItem(String profilesIdsItem) {
    if (this.profilesIds == null) {
      this.profilesIds = new ArrayList<>();
    }

    this.profilesIds.add(profilesIdsItem);
    return this;
  }

  public AssetGroupBinding removeProfilesIdsItem(String profilesIdsItem) {
    if (profilesIdsItem != null && this.profilesIds != null) {
      this.profilesIds.remove(profilesIdsItem);
    }

    return this;
  }
  /**
   * The last update time of the asset group
   **/
  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1646767577816", required = true, value = "The last update time of the asset group")
  @JsonProperty(required = true, value = "updated_time")
  @NotNull public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty(required = true, value = "updated_time")
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
