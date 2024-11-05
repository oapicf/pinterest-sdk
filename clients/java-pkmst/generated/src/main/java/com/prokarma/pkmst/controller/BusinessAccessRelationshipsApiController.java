package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.DeletePartnersRequest;
import com.prokarma.pkmst.model.DeletePartnersResponse;
import com.prokarma.pkmst.model.DeletedMembersResponse;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.GetBusinessEmployers200Response;
import com.prokarma.pkmst.model.GetBusinessMembers200Response;
import com.prokarma.pkmst.model.GetBusinessPartners200Response;
import java.util.List;
import com.prokarma.pkmst.model.MemberBusinessRole;
import com.prokarma.pkmst.model.MembersToDeleteBody;
import com.prokarma.pkmst.model.PartnerType;
import com.prokarma.pkmst.model.UpdateMemberBusinessRoleBody;
import com.prokarma.pkmst.model.UpdateMemberResultsResponseArray;

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
public class BusinessAccessRelationshipsApiController implements BusinessAccessRelationshipsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessAccessRelationshipsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<DeletedMembersResponse> deleteBusinessMembership(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "List of members with role to delete." ,required=true )   @RequestBody MembersToDeleteBody membersToDeleteBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletedMembersResponse>(objectMapper.readValue("", DeletedMembersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletedMembersResponse>(objectMapper.readValue("", DeletedMembersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeletedMembersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeletePartnersResponse> deleteBusinessPartners(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. " ,required=true )   @RequestBody DeletePartnersRequest deletePartnersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnersResponse>(objectMapper.readValue("", DeletePartnersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnersResponse>(objectMapper.readValue("", DeletePartnersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePartnersResponse>(objectMapper.readValue("", DeletePartnersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeletePartnersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessEmployers200Response> getBusinessEmployers(@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessEmployers200Response>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessMembers200Response> getBusinessMembers(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue = "false")  @RequestParam(value = "assets_summary", required = false, defaultValue="false") Boolean assetsSummary,
        @ApiParam(value = "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")  @RequestParam(value = "business_roles", required = false) List<MemberBusinessRole> businessRoles,
        @ApiParam(value = "A list of business members ids separated by comma.")  @RequestParam(value = "member_ids", required = false) String memberIds,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessMembers200Response>(objectMapper.readValue("", GetBusinessMembers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessMembers200Response>(objectMapper.readValue("", GetBusinessMembers200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessMembers200Response>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessPartners200Response> getBusinessPartners(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue = "false")  @RequestParam(value = "assets_summary", required = false, defaultValue="false") Boolean assetsSummary,
        @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", allowableValues = "INTERNAL, EXTERNAL")  @RequestParam(value = "partner_type", required = false) PartnerType partnerType,
        @ApiParam(value = "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")  @RequestParam(value = "partner_ids", required = false) String partnerIds,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessPartners200Response>(objectMapper.readValue("", GetBusinessPartners200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessPartners200Response>(objectMapper.readValue("", GetBusinessPartners200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessPartners200Response>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateMemberResultsResponseArray> updateBusinessMemberships(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "List of objects with the member id and the business_role." ,required=true )   @RequestBody List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberResultsResponseArray>(objectMapper.readValue("", UpdateMemberResultsResponseArray.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateMemberResultsResponseArray>(objectMapper.readValue("", UpdateMemberResultsResponseArray.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateMemberResultsResponseArray>(HttpStatus.OK);
    }

}
