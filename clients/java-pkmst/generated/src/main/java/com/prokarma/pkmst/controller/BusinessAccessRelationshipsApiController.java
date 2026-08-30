package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BrandAccount;
import com.prokarma.pkmst.model.BrandAccountCreate;
import com.prokarma.pkmst.model.BrandAccountUpdate;
import com.prokarma.pkmst.model.BusinessMembershipMember;
import com.prokarma.pkmst.model.DeleteBusinessMembership200Response;
import com.prokarma.pkmst.model.DeleteBusinessMembershipBody;
import com.prokarma.pkmst.model.DeleteBusinessPartners;
import com.prokarma.pkmst.model.DeleteBusinessPartnersDelete;
import com.prokarma.pkmst.model.GetBusinessEmployers200Response;
import java.util.List;
import com.prokarma.pkmst.model.MemberBusinessRole;
import com.prokarma.pkmst.model.PartnerType;
import com.prokarma.pkmst.model.PinterestLibError;
import com.prokarma.pkmst.model.SystemUserUpdateWithRequiredBody;
import com.prokarma.pkmst.model.UpdateBusinessMembershipsResponse;

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
public class BusinessAccessRelationshipsApiController implements BusinessAccessRelationshipsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessAccessRelationshipsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BrandAccount> brandAccountsCreate(@ApiParam(value = "business hierarchy node id",required=true ) @PathVariable("business_hierarchy_id") String businessHierarchyId,
        @ApiParam(value = "" ,required=true )   @RequestBody BrandAccountCreate brandAccountCreate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }

        return new ResponseEntity<BrandAccount>(HttpStatus.OK);
    }

    public ResponseEntity<BrandAccount> brandAccountsUpdate(@ApiParam(value = "",required=true ) @PathVariable("brand_account_id") String brandAccountId,
        @ApiParam(value = "business hierarchy node id",required=true ) @PathVariable("business_hierarchy_id") String businessHierarchyId,
        @ApiParam(value = "" ,required=true )   @RequestBody BrandAccountUpdate brandAccountUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BrandAccount>(objectMapper.readValue("", BrandAccount.class), HttpStatus.OK);
        }

        return new ResponseEntity<BrandAccount>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteBusinessMembership200Response> deleteBusinessMembership(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteBusinessMembershipBody deleteBusinessMembershipBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteBusinessMembership200Response>(objectMapper.readValue("", DeleteBusinessMembership200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteBusinessMembership200Response>(objectMapper.readValue("", DeleteBusinessMembership200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteBusinessMembership200Response>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteBusinessPartners> deleteBusinessPartners(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteBusinessPartnersDelete deleteBusinessPartnersDelete,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteBusinessPartners>(objectMapper.readValue("", DeleteBusinessPartners.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteBusinessPartners>(objectMapper.readValue("", DeleteBusinessPartners.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteBusinessPartners>(objectMapper.readValue("", DeleteBusinessPartners.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteBusinessPartners>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessEmployers200Response> getBusinessEmployers(@ApiParam(value = "Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue = "true")  @RequestParam(value = "assets_summary", required = false, defaultValue="true") Boolean assetsSummary,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessEmployers200Response>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessEmployers200Response> getBusinessMembers(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Fetches system users if True. Fetches regular user employees if False.", defaultValue = "false")  @RequestParam(value = "fetch_system_users", required = false, defaultValue="false") Boolean fetchSystemUsers,
        @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue = "false")  @RequestParam(value = "assets_summary", required = false, defaultValue="false") Boolean assetsSummary,
        @ApiParam(value = "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.")  @RequestParam(value = "business_roles", required = false) List<MemberBusinessRole> businessRoles,
        @ApiParam(value = "A list of business members ids separated by comma.")  @RequestParam(value = "member_ids", required = false) String memberIds,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessEmployers200Response>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessEmployers200Response> getBusinessPartners(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are", defaultValue = "false")  @RequestParam(value = "assets_summary", required = false, defaultValue="false") Boolean assetsSummary,
        @ApiParam(value = "Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.", allowableValues = "INTERNAL, EXTERNAL")  @RequestParam(value = "partner_type", required = false) PartnerType partnerType,
        @ApiParam(value = "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.")  @RequestParam(value = "partner_ids", required = false) String partnerIds,
        @ApiParam(value = "An index to start fetching the results from. Only the results starting from this index will be returned.", defaultValue = "0")  @RequestParam(value = "start_index", required = false, defaultValue="0") Integer startIndex,
        @ApiParam(value = "Sort ascending.")  @RequestParam(value = "sort_ascending", required = false) Boolean sortAscending,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessEmployers200Response>(objectMapper.readValue("", GetBusinessEmployers200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessEmployers200Response>(HttpStatus.OK);
    }

    public ResponseEntity<Void> systemUserUpdate(@ApiParam(value = "Unique identifier of the requesting business.",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "Unique identifier of a system user.",required=true ) @PathVariable("system_user_id") String systemUserId,
        @ApiParam(value = "" ,required=true )   @RequestBody SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateBusinessMembershipsResponse> updateBusinessMemberships(@ApiParam(value = "Business id",required=true ) @PathVariable("business_id") String businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody List<BusinessMembershipMember> businessMembershipMember,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateBusinessMembershipsResponse>(objectMapper.readValue("", UpdateBusinessMembershipsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateBusinessMembershipsResponse>(HttpStatus.OK);
    }

}
