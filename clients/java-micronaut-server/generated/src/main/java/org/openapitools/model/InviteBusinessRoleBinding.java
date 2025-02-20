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
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
@Schema(name = "InviteBusinessRoleBinding", description = "An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.")
@JsonPropertyOrder({
  InviteBusinessRoleBinding.JSON_PROPERTY_CREATED_BY_BUSINESS_ID,
  InviteBusinessRoleBinding.JSON_PROPERTY_CREATED_BY_USER_ID,
  InviteBusinessRoleBinding.JSON_PROPERTY_USER,
  InviteBusinessRoleBinding.JSON_PROPERTY_ID,
  InviteBusinessRoleBinding.JSON_PROPERTY_INVITE_DATA,
  InviteBusinessRoleBinding.JSON_PROPERTY_IS_RECEIVED_INVITE
})
@JsonTypeName("InviteBusinessRoleBinding")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class InviteBusinessRoleBinding {
    public static final String JSON_PROPERTY_CREATED_BY_BUSINESS_ID = "created_by_business_id";
    private String createdByBusinessId;

    public static final String JSON_PROPERTY_CREATED_BY_USER_ID = "created_by_user_id";
    private String createdByUserId;

    public static final String JSON_PROPERTY_USER = "user";
    private BusinessAccessUserSummary user;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_INVITE_DATA = "invite_data";
    private BaseInviteDataResponseInviteData inviteData;

    public static final String JSON_PROPERTY_IS_RECEIVED_INVITE = "is_received_invite";
    private Boolean isReceivedInvite;

    public InviteBusinessRoleBinding() {
    }

    public InviteBusinessRoleBinding createdByBusinessId(String createdByBusinessId) {
        this.createdByBusinessId = createdByBusinessId;
        return this;
    }

    /**
     * Unique identifier for the business that created the invite/request.
     * @return createdByBusinessId
     */
    @Nullable
    @Schema(name = "created_by_business_id", example = "1234567890123", description = "Unique identifier for the business that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATED_BY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedByBusinessId() {
        return createdByBusinessId;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_BY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedByBusinessId(String createdByBusinessId) {
        this.createdByBusinessId = createdByBusinessId;
    }

    public InviteBusinessRoleBinding createdByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    /**
     * Unique identifier for the user that created the invite/request.
     * @return createdByUserId
     */
    @Nullable
    @Schema(name = "created_by_user_id", example = "1234567890123", description = "Unique identifier for the user that created the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATED_BY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedByUserId() {
        return createdByUserId;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_BY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public InviteBusinessRoleBinding user(BusinessAccessUserSummary user) {
        this.user = user;
        return this;
    }

    /**
     * Metadata for the user that updated the invite/request.
     * @return user
     */
    @Valid
    @Nullable
    @Schema(name = "user", description = "Metadata for the user that updated the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BusinessAccessUserSummary getUser() {
        return user;
    }

    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUser(BusinessAccessUserSummary user) {
        this.user = user;
    }

    public InviteBusinessRoleBinding id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the invite/request.
     * @return id
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @Schema(name = "id", example = "383791336903426391", description = "Unique identifier of the invite/request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public InviteBusinessRoleBinding inviteData(BaseInviteDataResponseInviteData inviteData) {
        this.inviteData = inviteData;
        return this;
    }

    /**
     * Get inviteData
     * @return inviteData
     */
    @Valid
    @Nullable
    @Schema(name = "invite_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INVITE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BaseInviteDataResponseInviteData getInviteData() {
        return inviteData;
    }

    @JsonProperty(JSON_PROPERTY_INVITE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
        this.inviteData = inviteData;
    }

    public InviteBusinessRoleBinding isReceivedInvite(Boolean isReceivedInvite) {
        this.isReceivedInvite = isReceivedInvite;
        return this;
    }

    /**
     * Indicates whether the invite/request was received.
     * @return isReceivedInvite
     */
    @Nullable
    @Schema(name = "is_received_invite", description = "Indicates whether the invite/request was received.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_IS_RECEIVED_INVITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsReceivedInvite() {
        return isReceivedInvite;
    }

    @JsonProperty(JSON_PROPERTY_IS_RECEIVED_INVITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsReceivedInvite(Boolean isReceivedInvite) {
        this.isReceivedInvite = isReceivedInvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteBusinessRoleBinding inviteBusinessRoleBinding = (InviteBusinessRoleBinding) o;
        return Objects.equals(this.createdByBusinessId, inviteBusinessRoleBinding.createdByBusinessId) &&
            Objects.equals(this.createdByUserId, inviteBusinessRoleBinding.createdByUserId) &&
            Objects.equals(this.user, inviteBusinessRoleBinding.user) &&
            Objects.equals(this.id, inviteBusinessRoleBinding.id) &&
            Objects.equals(this.inviteData, inviteBusinessRoleBinding.inviteData) &&
            Objects.equals(this.isReceivedInvite, inviteBusinessRoleBinding.isReceivedInvite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdByBusinessId, createdByUserId, user, id, inviteData, isReceivedInvite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteBusinessRoleBinding {\n");
        sb.append("    createdByBusinessId: ").append(toIndentedString(createdByBusinessId)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
        sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
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

