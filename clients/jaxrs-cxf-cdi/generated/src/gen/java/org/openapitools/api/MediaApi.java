package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;
import org.openapitools.api.MediaApiService;

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
@Path("/media")
@RequestScoped

@Api(description = "the media API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class MediaApi  {

  @Context SecurityContext securityContext;

  @Inject MediaApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Register media upload", notes = "Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.", response = MediaUpload.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = MediaUpload.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response mediaCreate(@ApiParam(value = "Create a media upload request" ,required=true) MediaUploadRequest mediaUploadRequest) {
        return delegate.mediaCreate(mediaUploadRequest, securityContext);
    }

    @GET
    @Path("/{media_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get media upload details", notes = "Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.", response = MediaUploadDetails.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = MediaUploadDetails.class),
        @ApiResponse(code = 404, message = "Media upload not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response mediaGet( @Pattern(regexp="^\\d+$")@ApiParam(value = "Media identifier",required=true) @PathParam("media_id") String mediaId) {
        return delegate.mediaGet(mediaId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List media uploads", notes = "List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.", response = MediaList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = MediaList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response mediaList(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.mediaList(bookmark, pageSize, securityContext);
    }
}
