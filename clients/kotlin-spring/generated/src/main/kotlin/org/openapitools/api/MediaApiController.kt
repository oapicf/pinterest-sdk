package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.MediaList200Response
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadDetails
import org.openapitools.model.MediaUploadRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class MediaApiController() {

    @Operation(
        summary = "Register media upload",
        operationId = "mediaCreate",
        description = """Register your intent to upload media

The response includes all of the information needed to upload the media
to Pinterest.

To upload the media, make an HTTP POST request (using <tt>curl</tt>, for
example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header
value. Send the media file's contents as the request's <tt>file</tt>
parameter and also include all of the parameters from
<tt>upload_parameters</tt>.

<strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.""",
        responses = [
            ApiResponse(responseCode = "201", description = "response", content = [Content(schema = Schema(implementation = MediaUpload::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read", "pins:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/media"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun mediaCreate(@Parameter(description = "Create a media upload request", required = true) @Valid @RequestBody mediaUploadRequest: MediaUploadRequest): ResponseEntity<MediaUpload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get media upload details",
        operationId = "mediaGet",
        description = """Get details for a registered media upload, including its current status.

<strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = MediaUploadDetails::class))]),
            ApiResponse(responseCode = "404", description = "Media upload not found", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/media/{media_id}"],
        produces = ["application/json"]
    )
    fun mediaGet(@Pattern(regexp="^\\d+$") @Parameter(description = "Media identifier", required = true) @PathVariable("media_id") mediaId: kotlin.String): ResponseEntity<MediaUploadDetails> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List media uploads",
        operationId = "mediaList",
        description = """List media uploads filtered by given parameters.

<strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = MediaList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/media"],
        produces = ["application/json"]
    )
    fun mediaList(@Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,@Min(1) @Max(250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int): ResponseEntity<MediaList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
