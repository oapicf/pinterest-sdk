package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetGroupBinding;
import org.openapitools.server.model.AssetGroupUpdateError;
import org.openapitools.server.model.AssetGroupUpdateItemReadOrUpdateItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupModificationReadOrUpdate   {

    private List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();
    private List<@Valid AssetGroupUpdateError> exceptions = new ArrayList<>();
    private List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssetGroupModificationReadOrUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupModificationReadOrUpdate.
     *
     * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
     * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
     * @param updatedAssetGroups A list of successfully edited asset groups.
     */
    public AssetGroupModificationReadOrUpdate(
        List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate, 
        List<@Valid AssetGroupUpdateError> exceptions, 
        List<@Valid AssetGroupBinding> updatedAssetGroups
    ) {
        this.assetGroupsToUpdate = assetGroupsToUpdate;
        this.exceptions = exceptions;
        this.updatedAssetGroups = updatedAssetGroups;
    }



    /**
     * A list of asset groups and the data that will be used to update them.
     * @return assetGroupsToUpdate
     */
    public List<@Valid AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
        return assetGroupsToUpdate;
    }

    public void setAssetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
        this.assetGroupsToUpdate = assetGroupsToUpdate;
    }

    /**
     * A list of errors associated with the asset groups. Will be returned if there is an error.
     * @return exceptions
     */
    public List<@Valid AssetGroupUpdateError> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<@Valid AssetGroupUpdateError> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * A list of successfully edited asset groups.
     * @return updatedAssetGroups
     */
    public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
        return updatedAssetGroups;
    }

    public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
        this.updatedAssetGroups = updatedAssetGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupModificationReadOrUpdate {\n");
        
        sb.append("    assetGroupsToUpdate: ").append(toIndentedString(assetGroupsToUpdate)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
        sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
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

