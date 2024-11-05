package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BusinessAssetMembersGet200Response;
import com.prokarma.pkmst.model.BusinessAssetPartnersGet200Response;
import com.prokarma.pkmst.model.BusinessAssetsGet200Response;
import com.prokarma.pkmst.model.BusinessMemberAssetsGet200Response;
import com.prokarma.pkmst.model.BusinessMembersAssetAccessDeleteRequest;
import com.prokarma.pkmst.model.BusinessPartnerAssetAccessGet200Response;
import com.prokarma.pkmst.model.CreateAssetGroupBody;
import com.prokarma.pkmst.model.CreateAssetGroupResponse;
import com.prokarma.pkmst.model.DeleteAssetGroupBody;
import com.prokarma.pkmst.model.DeleteAssetGroupResponse;
import com.prokarma.pkmst.model.DeleteMemberAccessResultsResponseArray;
import com.prokarma.pkmst.model.DeletePartnerAssetAccessBody;
import com.prokarma.pkmst.model.DeletePartnerAssetsResultsResponseArray;
import com.prokarma.pkmst.model.Error;
import java.util.List;
import com.prokarma.pkmst.model.PartnerType;
import com.prokarma.pkmst.model.PermissionsWithOwner;
import com.prokarma.pkmst.model.UpdateAssetGroupBody;
import com.prokarma.pkmst.model.UpdateAssetGroupResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class BusinessAccessAssetsApiController implements BusinessAccessAssetsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessAccessAssetsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CreateAssetGroupResponse> assetGroupCreate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateAssetGroupBody createAssetGroupBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateAssetGroupResponse>(objectMapper.readValue("", CreateAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateAssetGroupResponse>(objectMapper.readValue("", CreateAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateAssetGroupResponse>(objectMapper.readValue("", CreateAssetGroupResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateAssetGroupResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteAssetGroupResponse> assetGroupDelete(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteAssetGroupBody deleteAssetGroupBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteAssetGroupResponse>(objectMapper.readValue("", DeleteAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteAssetGroupResponse>(objectMapper.readValue("", DeleteAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteAssetGroupResponse>(objectMapper.readValue("", DeleteAssetGroupResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteAssetGroupResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateAssetGroupResponse> assetGroupUpdate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateAssetGroupBody updateAssetGroupBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateAssetGroupResponse>(objectMapper.readValue("", UpdateAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateAssetGroupResponse>(objectMapper.readValue("", UpdateAssetGroupResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateAssetGroupResponse>(objectMapper.readValue("", UpdateAssetGroupResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateAssetGroupResponse>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetMembersGet200Response> businessAssetMembersGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of a business asset.",required=true ) @PathVariable("asset_id") String assetId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetMembersGet200Response>(objectMapper.readValue("", BusinessAssetMembersGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetMembersGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetPartnersGet200Response> businessAssetPartnersGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of a business asset.",required=true ) @PathVariable("asset_id") String assetId,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetPartnersGet200Response>(objectMapper.readValue("", BusinessAssetPartnersGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetPartnersGet200Response>(objectMapper.readValue("", BusinessAssetPartnersGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetPartnersGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessAssetsGet200Response> businessAssetsGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")  @RequestParam(value = "permissions", required = false) List<PermissionsWithOwner> permissions,
        @ApiParam(value = "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")  @RequestParam(value = "child_asset_id", required = false) String childAssetId,
        @ApiParam(value = "An asset group unique identifier. Used to fetch assets contained within the specified asset group.")  @RequestParam(value = "asset_group_id", required = false) String assetGroupId,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessAssetsGet200Response>(objectMapper.readValue("", BusinessAssetsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessAssetsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BusinessMemberAssetsGet200Response> businessMemberAssetsGet(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "The member id to fetch assets for.",required=true ) @PathVariable("member_id") String memberId,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGet200Response>(objectMapper.readValue("", BusinessMemberAssetsGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessMemberAssetsGet200Response>(objectMapper.readValue("", BusinessMemberAssetsGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessMemberAssetsGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteMemberAccessResultsResponseArray> businessMembersAssetAccessDelete(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "List member assset permissions to delete." ,required=true )   @RequestBody BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest,
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
        @ApiParam(value = "List of member asset permissions to create or update." ,required=true )   @RequestBody UpdateMemberAssetAccessBody updateMemberAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

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
        @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")  @RequestParam(value = "partner_type", required = false) PartnerType partnerType,
        @ApiParam(value = "A resource type to filter the assets by. Only assets of the specified type will be returned.", allowableValues = "AD_ACCOUNT, PROFILE, ASSET_GROUP", defaultValue = "AD_ACCOUNT")  @RequestParam(value = "asset_type", required = false, defaultValue="AD_ACCOUNT") String assetType,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(objectMapper.readValue("", BusinessPartnerAssetAccessGet200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BusinessPartnerAssetAccessGet200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DeletePartnerAssetsResultsResponseArray> deletePartnerAssetAccessHandlerImpl(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeletePartnerAssetAccessBody deletePartnerAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnerAssetsResultsResponseArray>(objectMapper.readValue("", DeletePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnerAssetsResultsResponseArray>(objectMapper.readValue("", DeletePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeletePartnerAssetsResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<UpdatePartnerAssetsResultsResponseArray> updatePartnerAssetAccessHandlerImpl(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A list of assets and permissions to assign to your partners." ,required=true )   @RequestBody UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(objectMapper.readValue("", UpdatePartnerAssetsResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdatePartnerAssetsResultsResponseArray>(HttpStatus.OK);
    }

}
