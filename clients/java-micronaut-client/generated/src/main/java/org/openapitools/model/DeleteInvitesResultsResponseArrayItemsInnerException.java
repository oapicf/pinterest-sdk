/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */
@JsonPropertyOrder({
  DeleteInvitesResultsResponseArrayItemsInnerException.JSON_PROPERTY_INVITE_ID,
  DeleteInvitesResultsResponseArrayItemsInnerException.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("DeleteInvitesResultsResponseArray_items_inner_exception")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class DeleteInvitesResultsResponseArrayItemsInnerException {
    public static final String JSON_PROPERTY_INVITE_ID = "invite_id";
    private String inviteId;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public DeleteInvitesResultsResponseArrayItemsInnerException() {
    }

    public DeleteInvitesResultsResponseArrayItemsInnerException inviteId(String inviteId) {
        this.inviteId = inviteId;
        return this;
    }

    /**
     * Unique identifier of an invite.
     * @return inviteId
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_INVITE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getInviteId() {
        return inviteId;
    }

    @JsonProperty(JSON_PROPERTY_INVITE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    public DeleteInvitesResultsResponseArrayItemsInnerException message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Error message associated with the error in performing the action on the invite/request.
     * @return message
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteInvitesResultsResponseArrayItemsInnerException deleteInvitesResultsResponseArrayItemsInnerException = (DeleteInvitesResultsResponseArrayItemsInnerException) o;
        return Objects.equals(this.inviteId, deleteInvitesResultsResponseArrayItemsInnerException.inviteId) &&
            Objects.equals(this.message, deleteInvitesResultsResponseArrayItemsInnerException.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInvitesResultsResponseArrayItemsInnerException {\n");
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

