package org.openapitools.server.model;

import org.openapitools.server.model.AssetGroupBinding;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupInput   {

    private AssetGroupBinding assetGroup;

    /**
     * Default constructor.
     */
    public AssetGroupInput() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupInput.
     *
     * @param assetGroup assetGroup
     */
    public AssetGroupInput(
        AssetGroupBinding assetGroup
    ) {
        this.assetGroup = assetGroup;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupInput {\n");
        
        sb.append("    assetGroup: ").append(toIndentedString(assetGroup)).append("\n");
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

