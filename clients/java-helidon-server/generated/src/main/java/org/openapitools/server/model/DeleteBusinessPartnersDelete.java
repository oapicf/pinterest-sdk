package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.NullablePartnerType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteBusinessPartnersDelete   {

    private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();
    private NullablePartnerType partnerType;

    /**
     * Default constructor.
     */
    public DeleteBusinessPartnersDelete() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteBusinessPartnersDelete.
     *
     * @param partnerIds A list of partner ids to be deleted
     * @param partnerType partnerType
     */
    public DeleteBusinessPartnersDelete(
        List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds, 
        NullablePartnerType partnerType
    ) {
        this.partnerIds = partnerIds;
        this.partnerType = partnerType;
    }



    /**
     * A list of partner ids to be deleted
     * @return partnerIds
     */
    public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
        return partnerIds;
    }

    public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
        this.partnerIds = partnerIds;
    }

    /**
     * Get partnerType
     * @return partnerType
     */
    public NullablePartnerType getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(NullablePartnerType partnerType) {
        this.partnerType = partnerType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBusinessPartnersDelete {\n");
        
        sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
        sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
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

