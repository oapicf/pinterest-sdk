package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AssetGroupDeletion;
import com.prokarma.pkmst.model.AssetGroupDeletionDelete;
import com.prokarma.pkmst.model.AssetGroupInput;
import com.prokarma.pkmst.model.AssetGroupInputCreate;
import com.prokarma.pkmst.model.AssetGroupModification;
import com.prokarma.pkmst.model.AssetGroupModificationReadOrUpdate;
import com.prokarma.pkmst.model.AssetPermissionType;
import com.prokarma.pkmst.model.AssetSearchBy;
import com.prokarma.pkmst.model.AssetSortBy;
import com.prokarma.pkmst.model.BusinessAssetMembersGet200Response;
import com.prokarma.pkmst.model.BusinessAssetsGet200Response;
import com.prokarma.pkmst.model.BusinessMemberAssetsGetResponse;
import com.prokarma.pkmst.model.BusinessMembersAssetAccessDeleteBody;
import com.prokarma.pkmst.model.BusinessPartnerAssetAccessGet200Response;
import com.prokarma.pkmst.model.DeleteMemberAccessResultsResponseArray;
import com.prokarma.pkmst.model.DeletePartnerAssetAccessBody;
import com.prokarma.pkmst.model.DeletePartnerAssetAccessResultsResponseArray;
import java.util.List;
import com.prokarma.pkmst.model.NonDraftEntityStatus;
import com.prokarma.pkmst.model.PermissionsWithOwner;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.UpdateMemberAssetAccessBody;
import com.prokarma.pkmst.model.UpdateMemberAssetsResultsResponseArray;
import com.prokarma.pkmst.model.UpdatePartnerAssetAccessBody;
import com.prokarma.pkmst.model.UpdatePartnerAssetsResultsResponseArray;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class BusinessAccessAssetsApiController implements BusinessAccessAssetsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessAccessAssetsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AssetGroupInput> assetGroupCreate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody AssetGroupInputCreate assetGroupInputCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupInput>(objectMapper.readValue("", AssetGroupInput.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssetGroupInput>(HttpStatus.OK);
    }

    public ResponseEntity<AssetGroupDeletion> assetGroupDelete(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody AssetGroupDeletionDelete assetGroupDeletionDelete,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupDeletion>(objectMapper.readValue("", AssetGroupDeletion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupDeletion>(objectMapper.readValue("", AssetGroupDeletion.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssetGroupDeletion>(HttpStatus.OK);
    }

    public ResponseEntity<AssetGroupModification> assetGroupUpdate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssetGroupModification>(objectMapper.readValue("", AssetGroupModification.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssetGroupModification>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetMembersGet200Response> businessAssetMembersGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of a business asset.",required=true ) @PathVariable("asset_id") String assetId,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Fetches system users if True. Fetches regular user employees if False.", defaultValue = "false")  @RequestParam(value = "fetch_system_users", required = false, defaultValue="false") Boolean fetchSystemUsers,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetMembersGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetMembersGet200Response> businessAssetPartnersGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of a business asset.",required=true ) @PathVariable("asset_id") String assetId,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetMembersGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetsGet200Response> businessAssetsGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")  @RequestParam(value = "permissions", required = false) List<PermissionsWithOwner> permissions,
        @ApiParam(value = "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")  @RequestParam(value = "child_asset_id", required = false) String childAssetId,
        @ApiParam(value = "An asset group unique identifier. Used to fetch assets contained within the specified asset group.")  @RequestParam(value = "asset_group_id", required = false) String assetGroupId,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessMemberAssetsGetResponse> businessMemberAssetsGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "The member id to fetch assets for.",required=true ) @PathVariable("member_id") String memberId,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "The field to sort member assets by", allowableValues = "NAME, ID, PERMISSIONS")  @RequestParam(value = "sort_by", required = false) AssetSortBy sortBy,
        @ApiParam(value = "Sort assets in ascending order", defaultValue = "true")  @RequestParam(value = "sort_ascending", required = false, defaultValue="true") Boolean sortAscending,
        @ApiParam(value = "The field to search member assets by", allowableValues = "NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER")  @RequestParam(value = "search_by", required = false) AssetSearchBy searchBy,
        @ApiParam(value = "The value to search for")  @RequestParam(value = "search_value", required = false) String searchValue,
        @ApiParam(value = "The type of asset permission to filter by", allowableValues = "AGGREGATED_PERMISSION, DIRECT_PERMISSION")  @RequestParam(value = "asset_permission_type", required = false) AssetPermissionType assetPermissionType,
        @ApiParam(value = "A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.")  @RequestParam(value = "ad_account_statuses", required = false) List<NonDraftEntityStatus> adAccountStatuses,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGetResponse>(objectMapper.readValue("", BusinessMemberAssetsGetResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessMemberAssetsGetResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteMemberAccessResultsResponseArray> businessMembersAssetAccessDelete(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteMemberAccessResultsResponseArray>(objectMapper.readValue("", DeleteMemberAccessResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteMemberAccessResultsResponseArray>(objectMapper.readValue("", DeleteMemberAccessResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteMemberAccessResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateMemberAssetsResultsResponseArray> businessMembersAssetAccessUpdate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateMemberAssetAccessBody updateMemberAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(objectMapper.readValue("", UpdateMemberAssetsResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateMemberAssetsResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessPartnerAssetAccessGet200Response> businessPartnerAssetAccessGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "The partner id to be bound to the Business",required=true ) @PathVariable("partner_id") String partnerId,
        @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", allowableValues = "INTERNAL, EXTERNAL", defaultValue = "INTERNAL")  @RequestParam(value = "partner_type", required = false, defaultValue="INTERNAL") String partnerType,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "The field to sort member assets by", allowableValues = "NAME, ID, PERMISSIONS")  @RequestParam(value = "sort_by", required = false) AssetSortBy sortBy,
        @ApiParam(value = "Sort assets in ascending order", defaultValue = "true")  @RequestParam(value = "sort_ascending", required = false, defaultValue="true") Boolean sortAscending,
        @ApiParam(value = "The field to search member assets by", allowableValues = "NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER")  @RequestParam(value = "search_by", required = false) AssetSearchBy searchBy,
        @ApiParam(value = "The value to search for")  @RequestParam(value = "search_value", required = false) String searchValue,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DeletePartnerAssetAccessResultsResponseArray> deletePartnerAssetAccessHandlerImpl(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeletePartnerAssetAccessBody deletePartnerAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnerAssetAccessResultsResponseArray>(objectMapper.readValue("", DeletePartnerAssetAccessResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnerAssetAccessResultsResponseArray>(objectMapper.readValue("", DeletePartnerAssetAccessResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeletePartnerAssetAccessResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<UpdatePartnerAssetsResultsResponseArray> updatePartnerAssetAccessHandlerImpl(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(HttpStatus.OK);
    }

}
