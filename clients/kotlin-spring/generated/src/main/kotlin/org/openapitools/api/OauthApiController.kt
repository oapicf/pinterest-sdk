package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.OauthAccessTokenResponse
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
class OauthApiController() {


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/oauth/token"],
        produces = ["application/json"],
        consumes = ["application/x-www-form-urlencoded"]
    )
    fun oauthToken( @RequestParam(value="grant_type", required=true) grantType: kotlin.String 
): ResponseEntity<OauthAccessTokenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
