package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetGroupType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupUpdateItemReadOrUpdateItem   {

    private String assetGroupId;
    private List<AssetGroupType> assetGroupTypes = new ArrayList<>();
    private List<String> assetsToAdd = new ArrayList<>();
    private List<String> assetsToRemove = new ArrayList<>();
    private String description;
    private String name;

    /**
     * Default constructor.
     */
    public AssetGroupUpdateItemReadOrUpdateItem() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupUpdateItemReadOrUpdateItem.
     *
     * @param assetGroupId Unique identifier of the asset group to update.
     * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     * @param assetsToAdd A list of asset ids to add to the asset group.
     * @param assetsToRemove A list of asset ids to remove from the asset group.
     * @param description Asset group description.
     * @param name Asset Group name.
     */
    public AssetGroupUpdateItemReadOrUpdateItem(
        String assetGroupId, 
        List<AssetGroupType> assetGroupTypes, 
        List<String> assetsToAdd, 
        List<String> assetsToRemove, 
        String description, 
        String name
    ) {
        this.assetGroupId = assetGroupId;
        this.assetGroupTypes = assetGroupTypes;
        this.assetsToAdd = assetsToAdd;
        this.assetsToRemove = assetsToRemove;
        this.description = description;
        this.name = name;
    }



    /**
     * Unique identifier of the asset group to update.
     * @return assetGroupId
     */
    public String getAssetGroupId() {
        return assetGroupId;
    }

    public void setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
    }

    /**
     * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     * @return assetGroupTypes
     */
    public List<AssetGroupType> getAssetGroupTypes() {
        return assetGroupTypes;
    }

    public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
        this.assetGroupTypes = assetGroupTypes;
    }

    /**
     * A list of asset ids to add to the asset group.
     * @return assetsToAdd
     */
    public List<String> getAssetsToAdd() {
        return assetsToAdd;
    }

    public void setAssetsToAdd(List<String> assetsToAdd) {
        this.assetsToAdd = assetsToAdd;
    }

    /**
     * A list of asset ids to remove from the asset group.
     * @return assetsToRemove
     */
    public List<String> getAssetsToRemove() {
        return assetsToRemove;
    }

    public void setAssetsToRemove(List<String> assetsToRemove) {
        this.assetsToRemove = assetsToRemove;
    }

    /**
     * Asset group description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Asset Group name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupUpdateItemReadOrUpdateItem {\n");
        
        sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
        sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
        sb.append("    assetsToAdd: ").append(toIndentedString(assetsToAdd)).append("\n");
        sb.append("    assetsToRemove: ").append(toIndentedString(assetsToRemove)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

