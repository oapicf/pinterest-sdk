package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/boards")
@Api(value = "/", description = "")
public interface BoardsApi  {

    /**
     * Create board section
     *
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @POST
    @Path("/{board_id}/sections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board section", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = BoardSection.class),
        @ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to create board sections.", response = Error.class),
        @ApiResponse(code = 409, message = "Could not get exclusive access to the board to create a new section.", response = Error.class),
        @ApiResponse(code = 500, message = "Could not create a new board section.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardSection boardSectionsCreate(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @Valid BoardSection boardSection, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @DELETE
    @Path("/{board_id}/sections/{section_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board section", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Board section deleted successfully"),
        @ApiResponse(code = 403, message = "Not authorized to delete board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void boardSectionsDelete(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @PathParam("section_id") @Pattern(regexp="^\\d+$") String sectionId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @GET
    @Path("/{board_id}/sections")
    @Produces({ "application/json" })
    @ApiOperation(value = "List board sections", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardSectionsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardSectionsList200Response boardSectionsList(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @GET
    @Path("/{board_id}/sections/{section_id}/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board section", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @ApiResponse(code = 403, message = "Not authorized to access Pins on board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardsListPins200Response boardSectionsListPins(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @PathParam("section_id") @Pattern(regexp="^\\d+$") String sectionId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @PATCH
    @Path("/{board_id}/sections/{section_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board section", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardSection.class),
        @ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update board section.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardSection boardSectionsUpdate(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @PathParam("section_id") @Pattern(regexp="^\\d+$") String sectionId, @Valid BoardSection boardSection, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "The board name is invalid or duplicated.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Board boardsCreate(@Valid Board board, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @DELETE
    @Path("/{board_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Board deleted successfully"),
        @ApiResponse(code = 403, message = "Not authorized to delete the board.", response = Error.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Could not get exclusive access to delete the board.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void boardsDelete(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @GET
    @Path("/{board_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get board", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Board boardsGet(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);

    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List boards", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardsList200Response boardsList(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("privacy") String privacy);

    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @GET
    @Path("/{board_id}/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BoardsListPins200Response boardsListPins(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("creative_types") List<String> creativeTypes, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("pin_metrics") @DefaultValue("false") Boolean pinMetrics);

    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @PATCH
    @Path("/{board_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board", tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "Invalid board parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update the board.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Board boardsUpdate(@PathParam("board_id") @Pattern(regexp="^\\d+$") String boardId, @Valid BoardUpdate boardUpdate, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);
}
