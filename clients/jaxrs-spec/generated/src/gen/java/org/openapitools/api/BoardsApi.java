package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/boards")
@Api(description = "the boards API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class BoardsApi {

    @POST
    @Path("/{board_id}/sections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board section", notes = "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsCreate(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@Valid @NotNull BoardSection boardSection) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{board_id}/sections/{section_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board section", notes = "Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Board section deleted successfully", response = Void.class),
        @ApiResponse(code = 403, message = "Not authorized to delete board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsDelete(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@PathParam("section_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board section.") String sectionId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{board_id}/sections")
    @Produces({ "application/json" })
    @ApiOperation(value = "List board sections", notes = "Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsList(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{board_id}/sections/{section_id}/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board section", notes = "Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 403, message = "Not authorized to access Pins on board section.", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsListPins(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@PathParam("section_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board section.") String sectionId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{board_id}/sections/{section_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board section", notes = "Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = BoardSection.class),
        @ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update board section.", response = Error.class),
        @ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsUpdate(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@PathParam("section_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board section.") String sectionId,@Valid @NotNull BoardSection boardSection) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create board", notes = "Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "The board name is invalid or duplicated.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsCreate(@Valid @NotNull Board board) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{board_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete board", notes = "Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsDelete(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{board_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get board", notes = "Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsGet(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List boards", notes = "Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("privacy")  @ApiParam("Privacy setting for a board.")  String privacy) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{board_id}/pins")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins on board", notes = "Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Paginated.class),
        @ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsListPins(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{board_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update board", notes = "Update a board owned by the \"operating user_account\".", response = Board.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards") })
         }, tags={ "boards" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Board.class),
        @ApiResponse(code = 400, message = "Invalid board parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update the board.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsUpdate(@PathParam("board_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a board.") String boardId,@Valid @NotNull BoardUpdate boardUpdate) {
        return Response.ok().entity("magic!").build();
    }
}
