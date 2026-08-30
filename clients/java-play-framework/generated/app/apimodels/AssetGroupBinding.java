package apimodels;

import apimodels.BusinessAccessUserSummary;
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
 * AssetGroupBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetGroupBinding   {
  @JsonProperty("ad_accounts_ids")
  @NotNull

  private List<@Pattern(regexp = "^\\d+$")String> adAccountsIds = new ArrayList<>();

  @JsonProperty("asset_group_description")
  @NotNull

  private String assetGroupDescription;

  @JsonProperty("asset_group_name")
  @NotNull

  private String assetGroupName;

  @JsonProperty("asset_group_types")
  @NotNull

  private List<String> assetGroupTypes = new ArrayList<>();

  @JsonProperty("catalogs_ids")
  @NotNull

  private List<@Pattern(regexp = "^\\d+$")String> catalogsIds = new ArrayList<>();

  @JsonProperty("created_by")
  @NotNull
@Valid

  private BusinessAccessUserSummary createdBy;

  @JsonProperty("created_time")
  @NotNull

  private Integer createdTime;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("owner")
  @NotNull
@Valid

  private BusinessAccessUserSummary owner;

  @JsonProperty("profiles_ids")
  @NotNull

  private List<@Pattern(regexp = "^\\d+$")String> profilesIds = new ArrayList<>();

  @JsonProperty("updated_time")
  @NotNull

  private Integer updatedTime;

  public AssetGroupBinding adAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
    return this;
  }

  public AssetGroupBinding addAdAccountsIdsItem(String adAccountsIdsItem) {
    if (this.adAccountsIds == null) {
      this.adAccountsIds = new ArrayList<>();
    }
    this.adAccountsIds.add(adAccountsIdsItem);
    return this;
  }

   /**
   * A list of ad account IDs under the asset group
   * @return adAccountsIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }

  public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

   /**
   * Asset group description
   * @return assetGroupDescription
  **/
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

   /**
   * Asset Group name
   * @return assetGroupName
  **/
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
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
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupBinding catalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
    this.catalogsIds = catalogsIds;
    return this;
  }

  public AssetGroupBinding addCatalogsIdsItem(String catalogsIdsItem) {
    if (this.catalogsIds == null) {
      this.catalogsIds = new ArrayList<>();
    }
    this.catalogsIds.add(catalogsIdsItem);
    return this;
  }

   /**
   * A list of catalog IDs under asset group
   * @return catalogsIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getCatalogsIds() {
    return catalogsIds;
  }

  public void setCatalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
    this.catalogsIds = catalogsIds;
  }

  public AssetGroupBinding createdBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The data of the user that created the asset group.
   * @return createdBy
  **/
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The creation time of the asset group
   * @return createdTime
  **/
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Asset Group ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetGroupBinding owner(BusinessAccessUserSummary owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The data of the business that owns the asset group.
   * @return owner
  **/
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  public AssetGroupBinding profilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
    return this;
  }

  public AssetGroupBinding addProfilesIdsItem(String profilesIdsItem) {
    if (this.profilesIds == null) {
      this.profilesIds = new ArrayList<>();
    }
    this.profilesIds.add(profilesIdsItem);
    return this;
  }

   /**
   * A list of profile IDs under asset group
   * @return profilesIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }

  public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * The last update time of the asset group
   * @return updatedTime
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

