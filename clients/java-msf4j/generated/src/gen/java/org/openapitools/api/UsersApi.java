package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;
import org.openapitools.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.UserAccountFollowedInterests200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/users/{username}/interests/follow")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List following interests", notes = "Get a list of a user's following interests in one place.", response = UserAccountFollowedInterests200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = UserAccountFollowedInterests200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters", response = UserAccountFollowedInterests200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authorization failed", response = UserAccountFollowedInterests200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = UserAccountFollowedInterests200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = UserAccountFollowedInterests200Response.class) })
    public Response userAccountFollowedInterests(@ApiParam(value = "A valid username",required=true) @PathParam("username") String username
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.userAccountFollowedInterests(username,bookmark,pageSize);
    }
}
