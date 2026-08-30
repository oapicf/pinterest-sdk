package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AppsflyerPlatform;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class AppsflyerAudienceCreate   {

    private String name;
    private AppsflyerPlatform platform;

    /**
     * Default constructor.
     */
    public AppsflyerAudienceCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create AppsflyerAudienceCreate.
     *
     * @param name The name of the audience
     * @param platform The platform of the audience
     */
    public AppsflyerAudienceCreate(
        String name, 
        AppsflyerPlatform platform
    ) {
        this.name = name;
        this.platform = platform;
    }



    /**
     * The name of the audience
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The platform of the audience
     * @return platform
     */
    public AppsflyerPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(AppsflyerPlatform platform) {
        this.platform = platform;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsflyerAudienceCreate {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

