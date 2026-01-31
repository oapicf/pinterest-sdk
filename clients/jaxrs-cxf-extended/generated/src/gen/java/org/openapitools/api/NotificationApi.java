package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.NotificationPostRequest;
import org.openapitools.model.NotificationResponse;

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
@Path("/notifications")
@Api(value = "/", description = "")
public interface NotificationApi  {

    /**
     * Receive notifications from external partners.
     *
     * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Receive notifications from external partners.", tags={ "notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully received notification", response = NotificationResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public NotificationResponse notificationPost(@Valid NotificationPostRequest notificationPostRequest);
}
