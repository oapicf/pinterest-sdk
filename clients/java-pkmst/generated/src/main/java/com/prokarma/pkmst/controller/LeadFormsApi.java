/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.LeadFormResponse;
import com.prokarma.pkmst.model.LeadFormTestRequest;
import com.prokarma.pkmst.model.LeadFormTestResponse;
import com.prokarma.pkmst.model.LeadFormsList200Response;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Api(value = "LeadForms", description = "the LeadForms API")
public interface LeadFormsApi {

    @ApiOperation(value = "Get lead form by id", notes = "Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "The lead form ID for the given ad account ID does not exist.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}",
        produces = { "application/json" }
    )
    ResponseEntity<LeadFormResponse> leadFormGet(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,@ApiParam(value = "Unique identifier of a lead form.",required=true ) @PathVariable("lead_form_id") String leadFormId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Create lead form test data", notes = "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = LeadFormTestResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormTestResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Lead not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<LeadFormTestResponse> leadFormTestCreate(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,@ApiParam(value = "Unique identifier of a lead form.",required=true ) @PathVariable("lead_form_id") String leadFormId,@ApiParam(value = "Subscription to create." ,required=true )   @RequestBody LeadFormTestRequest leadFormTestRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get lead forms", notes = "Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = LeadFormsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "lead_forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadFormsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account lead forms parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ad_accounts/{ad_account_id}/lead_forms",
        produces = { "application/json" }
    )
    ResponseEntity<LeadFormsList200Response> leadFormsList(@ApiParam(value = "Unique identifier of an ad account.",required=true ) @PathVariable("ad_account_id") String adAccountId,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,@ApiParam(value = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", allowableValues = "ASCENDING, DESCENDING")  @RequestParam(value = "order", required = false) String order,@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}