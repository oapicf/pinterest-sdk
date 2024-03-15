package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.UserAccountFollowedInterests200Response;
import org.openapitools.api.UsersApiService;

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
@Path("/users/{username}/interests/follow")
@RequestScoped

@Api(description = "the users API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class UsersApi  {

  @Context SecurityContext securityContext;

  @Inject UsersApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List following interests", notes = "Get a list of a user's following interests in one place.", response = UserAccountFollowedInterests200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UserAccountFollowedInterests200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters", response = Error.class),
        @ApiResponse(code = 401, message = "Authorization failed", response = Error.class),
        @ApiResponse(code = 404, message = "User not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response userAccountFollowedInterests( @Pattern(regexp="(?!^\\d+$)^.+$")@ApiParam(value = "A valid username",required=true) @PathParam("username") String username, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.userAccountFollowedInterests(username, bookmark, pageSize, securityContext);
    }
}
