package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateAssetAccessRequestItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An object containing a list of all the asset access requests
 */
public class CreateAssetAccessRequestBody   {

    private List<@Valid CreateAssetAccessRequestItem> assetRequests = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateAssetAccessRequestBody() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssetAccessRequestBody.
     *
     * @param assetRequests assetRequests
     */
    public CreateAssetAccessRequestBody(
        List<@Valid CreateAssetAccessRequestItem> assetRequests
    ) {
        this.assetRequests = assetRequests;
    }



    /**
     * Get assetRequests
     * @return assetRequests
     */
    public List<@Valid CreateAssetAccessRequestItem> getAssetRequests() {
        return assetRequests;
    }

    public void setAssetRequests(List<@Valid CreateAssetAccessRequestItem> assetRequests) {
        this.assetRequests = assetRequests;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetAccessRequestBody {\n");
        
        sb.append("    assetRequests: ").append(toIndentedString(assetRequests)).append("\n");
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

