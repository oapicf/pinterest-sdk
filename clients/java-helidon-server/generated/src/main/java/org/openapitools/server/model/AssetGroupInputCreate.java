package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetGroupBinding;
import org.openapitools.server.model.AssetGroupType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupInputCreate   {

    private AssetGroupBinding assetGroup;
    private String assetGroupDescription;
    private String assetGroupName;
    private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssetGroupInputCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupInputCreate.
     *
     * @param assetGroup assetGroup
     * @param assetGroupDescription Asset group description.
     * @param assetGroupName Asset Group name.
     * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     */
    public AssetGroupInputCreate(
        AssetGroupBinding assetGroup, 
        String assetGroupDescription, 
        String assetGroupName, 
        List<AssetGroupType> assetGroupTypes
    ) {
        this.assetGroup = assetGroup;
        this.assetGroupDescription = assetGroupDescription;
        this.assetGroupName = assetGroupName;
        this.assetGroupTypes = assetGroupTypes;
    }



    /**
     * Get assetGroup
     * @return assetGroup
     */
    public AssetGroupBinding getAssetGroup() {
        return assetGroup;
    }

    public void setAssetGroup(AssetGroupBinding assetGroup) {
        this.assetGroup = assetGroup;
    }

    /**
     * Asset group description.
     * @return assetGroupDescription
     */
    public String getAssetGroupDescription() {
        return assetGroupDescription;
    }

    public void setAssetGroupDescription(String assetGroupDescription) {
        this.assetGroupDescription = assetGroupDescription;
    }

    /**
     * Asset Group name.
     * @return assetGroupName
     */
    public String getAssetGroupName() {
        return assetGroupName;
    }

    public void setAssetGroupName(String assetGroupName) {
        this.assetGroupName = assetGroupName;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupInputCreate {\n");
        
        sb.append("    assetGroup: ").append(toIndentedString(assetGroup)).append("\n");
        sb.append("    assetGroupDescription: ").append(toIndentedString(assetGroupDescription)).append("\n");
        sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
        sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
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

