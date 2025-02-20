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

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetPartnersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGet200Response;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.CreateAssetGroupBody;
import org.openapitools.model.CreateAssetGroupResponse;
import org.openapitools.model.DeleteAssetGroupBody;
import org.openapitools.model.DeleteAssetGroupResponse;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.model.Error;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.UpdateAssetGroupBody;
import org.openapitools.model.UpdateAssetGroupResponse;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
@Tag(name = "BusinessAccessAssets", description = "The BusinessAccessAssets API")
public class BusinessAccessAssetsController {
    /**
     * Create a new asset group.
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param createAssetGroupBody  (required)
     * @return CreateAssetGroupResponse
     */
    @Operation(
        operationId = "assetGroupCreate",
        summary = "Create a new asset group.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreateAssetGroupResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "createAssetGroupBody", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read", "biz_access:write" })
        }
    )
    @Post(uri="/businesses/{business_id}/asset_groups")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<CreateAssetGroupResponse> assetGroupCreate(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid CreateAssetGroupBody createAssetGroupBody
    ) {
        // TODO implement assetGroupCreate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Delete asset groups.
     * Delete a batch of asset groups.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param deleteAssetGroupBody  (required)
     * @return DeleteAssetGroupResponse
     */
    @Operation(
        operationId = "assetGroupDelete",
        summary = "Delete asset groups.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DeleteAssetGroupResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "deleteAssetGroupBody", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read", "biz_access:write" })
        }
    )
    @Delete(uri="/businesses/{business_id}/asset_groups")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<DeleteAssetGroupResponse> assetGroupDelete(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid DeleteAssetGroupBody deleteAssetGroupBody
    ) {
        // TODO implement assetGroupDelete();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Update asset groups.
     * Update a batch of asset groups with the specified parameters.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param updateAssetGroupBody  (required)
     * @return UpdateAssetGroupResponse
     */
    @Operation(
        operationId = "assetGroupUpdate",
        summary = "Update asset groups.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateAssetGroupResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "updateAssetGroupBody", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read", "biz_access:write" })
        }
    )
    @Patch(uri="/businesses/{business_id}/asset_groups")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<UpdateAssetGroupResponse> assetGroupUpdate(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid UpdateAssetGroupBody updateAssetGroupBody
    ) {
        // TODO implement assetGroupUpdate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get members with access to asset
     * Get all the members the requesting business has granted access to on the given asset.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetId Unique identifier of a business asset. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @return BusinessAssetMembersGet200Response
     */
    @Operation(
        operationId = "businessAssetMembersGet",
        summary = "Get members with access to asset",
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucess", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessAssetMembersGet200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "assetId", description = "Unique identifier of a business asset.", required = true),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items"),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information."),
            @Parameter(name = "startIndex", description = "An index to start fetching the results from. Only the results starting from this index will be returned.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read" })
        }
    )
    @Get(uri="/businesses/{business_id}/assets/{asset_id}/members")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<BusinessAssetMembersGet200Response> businessAssetMembersGet(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @PathVariable(value="asset_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String assetId, 
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="start_index", defaultValue="0") @Nullable @Min(0) Integer startIndex
    ) {
        // TODO implement businessAssetMembersGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get partners with access to asset
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetId Unique identifier of a business asset. (required)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return BusinessAssetPartnersGet200Response
     */
    @Operation(
        operationId = "businessAssetPartnersGet",
        summary = "Get partners with access to asset",
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucess", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessAssetPartnersGet200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "assetId", description = "Unique identifier of a business asset.", required = true),
            @Parameter(name = "startIndex", description = "An index to start fetching the results from. Only the results starting from this index will be returned."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items"),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read" })
        }
    )
    @Get(uri="/businesses/{business_id}/assets/{asset_id}/partners")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<BusinessAssetPartnersGet200Response> businessAssetPartnersGet(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @PathVariable(value="asset_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String assetId, 
        @QueryValue(value="start_index", defaultValue="0") @Nullable @Min(0) Integer startIndex, 
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize
    ) {
        // TODO implement businessAssetPartnersGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * List business assets
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
     * @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
     * @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return BusinessAssetsGet200Response
     */
    @Operation(
        operationId = "businessAssetsGet",
        summary = "List business assets",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessAssetsGet200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "permissions", description = "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned."),
            @Parameter(name = "childAssetId", description = "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child."),
            @Parameter(name = "assetGroupId", description = "An asset group unique identifier. Used to fetch assets contained within the specified asset group."),
            @Parameter(name = "assetType", description = "A resource type to filter the assets by. Only assets of the specified type will be returned."),
            @Parameter(name = "startIndex", description = "An index to start fetching the results from. Only the results starting from this index will be returned."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items"),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read" })
        }
    )
    @Get(uri="/businesses/{business_id}/assets")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<BusinessAssetsGet200Response> businessAssetsGet(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @QueryValue(value="permissions") @Nullable List<PermissionsWithOwner> permissions, 
        @QueryValue(value="child_asset_id") @Nullable @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String childAssetId, 
        @QueryValue(value="asset_group_id") @Nullable @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String assetGroupId, 
        @QueryValue(value="asset_type", defaultValue="AD_ACCOUNT") @Nullable String assetType, 
        @QueryValue(value="start_index", defaultValue="0") @Nullable @Min(0) Integer startIndex, 
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize
    ) {
        // TODO implement businessAssetsGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get assets assigned to a member
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param memberId The member id to fetch assets for. (required)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return BusinessMemberAssetsGet200Response
     */
    @Operation(
        operationId = "businessMemberAssetsGet",
        summary = "Get assets assigned to a member",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessMemberAssetsGet200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "memberId", description = "The member id to fetch assets for.", required = true),
            @Parameter(name = "assetType", description = "A resource type to filter the assets by. Only assets of the specified type will be returned."),
            @Parameter(name = "startIndex", description = "An index to start fetching the results from. Only the results starting from this index will be returned."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items"),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read" })
        }
    )
    @Get(uri="/businesses/{business_id}/members/{member_id}/assets")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<BusinessMemberAssetsGet200Response> businessMemberAssetsGet(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @PathVariable(value="member_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String memberId, 
        @QueryValue(value="asset_type", defaultValue="AD_ACCOUNT") @Nullable String assetType, 
        @QueryValue(value="start_index", defaultValue="0") @Nullable @Min(0) Integer startIndex, 
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize
    ) {
        // TODO implement businessMemberAssetsGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Delete member access to asset
     * Terminate multiple members&#39; access to an asset.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete. (required)
     * @return DeleteMemberAccessResultsResponseArray
     */
    @Operation(
        operationId = "businessMembersAssetAccessDelete",
        summary = "Delete member access to asset",
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DeleteMemberAccessResultsResponseArray.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "businessMembersAssetAccessDeleteRequest", description = "List member assset permissions to delete.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:write" })
        }
    )
    @Delete(uri="/businesses/{business_id}/members/assets/access")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<DeleteMemberAccessResultsResponseArray> businessMembersAssetAccessDelete(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest
    ) {
        // TODO implement businessMembersAssetAccessDelete();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Assign/Update member asset permissions
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param updateMemberAssetAccessBody List of member asset permissions to create or update. (required)
     * @return UpdateMemberAssetsResultsResponseArray
     */
    @Operation(
        operationId = "businessMembersAssetAccessUpdate",
        summary = "Assign/Update member asset permissions",
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateMemberAssetsResultsResponseArray.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "updateMemberAssetAccessBody", description = "List of member asset permissions to create or update.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:write" })
        }
    )
    @Patch(uri="/businesses/{business_id}/members/assets/access")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<UpdateMemberAssetsResultsResponseArray> businessMembersAssetAccessUpdate(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid UpdateMemberAssetAccessBody updateMemberAssetAccessBody
    ) {
        // TODO implement businessMembersAssetAccessUpdate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get assets assigned to a partner or assets assigned by a partner
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param partnerId The partner id to be bound to the Business (required)
     * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return BusinessPartnerAssetAccessGet200Response
     */
    @Operation(
        operationId = "businessPartnerAssetAccessGet",
        summary = "Get assets assigned to a partner or assets assigned by a partner",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessPartnerAssetAccessGet200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "partnerId", description = "The partner id to be bound to the Business", required = true),
            @Parameter(name = "partnerType", description = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset."),
            @Parameter(name = "assetType", description = "A resource type to filter the assets by. Only assets of the specified type will be returned."),
            @Parameter(name = "startIndex", description = "An index to start fetching the results from. Only the results starting from this index will be returned."),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:read" })
        }
    )
    @Get(uri="/businesses/{business_id}/partners/{partner_id}/assets")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<BusinessPartnerAssetAccessGet200Response> businessPartnerAssetAccessGet(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @PathVariable(value="partner_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String partnerId, 
        @QueryValue(value="partner_type") @Nullable @Valid PartnerType partnerType, 
        @QueryValue(value="asset_type", defaultValue="AD_ACCOUNT") @Nullable String assetType, 
        @QueryValue(value="start_index", defaultValue="0") @Nullable @Min(0) Integer startIndex, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="bookmark") @Nullable String bookmark
    ) {
        // TODO implement businessPartnerAssetAccessGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Delete partner access to asset
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param deletePartnerAssetAccessBody  (required)
     * @return DeletePartnerAssetsResultsResponseArray
     */
    @Operation(
        operationId = "deletePartnerAssetAccessHandlerImpl",
        summary = "Delete partner access to asset",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DeletePartnerAssetsResultsResponseArray.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "deletePartnerAssetAccessBody", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:write" })
        }
    )
    @Delete(uri="/businesses/{business_id}/partners/assets")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<DeletePartnerAssetsResultsResponseArray> deletePartnerAssetAccessHandlerImpl(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
    ) {
        // TODO implement deletePartnerAssetAccessHandlerImpl();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Assign/Update partner asset permissions
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners. (required)
     * @return UpdatePartnerAssetsResultsResponseArray
     */
    @Operation(
        operationId = "updatePartnerAssetAccessHandlerImpl",
        summary = "Assign/Update partner asset permissions",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UpdatePartnerAssetsResultsResponseArray.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "businessId", description = "Unique identifier of the requesting business.", required = true),
            @Parameter(name = "updatePartnerAssetAccessBody", description = "A list of assets and permissions to assign to your partners.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "biz_access:write" })
        }
    )
    @Patch(uri="/businesses/{business_id}/partners/assets")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<UpdatePartnerAssetsResultsResponseArray> updatePartnerAssetAccessHandlerImpl(
        @PathVariable(value="business_id") @NotNull @Pattern(regexp="^\\d+$") @Size(min=1, max=20) String businessId, 
        @Body @NotNull @Valid UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
    ) {
        // TODO implement updatePartnerAssetAccessHandlerImpl();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
