package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CreativeAssetsVisibilityType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Creative assets product metadata entity
 */
public class CatalogsCreativeAssetsProductMetadata   {

    private String creativeAssetsId;
    private CreativeAssetsVisibilityType visibility;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsProductMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsProductMetadata.
     *
     * @param creativeAssetsId The user-created unique ID that represents the creative assets item.
     * @param visibility visibility
     */
    public CatalogsCreativeAssetsProductMetadata(
        String creativeAssetsId, 
        CreativeAssetsVisibilityType visibility
    ) {
        this.creativeAssetsId = creativeAssetsId;
        this.visibility = visibility;
    }



    /**
     * The user-created unique ID that represents the creative assets item.
     * @return creativeAssetsId
     */
    public String getCreativeAssetsId() {
        return creativeAssetsId;
    }

    public void setCreativeAssetsId(String creativeAssetsId) {
        this.creativeAssetsId = creativeAssetsId;
    }

    /**
     * Get visibility
     * @return visibility
     */
    public CreativeAssetsVisibilityType getVisibility() {
        return visibility;
    }

    public void setVisibility(CreativeAssetsVisibilityType visibility) {
        this.visibility = visibility;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsProductMetadata {\n");
        
        sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

