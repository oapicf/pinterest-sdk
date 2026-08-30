package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupBinding   {
  
  private List<@Pattern(regexp = "^\\d+$")String> adAccountsIds = new ArrayList<>();
  private String assetGroupDescription;
  private String assetGroupName;
  private List<String> assetGroupTypes = new ArrayList<>();
  private List<@Pattern(regexp = "^\\d+$")String> catalogsIds = new ArrayList<>();
  private BusinessAccessUserSummary createdBy;
  private Integer createdTime;
  private String id;
  private BusinessAccessUserSummary owner;
  private List<@Pattern(regexp = "^\\d+$")String> profilesIds = new ArrayList<>();
  private Integer updatedTime;

  /**
   * A list of ad account IDs under the asset group
   **/
  
  @ApiModelProperty(example = "[\"549755885175\"]", required = true, value = "A list of ad account IDs under the asset group")
  @JsonProperty("ad_accounts_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
    return adAccountsIds;
  }
  public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
    this.adAccountsIds = adAccountsIds;
  }

  /**
   * Asset group description
   **/
  
  @ApiModelProperty(example = "Asset group that has ad accounts used in Canada", required = true, value = "Asset group description")
  @JsonProperty("asset_group_description")
  @NotNull
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name
   **/
  
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name")
  @JsonProperty("asset_group_name")
  @NotNull
  public String getAssetGroupName() {
    return assetGroupName;
  }
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset group types
   **/
  
  @ApiModelProperty(example = "[\"LOCATION_OR_LANGUAGE\"]", required = true, value = "Asset group types")
  @JsonProperty("asset_group_types")
  @NotNull
  public List<String> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<String> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   * A list of catalog IDs under asset group
   **/
  
  @ApiModelProperty(example = "[\"4836859046874\"]", required = true, value = "A list of catalog IDs under asset group")
  @JsonProperty("catalogs_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getCatalogsIds() {
    return catalogsIds;
  }
  public void setCatalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
    this.catalogsIds = catalogsIds;
  }

  /**
   * The data of the user that created the asset group.
   **/
  
  @ApiModelProperty(required = true, value = "The data of the user that created the asset group.")
  @JsonProperty("created_by")
  @NotNull
  public BusinessAccessUserSummary getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(BusinessAccessUserSummary createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * The creation time of the asset group
   **/
  
  @ApiModelProperty(example = "1646767577816", required = true, value = "The creation time of the asset group")
  @JsonProperty("created_time")
  @NotNull
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Asset Group ID.
   **/
  
  @ApiModelProperty(example = "666791336903426391", required = true, value = "Asset Group ID.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The data of the business that owns the asset group.
   **/
  
  @ApiModelProperty(required = true, value = "The data of the business that owns the asset group.")
  @JsonProperty("owner")
  @NotNull
  public BusinessAccessUserSummary getOwner() {
    return owner;
  }
  public void setOwner(BusinessAccessUserSummary owner) {
    this.owner = owner;
  }

  /**
   * A list of profile IDs under asset group
   **/
  
  @ApiModelProperty(example = "[\"630433785246278264\"]", required = true, value = "A list of profile IDs under asset group")
  @JsonProperty("profiles_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
    return profilesIds;
  }
  public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
    this.profilesIds = profilesIds;
  }

  /**
   * The last update time of the asset group
   **/
  
  @ApiModelProperty(example = "1646767577816", required = true, value = "The last update time of the asset group")
  @JsonProperty("updated_time")
  @NotNull
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

