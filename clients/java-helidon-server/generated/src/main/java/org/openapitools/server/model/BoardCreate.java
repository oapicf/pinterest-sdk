package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BoardPrivacy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class BoardCreate   {

    private String description;
    private Boolean isAdsOnly = false;
    private String name;
    private BoardPrivacy privacy;

    /**
     * Default constructor.
     */
    public BoardCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create BoardCreate.
     *
     * @param description description
     * @param isAdsOnly If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
     * @param name     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
     * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. 
     */
    public BoardCreate(
        String description, 
        Boolean isAdsOnly, 
        String name, 
        BoardPrivacy privacy
    ) {
        this.description = description;
        this.isAdsOnly = isAdsOnly;
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
     * If set to `true`, the board will be ad-only and can store ad-only Pins.
     * @return isAdsOnly
     */
    public Boolean getIsAdsOnly() {
        return isAdsOnly;
    }

    public void setIsAdsOnly(Boolean isAdsOnly) {
        this.isAdsOnly = isAdsOnly;
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
     *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
     * @return privacy
     */
    public BoardPrivacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(BoardPrivacy privacy) {
        this.privacy = privacy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoardCreate {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isAdsOnly: ").append(toIndentedString(isAdsOnly)).append("\n");
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

