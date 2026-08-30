package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdatePartnerAssetAccessItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object with a list of partner asset accesses to assign or update.
 */
public class UpdatePartnerAssetAccessBody   {

    private List<@Valid UpdatePartnerAssetAccessItem> accesses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdatePartnerAssetAccessBody() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePartnerAssetAccessBody.
     *
     * @param accesses List of partner asset accesses to assign or update.
     */
    public UpdatePartnerAssetAccessBody(
        List<@Valid UpdatePartnerAssetAccessItem> accesses
    ) {
        this.accesses = accesses;
    }



    /**
     * List of partner asset accesses to assign or update.
     * @return accesses
     */
    public List<@Valid UpdatePartnerAssetAccessItem> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
        this.accesses = accesses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartnerAssetAccessBody {\n");
        
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

