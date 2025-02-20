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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DeleteAssetGroupResponse
 */
@JsonPropertyOrder({
  DeleteAssetGroupResponse.JSON_PROPERTY_DELETED_ASSET_GROUPS,
  DeleteAssetGroupResponse.JSON_PROPERTY_EXCEPTIONS
})
@JsonTypeName("DeleteAssetGroupResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class DeleteAssetGroupResponse {
    public static final String JSON_PROPERTY_DELETED_ASSET_GROUPS = "deleted_asset_groups";
    private List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups = null;

    public static final String JSON_PROPERTY_EXCEPTIONS = "exceptions";
    private List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions = null;

    public DeleteAssetGroupResponse() {
    }

    public DeleteAssetGroupResponse deletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
        this.deletedAssetGroups = deletedAssetGroups;
        return this;
    }

    public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
        if (this.deletedAssetGroups == null) {
            this.deletedAssetGroups = new ArrayList<>();
        }
        this.deletedAssetGroups.add(deletedAssetGroupsItem);
        return this;
    }

    /**
     * A list of ids of successfully deleted asset groups.
     * @return deletedAssetGroups
     */
    @Nullable
    @Schema(name = "deleted_asset_groups", description = "A list of ids of successfully deleted asset groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DELETED_ASSET_GROUPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Pattern(regexp = "^\\d+$")String> getDeletedAssetGroups() {
        return deletedAssetGroups;
    }

    @JsonProperty(JSON_PROPERTY_DELETED_ASSET_GROUPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
        this.deletedAssetGroups = deletedAssetGroups;
    }

    public DeleteAssetGroupResponse exceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        this.exceptions.add(exceptionsItem);
        return this;
    }

    /**
     * A list of errors associated with the asset groups. Will be returned if there is an error.
     * @return exceptions
     */
    @Nullable
    @Schema(name = "exceptions", description = "A list of errors associated with the asset groups. Will be returned if there is an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_EXCEPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid DeleteAssetGroupResponseExceptionsInner> getExceptions() {
        return exceptions;
    }

    @JsonProperty(JSON_PROPERTY_EXCEPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAssetGroupResponse deleteAssetGroupResponse = (DeleteAssetGroupResponse) o;
        return Objects.equals(this.deletedAssetGroups, deleteAssetGroupResponse.deletedAssetGroups) &&
            Objects.equals(this.exceptions, deleteAssetGroupResponse.exceptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletedAssetGroups, exceptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssetGroupResponse {\n");
        sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

