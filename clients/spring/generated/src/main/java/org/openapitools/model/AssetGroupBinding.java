package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessAccessUserSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupBinding
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupBinding {

  private List<@Pattern(regexp = "^\\d+$")String> adAccountsIds = new ArrayList<>();

  private JsonNullable<String> assetGroupDescription = JsonNullable.<String>undefined();

  private JsonNullable<String> assetGroupName = JsonNullable.<String>undefined();

  private List<String> assetGroupTypes = new ArrayList<>();

  private List<@Pattern(regexp = "^\\d+$")String> catalogsIds = new ArrayList<>();

  private BusinessAccessUserSummary createdBy;

  private JsonNullable<Integer> createdTime = JsonNullable.<Integer>undefined();

  private String id;

  private BusinessAccessUserSummary owner;

  private List<@Pattern(regexp = "^\\d+$")String> profilesIds = new ArrayList<>();

  private JsonNullable<Integer> updatedTime = JsonNullable.<Integer>undefined();

  public AssetGroupBinding() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssetGroupBinding(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds, String assetGroupDescription, String assetGroupName, List<String> assetGroupTypes, List<@Pattern(regexp = "^\\d+$")String> catalogsIds, BusinessAccessUserSummary createdBy, Integer createdTime, String id, BusinessAccessUserSummary owner, List<@Pattern(regexp = "^\\d+$")String> profilesIds, Integer updatedTime) {
    this.adAccountsIds = adAccountsIds;
    this.assetGroupDescription = JsonNullable.of(assetGroupDescription);
    this.assetGroupName = JsonNullable.of(assetGroupName);
    this.assetGroupTypes = assetGroupTypes;
    this.catalogsIds = catalogsIds;
    this.createdBy = createdBy;
    this.createdTime = JsonNullable.of(createdTime);
    this.id = id;
    this.owner = owner;
    this.profilesIds = profilesIds;
    this.updatedTime = JsonNullable.of(updatedTime);
  }

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
   */
  @NotNull 
  @Schema(name = "ad_accounts_ids", example = "[\"549755885175\"]", description = "A list of ad account IDs under the asset group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_accounts_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }

  @JsonProperty("ad_accounts_ids")
  public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = JsonNullable.of(assetGroupDescription);
    return this;
  }

  /**
   * Asset group description
   * @return assetGroupDescription
   */
  @NotNull 
  @Schema(name = "asset_group_description", example = "Asset group that has ad accounts used in Canada", description = "Asset group description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_description")
  public JsonNullable<String> getAssetGroupDescription() {
    return assetGroupDescription;
  }

  @JsonProperty("asset_group_description")
  public void setAssetGroupDescription(JsonNullable<String> assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = JsonNullable.of(assetGroupName);
    return this;
  }

  /**
   * Asset Group name
   * @return assetGroupName
   */
  @NotNull 
  @Schema(name = "asset_group_name", example = "Canada Ad Accounts", description = "Asset Group name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_name")
  public JsonNullable<String> getAssetGroupName() {
    return assetGroupName;
  }

  @JsonProperty("asset_group_name")
  public void setAssetGroupName(JsonNullable<String> assetGroupName) {
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
   */
  @NotNull 
  @Schema(name = "asset_group_types", example = "[\"LOCATION_OR_LANGUAGE\"]", description = "Asset group types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty("asset_group_types")
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
   */
  @NotNull 
  @Schema(name = "catalogs_ids", example = "[\"4836859046874\"]", description = "A list of catalog IDs under asset group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalogs_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getCatalogsIds() {
    return catalogsIds;
  }

  @JsonProperty("catalogs_ids")
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
   */
  @NotNull @Valid 
  @Schema(name = "created_by", description = "The data of the user that created the asset group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_by")
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("created_by")
  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = JsonNullable.of(createdTime);
    return this;
  }

  /**
   * The creation time of the asset group
   * @return createdTime
   */
  @NotNull 
  @Schema(name = "created_time", example = "1646767577816", description = "The creation time of the asset group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_time")
  public JsonNullable<Integer> getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(JsonNullable<Integer> createdTime) {
    this.createdTime = createdTime;
  }

  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Asset Group ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "666791336903426391", description = "Asset Group ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
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
   */
  @NotNull @Valid 
  @Schema(name = "owner", description = "The data of the business that owns the asset group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }

  @JsonProperty("owner")
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
   */
  @NotNull 
  @Schema(name = "profiles_ids", example = "[\"630433785246278264\"]", description = "A list of profile IDs under asset group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profiles_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }

  @JsonProperty("profiles_ids")
  public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = JsonNullable.of(updatedTime);
    return this;
  }

  /**
   * The last update time of the asset group
   * @return updatedTime
   */
  @NotNull 
  @Schema(name = "updated_time", example = "1646767577816", description = "The last update time of the asset group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_time")
  public JsonNullable<Integer> getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(JsonNullable<Integer> updatedTime) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

