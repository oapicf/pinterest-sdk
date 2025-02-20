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
import org.openapitools.model.BusinessRoleForMembers;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * MembersToDeleteBodyMembersInner
 */
@JsonPropertyOrder({
  MembersToDeleteBodyMembersInner.JSON_PROPERTY_MEMBER_ID,
  MembersToDeleteBodyMembersInner.JSON_PROPERTY_BUSINESS_ROLE
})
@JsonTypeName("MembersToDeleteBody_members_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class MembersToDeleteBodyMembersInner {
    public static final String JSON_PROPERTY_MEMBER_ID = "member_id";
    private String memberId;

    public static final String JSON_PROPERTY_BUSINESS_ROLE = "business_role";
    private BusinessRoleForMembers businessRole;

    public MembersToDeleteBodyMembersInner(String memberId, BusinessRoleForMembers businessRole) {
        this.memberId = memberId;
        this.businessRole = businessRole;
    }

    public MembersToDeleteBodyMembersInner memberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * Unique identifier of the member
     * @return memberId
     */
    @NotNull
    @Pattern(regexp="^\\d+$")
    @Size(max=25)
    @JsonProperty(JSON_PROPERTY_MEMBER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMemberId() {
        return memberId;
    }

    @JsonProperty(JSON_PROPERTY_MEMBER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public MembersToDeleteBodyMembersInner businessRole(BusinessRoleForMembers businessRole) {
        this.businessRole = businessRole;
        return this;
    }

    /**
     * Get businessRole
     * @return businessRole
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_BUSINESS_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BusinessRoleForMembers getBusinessRole() {
        return businessRole;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessRole(BusinessRoleForMembers businessRole) {
        this.businessRole = businessRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner = (MembersToDeleteBodyMembersInner) o;
        return Objects.equals(this.memberId, membersToDeleteBodyMembersInner.memberId) &&
            Objects.equals(this.businessRole, membersToDeleteBodyMembersInner.businessRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, businessRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MembersToDeleteBodyMembersInner {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
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

