package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.NotificationPostRequest
import org.openapitools.model.NotificationResponse
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
import org.openapitools.api.NotificationsApiController.Companion.BASE_PATH

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
@RequestMapping("\${openapi.pinterestREST.base-path:\${api.base-path:$BASE_PATH}}")
class NotificationsApiController() {

    @Operation(
        summary = "Receive notifications from external partners.",
        operationId = "notificationPost",
        description = """Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successfully received notification", content = [Content(schema = Schema(implementation = NotificationResponse::class))]),
            ApiResponse(responseCode = "400", description = "Invalid request parameter.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "user_accounts:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "user_accounts:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_NOTIFICATION_POST /* "/notifications" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun notificationPost(
        @Parameter(description = "notification event.", required = true) @Valid @RequestBody notificationPostRequest: NotificationPostRequest
    ): ResponseEntity<NotificationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_NOTIFICATION_POST: String = "/notifications"
    }
}
