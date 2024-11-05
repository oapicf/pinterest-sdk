package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;

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
@Path("/media")
@Api(value = "/", description = "")
public interface MediaApi  {

    /**
     * Register media upload
     *
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Register media upload", tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "response", response = MediaUpload.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public MediaUpload mediaCreate(@Valid MediaUploadRequest mediaUploadRequest);

    /**
     * Get media upload details
     *
     * Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     */
    @GET
    @Path("/{media_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get media upload details", tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = MediaUploadDetails.class),
        @ApiResponse(code = 404, message = "Media upload not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public MediaUploadDetails mediaGet(@PathParam("media_id") @Pattern(regexp="^\\d+$") String mediaId);

    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List media uploads", tags={ "media" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = MediaList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public MediaList200Response mediaList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);
}
