package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BusinessAccessUserSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object containing the permissions a business member/partner has on the asset.
 */
public class UserSingleAssetBinding   {

    private List<String> permissions = new ArrayList<>();
    private BusinessAccessUserSummary user;

    /**
     * Default constructor.
     */
    public UserSingleAssetBinding() {
    // JSON-B / Jackson
    }

    /**
     * Create UserSingleAssetBinding.
     *
     * @param permissions Permission levels member or partner has on an asset.
     * @param user user
     */
    public UserSingleAssetBinding(
        List<String> permissions, 
        BusinessAccessUserSummary user
    ) {
        this.permissions = permissions;
        this.user = user;
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
     * Get user
     * @return user
     */
    public BusinessAccessUserSummary getUser() {
        return user;
    }

    public void setUser(BusinessAccessUserSummary user) {
        this.user = user;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSingleAssetBinding {\n");
        
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

