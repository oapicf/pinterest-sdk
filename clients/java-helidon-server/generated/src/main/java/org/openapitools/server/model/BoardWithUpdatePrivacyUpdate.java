package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BoardUpdatePrivacy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class BoardWithUpdatePrivacyUpdate   {

    private String description;
    private String name;
    private BoardUpdatePrivacy privacy;

    /**
     * Default constructor.
     */
    public BoardWithUpdatePrivacyUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create BoardWithUpdatePrivacyUpdate.
     *
     * @param description description
     * @param name     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
     * @param privacy privacy
     */
    public BoardWithUpdatePrivacyUpdate(
        String description, 
        String name, 
        BoardUpdatePrivacy privacy
    ) {
        this.description = description;
        this.name = name;
        this.privacy = privacy;
    }



    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get privacy
     * @return privacy
     */
    public BoardUpdatePrivacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(BoardUpdatePrivacy privacy) {
        this.privacy = privacy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoardWithUpdatePrivacyUpdate {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

