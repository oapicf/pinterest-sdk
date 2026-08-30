package org.openapitools.api;

import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;
import org.openapitools.model.PinterestLibError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/notifications")
@Api(description = "the notifications API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Receive notifications from external partners.", notes = "Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.", response = NotificationResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") }),
        @Authorization(value = "client_credentials", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = NotificationResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response notificationPost(@Valid NotificationPostRequest notificationPostRequest) {
        return Response.ok().entity("magic!").build();
    }
}
