package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteBusinessPartners   {

    private List<@Pattern(regexp = "^\\d+$")String> deletedPartners = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeleteBusinessPartners() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteBusinessPartners.
     *
     * @param deletedPartners deletedPartners
     */
    public DeleteBusinessPartners(
        List<@Pattern(regexp = "^\\d+$")String> deletedPartners
    ) {
        this.deletedPartners = deletedPartners;
    }



    /**
     * Get deletedPartners
     * @return deletedPartners
     */
    public List<@Pattern(regexp = "^\\d+$")String> getDeletedPartners() {
        return deletedPartners;
    }

    public void setDeletedPartners(List<@Pattern(regexp = "^\\d+$")String> deletedPartners) {
        this.deletedPartners = deletedPartners;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBusinessPartners {\n");
        
        sb.append("    deletedPartners: ").append(toIndentedString(deletedPartners)).append("\n");
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

