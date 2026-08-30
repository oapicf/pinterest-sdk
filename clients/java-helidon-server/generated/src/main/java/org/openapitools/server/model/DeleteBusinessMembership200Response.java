package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteBusinessMembership200Response   {

    private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeleteBusinessMembership200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteBusinessMembership200Response.
     *
     * @param deletedMembers deletedMembers
     */
    public DeleteBusinessMembership200Response(
        List<@Pattern(regexp = "^\\d+$")String> deletedMembers
    ) {
        this.deletedMembers = deletedMembers;
    }



    /**
     * Get deletedMembers
     * @return deletedMembers
     */
    public List<@Pattern(regexp = "^\\d+$")String> getDeletedMembers() {
        return deletedMembers;
    }

    public void setDeletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
        this.deletedMembers = deletedMembers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBusinessMembership200Response {\n");
        
        sb.append("    deletedMembers: ").append(toIndentedString(deletedMembers)).append("\n");
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

