package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AssetGroupDeleteError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupDeletion   {

    private List<String> deletedAssetGroups = new ArrayList<>();
    private List<@Valid AssetGroupDeleteError> exceptions;

    /**
     * Default constructor.
     */
    public AssetGroupDeletion() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupDeletion.
     *
     * @param deletedAssetGroups deletedAssetGroups
     * @param exceptions exceptions
     */
    public AssetGroupDeletion(
        List<String> deletedAssetGroups, 
        List<@Valid AssetGroupDeleteError> exceptions
    ) {
        this.deletedAssetGroups = deletedAssetGroups;
        this.exceptions = exceptions;
    }



    /**
     * Get deletedAssetGroups
     * @return deletedAssetGroups
     */
    public List<String> getDeletedAssetGroups() {
        return deletedAssetGroups;
    }

    public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
        this.deletedAssetGroups = deletedAssetGroups;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public List<@Valid AssetGroupDeleteError> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<@Valid AssetGroupDeleteError> exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupDeletion {\n");
        
        sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

