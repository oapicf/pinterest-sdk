package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateMemberAssetAccessItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with a list of all the new member asset accesses.
 */
public class UpdateMemberAssetAccessBody   {

    private List<@Valid UpdateMemberAssetAccessItem> accesses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateMemberAssetAccessBody() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateMemberAssetAccessBody.
     *
     * @param accesses List of member asset accesses to assign or update.
     */
    public UpdateMemberAssetAccessBody(
        List<@Valid UpdateMemberAssetAccessItem> accesses
    ) {
        this.accesses = accesses;
    }



    /**
     * List of member asset accesses to assign or update.
     * @return accesses
     */
    public List<@Valid UpdateMemberAssetAccessItem> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<@Valid UpdateMemberAssetAccessItem> accesses) {
        this.accesses = accesses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberAssetAccessBody {\n");
        
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

