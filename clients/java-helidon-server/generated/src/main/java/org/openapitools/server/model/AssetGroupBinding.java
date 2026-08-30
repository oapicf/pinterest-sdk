package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BusinessAccessUserSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public AssetGroupBinding() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupBinding.
     *
     * @param adAccountsIds A list of ad account IDs under the asset group
     * @param assetGroupDescription Asset group description
     * @param assetGroupName Asset Group name
     * @param assetGroupTypes Asset group types
     * @param catalogsIds A list of catalog IDs under asset group
     * @param createdBy The data of the user that created the asset group.
     * @param createdTime The creation time of the asset group
     * @param id Asset Group ID.
     * @param owner The data of the business that owns the asset group.
     * @param profilesIds A list of profile IDs under asset group
     * @param updatedTime The last update time of the asset group
     */
    public AssetGroupBinding(
        List<@Pattern(regexp = "^\\d+$")String> adAccountsIds, 
        String assetGroupDescription, 
        String assetGroupName, 
        List<String> assetGroupTypes, 
        List<@Pattern(regexp = "^\\d+$")String> catalogsIds, 
        BusinessAccessUserSummary createdBy, 
        Integer createdTime, 
        String id, 
        BusinessAccessUserSummary owner, 
        List<@Pattern(regexp = "^\\d+$")String> profilesIds, 
        Integer updatedTime
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
     * @return adAccountsIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAdAccountsIds() {
        return adAccountsIds;
    }

    public void setAdAccountsIds(List<@Pattern(regexp = "^\\d+$")String> adAccountsIds) {
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
    public List<@Pattern(regexp = "^\\d+$")String> getCatalogsIds() {
        return catalogsIds;
    }

    public void setCatalogsIds(List<@Pattern(regexp = "^\\d+$")String> catalogsIds) {
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
    public List<@Pattern(regexp = "^\\d+$")String> getProfilesIds() {
        return profilesIds;
    }

    public void setProfilesIds(List<@Pattern(regexp = "^\\d+$")String> profilesIds) {
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

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

