package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class FollowUserCreate   {

    private Boolean autoFollow;

    /**
     * Default constructor.
     */
    public FollowUserCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create FollowUserCreate.
     *
     * @param autoFollow   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
     */
    public FollowUserCreate(
        Boolean autoFollow
    ) {
        this.autoFollow = autoFollow;
    }



    /**
     *   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
     * @return autoFollow
     */
    public Boolean getAutoFollow() {
        return autoFollow;
    }

    public void setAutoFollow(Boolean autoFollow) {
        this.autoFollow = autoFollow;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FollowUserCreate {\n");
        
        sb.append("    autoFollow: ").append(toIndentedString(autoFollow)).append("\n");
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

