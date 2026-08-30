package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupDeletionDelete   {

    private List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssetGroupDeletionDelete() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupDeletionDelete.
     *
     * @param assetGroupsToDelete assetGroupsToDelete
     */
    public AssetGroupDeletionDelete(
        List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete
    ) {
        this.assetGroupsToDelete = assetGroupsToDelete;
    }



    /**
     * Get assetGroupsToDelete
     * @return assetGroupsToDelete
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAssetGroupsToDelete() {
        return assetGroupsToDelete;
    }

    public void setAssetGroupsToDelete(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
        this.assetGroupsToDelete = assetGroupsToDelete;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupDeletionDelete {\n");
        
        sb.append("    assetGroupsToDelete: ").append(toIndentedString(assetGroupsToDelete)).append("\n");
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

