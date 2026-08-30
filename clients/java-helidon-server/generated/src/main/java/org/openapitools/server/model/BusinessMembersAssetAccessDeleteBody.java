package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeleteMemberAssetAccessItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with a list of member asset accesses to delete.
 */
public class BusinessMembersAssetAccessDeleteBody   {

    private List<@Valid DeleteMemberAssetAccessItem> accesses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BusinessMembersAssetAccessDeleteBody() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessMembersAssetAccessDeleteBody.
     *
     * @param accesses List of members asset access to be deleted
     */
    public BusinessMembersAssetAccessDeleteBody(
        List<@Valid DeleteMemberAssetAccessItem> accesses
    ) {
        this.accesses = accesses;
    }



    /**
     * List of members asset access to be deleted
     * @return accesses
     */
    public List<@Valid DeleteMemberAssetAccessItem> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
        this.accesses = accesses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessMembersAssetAccessDeleteBody {\n");
        
        sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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

