package org.openapitools.api;

import org.openapitools.api.BoardsApiService;
import org.openapitools.api.factories.BoardsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/boards")


@io.swagger.annotations.Api(description = "the boards API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BoardsApi  {
   private final BoardsApiService delegate;

   public BoardsApi(@Context ServletConfig servletContext) {
      BoardsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BoardsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BoardsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = BoardsApiServiceFactory.getBoardsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{board_id}/sections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create board section", notes = "Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "response", response = BoardSection.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to create board sections.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Could not get exclusive access to the board to create a new section.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 500, message = "Could not create a new board section.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsCreate(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Create a board section.", required = true) @NotNull @Valid  BoardSection boardSection,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardSectionsCreate(boardId, boardSection, adAccountId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{board_id}/sections/{section_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete board section", notes = "Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Board section deleted successfully", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to delete board section.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board section not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsDelete(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of a board section.", required = true) @PathParam("section_id") @NotNull  @Pattern(regexp="^\\d+$") String sectionId,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardSectionsDelete(boardId, sectionId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{board_id}/sections")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List board sections", notes = "Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSectionsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = BoardSectionsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsList(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardSectionsList(boardId, adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{board_id}/sections/{section_id}/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Pins on board section", notes = "Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardsListPins200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access Pins on board section.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board or section not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsListPins(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of a board section.", required = true) @PathParam("section_id") @NotNull  @Pattern(regexp="^\\d+$") String sectionId,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{board_id}/sections/{section_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update board section", notes = "Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardSection.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = BoardSection.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid board section parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to update board section.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Board section conflict.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardSectionsUpdate(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of a board section.", required = true) @PathParam("section_id") @NotNull  @Pattern(regexp="^\\d+$") String sectionId,@ApiParam(value = "Update a board section.", required = true) @NotNull @Valid  BoardSection boardSection,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId, securityContext);
    }
    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create board", notes = "Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "response", response = Board.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "The board name is invalid or duplicated.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsCreate(@ApiParam(value = "Create a board using a single board json object.", required = true) @NotNull @Valid  Board board,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsCreate(board, adAccountId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{board_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete board", notes = "Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Board deleted successfully", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to delete the board.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Could not get exclusive access to delete the board.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsDelete(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsDelete(boardId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{board_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get board", notes = "Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Board.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsGet(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsGet(boardId, adAccountId, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List boards", notes = "Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.", response = BoardsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = BoardsList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsList(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "Privacy setting for a board.", allowableValues="ALL, PROTECTED, PUBLIC, SECRET, PUBLIC_AND_SECRET") @QueryParam("privacy")  String privacy,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsList(adAccountId, bookmark, pageSize, privacy, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{board_id}/pins")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Pins on board", notes = "Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = BoardsListPins200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = BoardsListPins200Response.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsListPins(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@ApiParam(value = "Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.") @QueryParam("creative_types") @Valid  List<String> creativeTypes,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false") @DefaultValue("false") @QueryParam("pin_metrics")  Boolean pinMetrics,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{board_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update board", notes = "Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.", response = Board.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards")
        })
    }, tags={ "boards", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Board.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid board parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to update the board.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response boardsUpdate(@ApiParam(value = "Unique identifier of a board.", required = true) @PathParam("board_id") @NotNull  @Pattern(regexp="^\\d+$") String boardId,@ApiParam(value = "Update a board.", required = true) @NotNull @Valid  BoardUpdate boardUpdate,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id")  @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.boardsUpdate(boardId, boardUpdate, adAccountId, securityContext);
    }
}
