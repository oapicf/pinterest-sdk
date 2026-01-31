package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
        @ApiResponse(code = 200, message = "Successfully received notification", response = NotificationResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response notificationPost(@Valid @NotNull NotificationPostRequest notificationPostRequest) {
        return Response.ok().entity("magic!").build();
    }
}
