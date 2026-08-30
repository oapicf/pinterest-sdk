package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeletePartnerAssetAccessItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with a list of partner asset accesses to delete.
 */
public class DeletePartnerAssetAccessBody   {

    private List<@Valid DeletePartnerAssetAccessItem> accesses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeletePartnerAssetAccessBody() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePartnerAssetAccessBody.
     *
     * @param accesses List of partner asset accesses to delete.
     */
    public DeletePartnerAssetAccessBody(
        List<@Valid DeletePartnerAssetAccessItem> accesses
    ) {
        this.accesses = accesses;
    }



    /**
     * List of partner asset accesses to delete.
     * @return accesses
     */
    public List<@Valid DeletePartnerAssetAccessItem> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<@Valid DeletePartnerAssetAccessItem> accesses) {
        this.accesses = accesses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePartnerAssetAccessBody {\n");
        
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

