package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AssetGroupBinding
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssetGroupBinding {

  private String id;

  private JsonNullable<String> assetGroupName = JsonNullable.<String>undefined();

  private JsonNullable<String> assetGroupDescription = JsonNullable.<String>undefined();

  @Valid
  private List<String> assetGroupTypes = new ArrayList<>();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> adAccountsIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> profilesIds = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  private JsonNullable<Integer> createdTime = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> updatedTime = JsonNullable.<Integer>undefined();

  private JsonNullable<BusinessAccessUserSummary> owner = JsonNullable.<BusinessAccessUserSummary>undefined();

  private JsonNullable<BusinessAccessUserSummary> createdBy = JsonNullable.<BusinessAccessUserSummary>undefined();

  public AssetGroupBinding id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Asset Group ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "666791336903426391", description = "Asset Group ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetGroupBinding assetGroupName(String assetGroupName) {
    this.assetGroupName = JsonNullable.of(assetGroupName);
    return this;
  }

  /**
   * Asset Group name
   * @return assetGroupName
   */
  
  @Schema(name = "asset_group_name", example = "Canada Ad Accounts", description = "Asset Group name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_name")
  public JsonNullable<String> getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(JsonNullable<String> assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public AssetGroupBinding assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = JsonNullable.of(assetGroupDescription);
    return this;
  }

  /**
   * Asset group description
   * @return assetGroupDescription
   */
  
  @Schema(name = "asset_group_description", example = "Asset group that has ad accounts used in Canada", description = "Asset group description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_description")
  public JsonNullable<String> getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(JsonNullable<String> assetGroupDescription) {
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
   */
  
  @Schema(name = "asset_group_types", example = "[\"LOCATION_OR_LANGUAGE\"]", description = "Asset group types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_types")
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupBinding adAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = JsonNullable.of(adAccountsIds);
    return this;
  }

  public AssetGroupBinding addAdAccountsIdsItem(String adAccountsIdsItem) {
    if (this.adAccountsIds == null || !this.adAccountsIds.isPresent()) {
      this.adAccountsIds = JsonNullable.of(new ArrayList<>());
    }
    this.adAccountsIds.get().add(adAccountsIdsItem);
    return this;
  }

  /**
   * A list of ad account IDs under the asset group
   * @return adAccountsIds
   */
  
  @Schema(name = "ad_accounts_ids", example = "[\"549755885175\"]", description = "A list of ad account IDs under the asset group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_accounts_ids")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getAdAccountsIds() {
    return adAccountsIds;
  }

  public void setAdAccountsIds(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  public AssetGroupBinding profilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = JsonNullable.of(profilesIds);
    return this;
  }

  public AssetGroupBinding addProfilesIdsItem(String profilesIdsItem) {
    if (this.profilesIds == null || !this.profilesIds.isPresent()) {
      this.profilesIds = JsonNullable.of(new ArrayList<>());
    }
    this.profilesIds.get().add(profilesIdsItem);
    return this;
  }

  /**
   * A list of profile IDs under asset group
   * @return profilesIds
   */
  
  @Schema(name = "profiles_ids", example = "[\"630433785246278264\"]", description = "A list of profile IDs under asset group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profiles_ids")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getProfilesIds() {
    return profilesIds;
  }

  public void setProfilesIds(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> profilesIds) {
    this.profilesIds = profilesIds;
  }

  public AssetGroupBinding createdTime(Integer createdTime) {
    this.createdTime = JsonNullable.of(createdTime);
    return this;
  }

  /**
   * The creation time of the asset group
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1646767577816", description = "The creation time of the asset group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public JsonNullable<Integer> getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(JsonNullable<Integer> createdTime) {
    this.createdTime = createdTime;
  }

  public AssetGroupBinding updatedTime(Integer updatedTime) {
    this.updatedTime = JsonNullable.of(updatedTime);
    return this;
  }

  /**
   * The last update time of the asset group
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", example = "1646767577816", description = "The last update time of the asset group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public JsonNullable<Integer> getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(JsonNullable<Integer> updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AssetGroupBinding owner(BusinessAccessUserSummary owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * The data of the business that owns the asset group.
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", description = "The data of the business that owns the asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<BusinessAccessUserSummary> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<BusinessAccessUserSummary> owner) {
    this.owner = owner;
  }

  public AssetGroupBinding createdBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = JsonNullable.of(createdBy);
    return this;
  }

  /**
   * The data of the user that created the asset group.
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", description = "The data of the user that created the asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public JsonNullable<BusinessAccessUserSummary> getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(JsonNullable<BusinessAccessUserSummary> createdBy) {
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
        equalsNullable(this.assetGroupName, assetGroupBinding.assetGroupName) &&
        equalsNullable(this.assetGroupDescription, assetGroupBinding.assetGroupDescription) &&
        Objects.equals(this.assetGroupTypes, assetGroupBinding.assetGroupTypes) &&
        equalsNullable(this.adAccountsIds, assetGroupBinding.adAccountsIds) &&
        equalsNullable(this.profilesIds, assetGroupBinding.profilesIds) &&
        equalsNullable(this.createdTime, assetGroupBinding.createdTime) &&
        equalsNullable(this.updatedTime, assetGroupBinding.updatedTime) &&
        equalsNullable(this.owner, assetGroupBinding.owner) &&
        equalsNullable(this.createdBy, assetGroupBinding.createdBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(assetGroupName), hashCodeNullable(assetGroupDescription), assetGroupTypes, hashCodeNullable(adAccountsIds), hashCodeNullable(profilesIds), hashCodeNullable(createdTime), hashCodeNullable(updatedTime), hashCodeNullable(owner), hashCodeNullable(createdBy));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

