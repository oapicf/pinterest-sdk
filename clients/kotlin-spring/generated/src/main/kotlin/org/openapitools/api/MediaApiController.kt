package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadDetails
import org.openapitools.model.MediaUploadRequest
import org.openapitools.model.Paginated
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


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/media"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun mediaCreate( @Valid @RequestBody mediaUploadRequest: MediaUploadRequest
): ResponseEntity<MediaUpload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/media/{media_id}"],
        produces = ["application/json"]
    )
    fun mediaGet(@Pattern(regexp="^\\d+$")  @PathVariable("media_id") mediaId: kotlin.String
): ResponseEntity<MediaUploadDetails> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/media"],
        produces = ["application/json"]
    )
    fun mediaList( @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
