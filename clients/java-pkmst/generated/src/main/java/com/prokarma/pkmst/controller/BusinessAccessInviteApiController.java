package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AuthRespondInvitesBody;
import com.prokarma.pkmst.model.CancelInvitesBody;
import com.prokarma.pkmst.model.CreateAssetAccessRequestBody;
import com.prokarma.pkmst.model.CreateAssetAccessRequestResponse;
import com.prokarma.pkmst.model.CreateAssetInvitesRequest;
import com.prokarma.pkmst.model.CreateInvitesResultsResponseArray;
import com.prokarma.pkmst.model.CreateMembershipOrPartnershipInvitesBody;
import com.prokarma.pkmst.model.DeleteInvitesResultsResponseArray;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.GetInvites200Response;
import com.prokarma.pkmst.model.InviteType;
import java.util.List;
import com.prokarma.pkmst.model.RespondToInvitesResponseArray;
import com.prokarma.pkmst.model.UpdateInvitesResultsResponseArray;

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
public class BusinessAccessInviteApiController implements BusinessAccessInviteApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessAccessInviteApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<CreateAssetAccessRequestResponse> assetAccessRequestsCreate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateAssetAccessRequestBody createAssetAccessRequestBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateAssetAccessRequestResponse>(objectMapper.readValue("", CreateAssetAccessRequestResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateAssetAccessRequestResponse>(objectMapper.readValue("", CreateAssetAccessRequestResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateAssetAccessRequestResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteInvitesResultsResponseArray> cancelInvitesOrRequests(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A list with invite ids" ,required=true )   @RequestBody CancelInvitesBody cancelInvitesBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteInvitesResultsResponseArray>(objectMapper.readValue("", DeleteInvitesResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteInvitesResultsResponseArray>(objectMapper.readValue("", DeleteInvitesResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteInvitesResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateInvitesResultsResponseArray> createAssetInvites(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A list of invites/requests together with the asset permissions to be assigned to the invite/request. " ,required=true )   @RequestBody CreateAssetInvitesRequest createAssetInvitesRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateInvitesResultsResponseArray>(objectMapper.readValue("", UpdateInvitesResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateInvitesResultsResponseArray>(objectMapper.readValue("", UpdateInvitesResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateInvitesResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<CreateInvitesResultsResponseArray> createMembershipOrPartnershipInvites(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "An object with the properties: invite_type, partners, members, business_role" ,required=true )   @RequestBody CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateInvitesResultsResponseArray>(objectMapper.readValue("", CreateInvitesResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateInvitesResultsResponseArray>(objectMapper.readValue("", CreateInvitesResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateInvitesResultsResponseArray>(HttpStatus.OK);
    }

    public ResponseEntity<GetInvites200Response> getInvites(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "A boolean field to indicate whether the invite is to create a partnership or a membership.", defaultValue = "true")  @RequestParam(value = "is_member", required = false, defaultValue="true") Boolean isMember,
        @ApiParam(value = "A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.", allowableValues = "PENDING, EXPIRED")  @RequestParam(value = "invite_status", required = false) List<String> inviteStatus,
        @ApiParam(value = "Invite type to filter invites by. Only invites of the specified type will be returned.", allowableValues = "MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST")  @RequestParam(value = "invite_type", required = false) InviteType inviteType,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetInvites200Response>(objectMapper.readValue("", GetInvites200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetInvites200Response>(objectMapper.readValue("", GetInvites200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetInvites200Response>(HttpStatus.OK);
    }

    public ResponseEntity<RespondToInvitesResponseArray> respondBusinessAccessInvites(@ApiParam(value = "" ,required=true )   @RequestBody AuthRespondInvitesBody authRespondInvitesBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RespondToInvitesResponseArray>(objectMapper.readValue("", RespondToInvitesResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RespondToInvitesResponseArray>(objectMapper.readValue("", RespondToInvitesResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<RespondToInvitesResponseArray>(HttpStatus.OK);
    }

}
