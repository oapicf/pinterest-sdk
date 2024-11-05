package org.openapitools.api

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.AuthRespondInvitesBody
import org.openapitools.model.BusinessAssetMembersGet200Response
import org.openapitools.model.BusinessAssetPartnersGet200Response
import org.openapitools.model.BusinessAssetsGet200Response
import org.openapitools.model.BusinessMemberAssetsGet200Response
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.model.BusinessSharedAudience
import org.openapitools.model.BusinessSharedAudienceResponse
import org.openapitools.model.CancelInvitesBody
import org.openapitools.model.CreateAssetAccessRequestBody
import org.openapitools.model.CreateAssetAccessRequestResponse
import org.openapitools.model.CreateAssetGroupBody
import org.openapitools.model.CreateAssetGroupResponse
import org.openapitools.model.CreateAssetInvitesRequest
import org.openapitools.model.CreateInvitesResultsResponseArray
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.model.DeleteAssetGroupBody
import org.openapitools.model.DeleteAssetGroupResponse
import org.openapitools.model.DeleteInvitesResultsResponseArray
import org.openapitools.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.model.DeletePartnerAssetAccessBody
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.model.DeletePartnersRequest
import org.openapitools.model.DeletePartnersResponse
import org.openapitools.model.DeletedMembersResponse
import org.openapitools.model.Error
import org.openapitools.model.GetBusinessEmployers200Response
import org.openapitools.model.GetBusinessMembers200Response
import org.openapitools.model.GetBusinessPartners200Response
import org.openapitools.model.GetInvites200Response
import org.openapitools.model.InviteType
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.MembersToDeleteBody
import org.openapitools.model.PartnerType
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.RespondToInvitesResponseArray
import org.openapitools.model.SharedAudience
import org.openapitools.model.SharedAudienceResponse
import org.openapitools.model.UpdateAssetGroupBody
import org.openapitools.model.UpdateAssetGroupResponse
import org.openapitools.model.UpdateInvitesResultsResponseArray
import org.openapitools.model.UpdateMemberAssetAccessBody
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.model.UpdateMemberBusinessRoleBody
import org.openapitools.model.UpdateMemberResultsResponseArray
import org.openapitools.model.UpdatePartnerAssetAccessBody
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class BusinessesApiController() {

    @Operation(
        summary = "Create a request to access an existing partner's assets.",
        operationId = "assetAccessRequestsCreate",
        description = """Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CreateAssetAccessRequestResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{business_id}/requests/assets/access"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun assetAccessRequestsCreate(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody createAssetAccessRequestBody: CreateAssetAccessRequestBody): ResponseEntity<CreateAssetAccessRequestResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a new asset group.",
        operationId = "assetGroupCreate",
        description = """Create a new asset group with the specified parameters.
- An <a href="https://help.pinterest.com/en/business/article/asset-groups">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CreateAssetGroupResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{business_id}/asset_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun assetGroupCreate(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody createAssetGroupBody: CreateAssetGroupBody): ResponseEntity<CreateAssetGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete asset groups.",
        operationId = "assetGroupDelete",
        description = """Delete a batch of asset groups.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeleteAssetGroupResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/asset_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun assetGroupDelete(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody deleteAssetGroupBody: DeleteAssetGroupBody): ResponseEntity<DeleteAssetGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update asset groups.",
        operationId = "assetGroupUpdate",
        description = """Update a batch of asset groups with the specified parameters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UpdateAssetGroupResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/asset_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun assetGroupUpdate(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody updateAssetGroupBody: UpdateAssetGroupBody): ResponseEntity<UpdateAssetGroupResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List accounts with access to an audience owned by a business",
        operationId = "businessAccountAudiencesSharedAccountsList",
        description = """List all ad accounts and/or businesses that have access to a specific audience.
The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business.
If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AdAccountsAudiencesSharedAccountsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid business audiences shared accounts parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Shared accounts not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error.", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/audiences/shared/accounts"],
        produces = ["application/json"]
    )
    fun businessAccountAudiencesSharedAccountsList(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@NotNull @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of the audience to use to filter the results.", required = true) @Valid @RequestParam(value = "audience_id", required = true) audienceId: kotlin.String,@NotNull @Parameter(description = "Filter accounts by account type.", required = true, schema = Schema(allowableValues = ["AD_ACCOUNT", "BUSINESS_ACCOUNT"], defaultValue = "AD_ACCOUNT")) @Valid @RequestParam(value = "account_type", required = true, defaultValue = "AD_ACCOUNT") accountType: AudienceAccountType,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get members with access to asset",
        operationId = "businessAssetMembersGet",
        description = """Get all the members the requesting business has granted access to on the given asset.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Sucess", content = [Content(schema = Schema(implementation = BusinessAssetMembersGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/assets/{asset_id}/members"],
        produces = ["application/json"]
    )
    fun businessAssetMembersGet(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of a business asset.", required = true) @PathVariable("asset_id") assetId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int): ResponseEntity<BusinessAssetMembersGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get partners with access to asset",
        operationId = "businessAssetPartnersGet",
        description = """Get all the partners the requesting business has granted access to on the given asset.
Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with
you cannot be shared with a different partner.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Sucess", content = [Content(schema = Schema(implementation = BusinessAssetPartnersGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/assets/{asset_id}/partners"],
        produces = ["application/json"]
    )
    fun businessAssetPartnersGet(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of a business asset.", required = true) @PathVariable("asset_id") assetId: kotlin.String,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<BusinessAssetPartnersGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List business assets",
        operationId = "businessAssetsGet",
        description = """Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BusinessAssetsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/assets"],
        produces = ["application/json"]
    )
    fun businessAssetsGet(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.") @Valid @RequestParam(value = "permissions", required = false) permissions: kotlin.collections.List<PermissionsWithOwner>?,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.") @Valid @RequestParam(value = "child_asset_id", required = false) childAssetId: kotlin.String?,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "An asset group unique identifier. Used to fetch assets contained within the specified asset group.") @Valid @RequestParam(value = "asset_group_id", required = false) assetGroupId: kotlin.String?,@Parameter(description = "A resource type to filter the assets by. Only assets of the specified type will be returned.", schema = Schema(allowableValues = ["AD_ACCOUNT", "PROFILE", "ASSET_GROUP"], defaultValue = "AD_ACCOUNT")) @Valid @RequestParam(value = "asset_type", required = false, defaultValue = "AD_ACCOUNT") assetType: kotlin.String,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<BusinessAssetsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get assets assigned to a member",
        operationId = "businessMemberAssetsGet",
        description = """Get assets on which you assigned asset permissions to the given member. Can be used to:
- get all assets, regardless of asset type or
- get assets of one asset type by using the asset_type query.
The return response will include the permissions the member has to that asset and the asset type.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BusinessMemberAssetsGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/members/{member_id}/assets"],
        produces = ["application/json"]
    )
    fun businessMemberAssetsGet(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "The member id to fetch assets for.", required = true) @PathVariable("member_id") memberId: kotlin.String,@Parameter(description = "A resource type to filter the assets by. Only assets of the specified type will be returned.", schema = Schema(allowableValues = ["AD_ACCOUNT", "PROFILE", "ASSET_GROUP"], defaultValue = "AD_ACCOUNT")) @Valid @RequestParam(value = "asset_type", required = false, defaultValue = "AD_ACCOUNT") assetType: kotlin.String,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<BusinessMemberAssetsGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete member access to asset",
        operationId = "businessMembersAssetAccessDelete",
        description = """Terminate multiple members' access to an asset.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = DeleteMemberAccessResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/members/assets/access"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun businessMembersAssetAccessDelete(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "List member assset permissions to delete.", required = true) @Valid @RequestBody businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): ResponseEntity<DeleteMemberAccessResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Assign/Update member asset permissions",
        operationId = "businessMembersAssetAccessUpdate",
        description = """Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset.
Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = UpdateMemberAssetsResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/members/assets/access"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun businessMembersAssetAccessUpdate(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "List of member asset permissions to create or update.", required = true) @Valid @RequestBody updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): ResponseEntity<UpdateMemberAssetsResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get assets assigned to a partner or assets assigned by a partner",
        operationId = "businessPartnerAssetAccessGet",
        description = """Can be used to get the business assets your partner has granted you access to or the business assets you have
granted your partner access to. If you specify:
- partner_type=INTERNAL, you will retrieve your business assets that the partner has access to.
- partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BusinessPartnerAssetAccessGet200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/partners/{partner_id}/assets"],
        produces = ["application/json"]
    )
    fun businessPartnerAssetAccessGet(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "The partner id to be bound to the Business", required = true) @PathVariable("partner_id") partnerId: kotlin.String,@Parameter(description = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.") @Valid partnerType: PartnerType?,@Parameter(description = "A resource type to filter the assets by. Only assets of the specified type will be returned.", schema = Schema(allowableValues = ["AD_ACCOUNT", "PROFILE", "ASSET_GROUP"], defaultValue = "AD_ACCOUNT")) @Valid @RequestParam(value = "asset_type", required = false, defaultValue = "AD_ACCOUNT") assetType: kotlin.String,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<BusinessPartnerAssetAccessGet200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Cancel invites/requests",
        operationId = "cancelInvitesOrRequests",
        description = """Cancel membership/partnership invites and/or requests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeleteInvitesResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/invites"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun cancelInvitesOrRequests(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Business id", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "A list with invite ids", required = true) @Valid @RequestBody cancelInvitesBody: CancelInvitesBody): ResponseEntity<DeleteInvitesResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update invite/request with an asset permission",
        operationId = "createAssetInvites",
        description = """Assign asset permissions information to an existing invite/request. Can be used to:
- Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing
  partnership exists, use "Create a request to access an existing partner's assets" to request access to your
  partner's assets.
    - invite_type="PARTNER_REQUEST"
- Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.
  If there is an existing partnership, use "Assign/Update partner asset permissions" to assign a partner access to
  new assets.
    - invite_type="PARTNER_INVITE"
- Invite a member to access your business assets. Note: This is only for when there is no existing membership.
  If there is an existing membership, use "Assign/Update member asset permissions" to assign a member access to new
  assets.
    - invite_type="MEMBER_INVITE"

To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UpdateInvitesResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{business_id}/invites/assets/access"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createAssetInvites(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "A list of invites/requests together with the asset permissions to be assigned to the invite/request. ", required = true) @Valid @RequestBody createAssetInvitesRequest: CreateAssetInvitesRequest): ResponseEntity<UpdateInvitesResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create invites or requests",
        operationId = "createMembershipOrPartnershipInvites",
        description = """Create batch invites or requests. Can create batch invites or requests as described below.
- Invite members to join the business. This would required specifying the following:
    - invite_type="MEMBER_INVITE"
    - business_role="EMPLOYEE" OR business_role="BIZ_ADMIN" (To learn more about business roles, visit
    https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)
    - members
- Invite partners to access your business assets. This would require specifying the following:
    - invite_type="PARTNER_INVITE"
    - business_role="PARTNER"
    - partners
- Request to be a partner so you can access their assets. This would require specifying the following:
    - invite_type="PARTNER_REQUEST"
    - business_role="PARTNER"
    - partners""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = CreateInvitesResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{business_id}/invites"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createMembershipOrPartnershipInvites(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Business id", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "An object with the properties: invite_type, partners, members, business_role", required = true) @Valid @RequestBody createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): ResponseEntity<CreateInvitesResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Terminate business memberships",
        operationId = "deleteBusinessMembership",
        description = """Terminate memberships between the specified members and your business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeletedMembersResponse::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/members"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteBusinessMembership(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Business id", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "List of members with role to delete.", required = true) @Valid @RequestBody membersToDeleteBody: MembersToDeleteBody): ResponseEntity<DeletedMembersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Terminate business partnerships",
        operationId = "deleteBusinessPartners",
        description = """Terminate partnerships between the specified partners and your business.
Note: You may only batch terminate partners of the same partner type.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeletePartnersResponse::class))]),
            ApiResponse(responseCode = "404", description = "A supplied partner id doesn't exist", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/partners"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteBusinessPartners(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. ", required = true) @Valid @RequestBody deletePartnersRequest: DeletePartnersRequest): ResponseEntity<DeletePartnersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete partner access to asset",
        operationId = "deletePartnerAssetAccessHandlerImpl",
        description = """Terminate multiple partners' access to an asset. If
- partner_type=INTERNAL: You will terminate a partner's asset access to your business assets.
- partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = DeletePartnerAssetsResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/businesses/{business_id}/partners/assets"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePartnerAssetAccessHandlerImpl(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): ResponseEntity<DeletePartnerAssetsResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List business employers for user",
        operationId = "getBusinessEmployers",
        description = """Get all of the viewing user's business employers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = GetBusinessEmployers200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/employers"],
        produces = ["application/json"]
    )
    fun getBusinessEmployers(@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<GetBusinessEmployers200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get business members",
        operationId = "getBusinessMembers",
        description = """Get all members of the specified business.
The return response will include the member's business_role and assets they have access to if assets_summary=TRUE""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = GetBusinessMembers200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/members"],
        produces = ["application/json"]
    )
    fun getBusinessMembers(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "assets_summary", required = false, defaultValue = "false") assetsSummary: kotlin.Boolean,@Parameter(description = "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.") @Valid @RequestParam(value = "business_roles", required = false) businessRoles: kotlin.collections.List<MemberBusinessRole>?,@Size(max=500) @Parameter(description = "A list of business members ids separated by comma.") @Valid @RequestParam(value = "member_ids", required = false) memberIds: kotlin.String?,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<GetBusinessMembers200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get business partners",
        operationId = "getBusinessPartners",
        description = """Get all partners of the specified business.

If the assets_summary=TRUE and:
- partner_type=INTERNAL, the business assets returned are your business assets the partner has access to.
- partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you
  access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = GetBusinessPartners200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/partners"],
        produces = ["application/json"]
    )
    fun getBusinessPartners(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "assets_summary", required = false, defaultValue = "false") assetsSummary: kotlin.Boolean,@Parameter(description = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", schema = Schema(allowableValues = ["INTERNAL", "EXTERNAL"])) @Valid @RequestParam(value = "partner_type", required = false) partnerType: PartnerType?,@Size(max=500) @Parameter(description = "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.") @Valid @RequestParam(value = "partner_ids", required = false) partnerIds: kotlin.String?,@Min(0)@Parameter(description = "An index to start fetching the results from. Only the results starting from this index will be returned.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start_index", required = false, defaultValue = "0") startIndex: kotlin.Int,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?): ResponseEntity<GetBusinessPartners200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get invites/requests",
        operationId = "getInvites",
        description = """Get the membership/partnership invites and/or requests for the authorized user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = GetInvites200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/invites"],
        produces = ["application/json"]
    )
    fun getInvites(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "A boolean field to indicate whether the invite is to create a partnership or a membership.", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "is_member", required = false, defaultValue = "true") isMember: kotlin.Boolean,@Size(min=1) @Parameter(description = "A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.", schema = Schema(allowableValues = ["PENDING", "EXPIRED"])) @Valid @RequestParam(value = "invite_status", required = false) inviteStatus: kotlin.collections.List<kotlin.String>?,@Parameter(description = "Invite type to filter invites by. Only invites of the specified type will be returned.", schema = Schema(allowableValues = ["MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST"])) @Valid @RequestParam(value = "invite_type", required = false) inviteType: InviteType?,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<GetInvites200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Accept or decline an invite/request",
        operationId = "respondBusinessAccessInvites",
        description = """Accept or decline invites or requests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = RespondToInvitesResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read", "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/invites"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun respondBusinessAccessInvites(@Parameter(description = "", required = true) @Valid @RequestBody authRespondInvitesBody: AuthRespondInvitesBody): ResponseEntity<RespondToInvitesResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List received audiences for a business",
        operationId = "sharedAudiencesForBusinessList",
        description = """Get a list of received audiences for the given business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = AudiencesList200Response::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/businesses/{business_id}/audiences"],
        produces = ["application/json"]
    )
    fun sharedAudiencesForBusinessList(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Parameter(description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", schema = Schema(allowableValues = ["ASCENDING", "DESCENDING"])) @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<AudiencesList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update member's business role",
        operationId = "updateBusinessMemberships",
        description = """Update a member's business role within the business.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = UpdateMemberResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/members"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessMemberships(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Business id", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "List of objects with the member id and the business_role.", required = true) @Valid@Size(min=1)  @RequestBody updateMemberBusinessRoleBody: kotlin.collections.List<UpdateMemberBusinessRoleBody>): ResponseEntity<UpdateMemberResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing from a business to ad accounts",
        operationId = "updateBusinessToAdAccountSharedAudience",
        description = """From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = SharedAudienceResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/audiences/ad_accounts/shared"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessToAdAccountSharedAudience(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody sharedAudience: SharedAudience): ResponseEntity<SharedAudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update audience sharing between businesses",
        operationId = "updateBusinessToBusinessSharedAudience",
        description = """From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = BusinessSharedAudienceResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/audiences/businesses/shared"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessToBusinessSharedAudience(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody businessSharedAudience: BusinessSharedAudience): ResponseEntity<BusinessSharedAudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Assign/Update partner asset permissions",
        operationId = "updatePartnerAssetAccessHandlerImpl",
        description = """Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset.
If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them.
To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview

Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be
applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of
the type PROFILE.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Success", content = [Content(schema = Schema(implementation = UpdatePartnerAssetsResultsResponseArray::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "biz_access:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/businesses/{business_id}/partners/assets"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePartnerAssetAccessHandlerImpl(@Pattern(regexp="^\\d+$") @Size(min=1,max=20) @Parameter(description = "Unique identifier of the requesting business.", required = true) @PathVariable("business_id") businessId: kotlin.String,@Parameter(description = "A list of assets and permissions to assign to your partners.", required = true) @Valid @RequestBody updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): ResponseEntity<UpdatePartnerAssetsResultsResponseArray> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
