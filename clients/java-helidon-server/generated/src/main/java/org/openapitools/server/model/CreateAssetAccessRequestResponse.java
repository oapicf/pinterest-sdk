package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.AssetAccessRequestError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateAssetAccessRequestResponse   {

    private List<@Valid AssetAccessRequestError> exceptions = new ArrayList<>();
    private Map<String, String> invites = new HashMap<>();

    /**
     * Default constructor.
     */
    public CreateAssetAccessRequestResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssetAccessRequestResponse.
     *
     * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
     * @param invites An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
     */
    public CreateAssetAccessRequestResponse(
        List<@Valid AssetAccessRequestError> exceptions, 
        Map<String, String> invites
    ) {
        this.exceptions = exceptions;
        this.invites = invites;
    }



    /**
     * A list of errors associated with the asset access requests. Will be returned if there is an error.
     * @return exceptions
     */
    public List<@Valid AssetAccessRequestError> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<@Valid AssetAccessRequestError> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
     * @return invites
     */
    public Map<String, String> getInvites() {
        return invites;
    }

    public void setInvites(Map<String, String> invites) {
        this.invites = invites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetAccessRequestResponse {\n");
        
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
        sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

