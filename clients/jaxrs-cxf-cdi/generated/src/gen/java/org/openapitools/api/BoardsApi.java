package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;
import org.openapitools.api.BoardsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/boards")
@RequestScoped

@Api(description = "the boards API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class BoardsApi  {

  @Context SecurityContext securityContext;

  @Inject BoardsApiService delegate;


    @POST
    @Path("/{board_id}/sections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board section", notes = "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = BoardSection.class),
        @ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to create board sections.", response = Error.class),
        @ApiResponse(code = 409, message = "Could not get exclusive access to the board to create a new section.", response = Error.class),
        @ApiResponse(code = 500, message = "Could not create a new board section.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardSectionsCreate( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId, @ApiParam(value = "Create a board section." ,required=true) BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardSectionsCreate(boardId, boardSection, adAccountId, securityContext);
    }

    @DELETE
    @Path("/{board_id}/sections/{section_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board section", notes = "Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Board section deleted successfully", response = Void.class),
        @ApiResponse(code = 403, message = "Not authorized to delete board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardSectionsDelete( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board section.",required=true) @PathParam("section_id") String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardSectionsDelete(boardId, sectionId, adAccountId, securityContext);
    }

    @GET
    @Path("/{board_id}/sections")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List board sections", notes = "Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSectionsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardSectionsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardSectionsList( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.boardSectionsList(boardId, adAccountId, bookmark, pageSize, securityContext);
    }

    @GET
    @Path("/{board_id}/sections/{section_id}/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board section", notes = "Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardsListPins200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @ApiResponse(code = 403, message = "Not authorized to access Pins on board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardSectionsListPins( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board section.",required=true) @PathParam("section_id") String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize, securityContext);
    }

    @PATCH
    @Path("/{board_id}/sections/{section_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board section", notes = "Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardSection.class),
        @ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update board section.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardSectionsUpdate( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board section.",required=true) @PathParam("section_id") String sectionId, @ApiParam(value = "Update a board section." ,required=true) BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board", notes = "Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "The board name is invalid or duplicated.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsCreate(@ApiParam(value = "Create a board using a single board json object." ,required=true) Board board,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardsCreate(board, adAccountId, securityContext);
    }

    @DELETE
    @Path("/{board_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board", notes = "Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Board deleted successfully", response = Void.class),
        @ApiResponse(code = 403, message = "Not authorized to delete the board.", response = Error.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Could not get exclusive access to delete the board.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsDelete( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardsDelete(boardId, adAccountId, securityContext);
    }

    @GET
    @Path("/{board_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get board", notes = "Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsGet( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardsGet(boardId, adAccountId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List boards", notes = "Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.", response = BoardsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsList( @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Privacy setting for a board.", allowableValues="ALL, PROTECTED, PUBLIC, SECRET, PUBLIC_AND_SECRET")  @QueryParam("privacy") String privacy) {
        return delegate.boardsList(adAccountId, bookmark, pageSize, privacy, securityContext);
    }

    @GET
    @Path("/{board_id}/pins")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board", notes = "Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardsListPins200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsListPins( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize, @ApiParam(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")  @QueryParam("creative_types") List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId, @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue="false") @DefaultValue("false")  @QueryParam("pin_metrics") Boolean pinMetrics) {
        return delegate.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, securityContext);
    }

    @PATCH
    @Path("/{board_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board", notes = "Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "Invalid board parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update the board.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response boardsUpdate( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a board.",required=true) @PathParam("board_id") String boardId, @ApiParam(value = "Update a board." ,required=true) BoardUpdate boardUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.boardsUpdate(boardId, boardUpdate, adAccountId, securityContext);
    }
}
