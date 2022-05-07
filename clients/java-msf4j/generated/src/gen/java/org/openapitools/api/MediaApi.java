package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MediaApiService;
import org.openapitools.api.factories.MediaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;
import org.openapitools.model.Paginated;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/media")


@io.swagger.annotations.Api(description = "the media API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class MediaApi  {
   private final MediaApiService delegate = MediaApiServiceFactory.getMediaApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Register media upload", notes = "Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = MediaUpload.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins")
        })
    }, tags={ "media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "response", response = MediaUpload.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MediaUpload.class) })
    public Response mediaCreate(@ApiParam(value = "Create a media upload request" ,required=true) MediaUploadRequest mediaUploadRequest
)
    throws NotFoundException {
        return delegate.mediaCreate(mediaUploadRequest);
    }
    @GET
    @Path("/{media_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get media upload details", notes = "Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = MediaUploadDetails.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = MediaUploadDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Media upload not found", response = MediaUploadDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MediaUploadDetails.class) })
    public Response mediaGet(@ApiParam(value = "Media identifier",required=true) @PathParam("media_id") String mediaId
)
    throws NotFoundException {
        return delegate.mediaGet(mediaId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List media uploads", notes = "List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Paginated.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Paginated.class) })
    public Response mediaList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.mediaList(bookmark,pageSize);
    }
}
