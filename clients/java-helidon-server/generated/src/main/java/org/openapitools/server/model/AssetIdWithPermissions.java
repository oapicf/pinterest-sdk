package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Asset ID with permission levels.
 */
public class AssetIdWithPermissions   {

    private String id;
    private List<String> permissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssetIdWithPermissions() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetIdWithPermissions.
     *
     * @param id Unique identifier of a business asset.
     * @param permissions Permission levels member or partner has on an asset.
     */
    public AssetIdWithPermissions(
        String id, 
        List<String> permissions
    ) {
        this.id = id;
        this.permissions = permissions;
    }



    /**
     * Unique identifier of a business asset.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Permission levels member or partner has on an asset.
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetIdWithPermissions {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

