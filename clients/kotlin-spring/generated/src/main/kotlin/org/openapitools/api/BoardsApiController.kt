package org.openapitools.api

import org.openapitools.model.Board
import org.openapitools.model.BoardCreate
import org.openapitools.model.BoardPrivacyFilter
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardSectionsList200Response
import org.openapitools.model.BoardWithUpdatePrivacy
import org.openapitools.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.BoardsListPins200Response
import org.openapitools.model.CreativeType
import org.openapitools.model.Error
import org.openapitools.model.PinterestLibError
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
import org.openapitools.api.BoardsApiController.Companion.BASE_PATH

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
class BoardsApiController() {

    @Operation(
        summary = "Create board section",
        operationId = "boardSectionsCreate",
        description = """Create a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "201", description = "response", content = [Content(schema = Schema(implementation = BoardSection::class))]),
            ApiResponse(responseCode = "400", description = "Invalid board section parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to create board sections.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Could not get exclusive access to the board to create a new section.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "500", description = "Could not create a new board section.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_BOARD_SECTIONS_CREATE /* "/boards/{board_id}/sections" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardSectionsCreate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Parameter(description = "Create a board section.", required = true) @Valid @RequestBody boardSection: BoardSection,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<BoardSection> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete board section",
        operationId = "boardSectionsDelete",
        description = """Delete a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Board section deleted successfully"),
            ApiResponse(responseCode = "403", description = "Not authorized to delete board section.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Board section not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Board section conflict.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_BOARD_SECTIONS_DELETE /* "/boards/{board_id}/sections/{section_id}" */],
        produces = ["application/json"]
    )
    fun boardSectionsDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board section.", required = true) @PathVariable("section_id") sectionId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List board sections",
        operationId = "boardSectionsList",
        description = """Get a list of all board sections from a board owned by the "operation user_account" - or a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = BoardSectionsList200Response::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BOARD_SECTIONS_LIST /* "/boards/{board_id}/sections" */],
        produces = ["application/json"]
    )
    fun boardSectionsList(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<BoardSectionsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Pins on board section",
        operationId = "boardSectionsListPins",
        description = """Get a list of the Pins on a board section of a board owned by the "operation user_account" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = BoardsListPins200Response::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to access Pins on board section.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "404", description = "Board or section not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Board section conflict.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BOARD_SECTIONS_LIST_PINS /* "/boards/{board_id}/sections/{section_id}/pins" */],
        produces = ["application/json"]
    )
    fun boardSectionsListPins(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board section.", required = true) @PathVariable("section_id") sectionId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<BoardsListPins200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update board section",
        operationId = "boardSectionsUpdate",
        description = """Update a board section on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = BoardSection::class))]),
            ApiResponse(responseCode = "400", description = "Invalid board section parameters.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "403", description = "Not authorized to update board section.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "409", description = "Board section conflict.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = [PATH_BOARD_SECTIONS_UPDATE /* "/boards/{board_id}/sections/{section_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardSectionsUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board section.", required = true) @PathVariable("section_id") sectionId: kotlin.String,
        @Parameter(description = "Update a board section.", required = true) @Valid @RequestBody boardSection: BoardSection,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<BoardSection> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create board",
        operationId = "boardsCreate",
        description = """Create a board owned by the "operation user_account".
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
* By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Board::class))]),
            ApiResponse(responseCode = "201", description = "Resource create operation completed successfully.", content = [Content(schema = Schema(implementation = Board::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "200", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_BOARDS_CREATE /* "/boards" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardsCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody boardCreate: BoardCreate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Board> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete board",
        operationId = "boardsDelete",
        description = """Delete a board owned by the "operation user_account".
* Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
* By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "204", description = "Resource deleted successfully."),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "200", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_BOARDS_DELETE /* "/boards/{board_id}" */],
        produces = ["application/json"]
    )
    fun boardsDelete(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get board",
        operationId = "boardsGet",
        description = """Get a board owned by the operation user_account - or a group board that has been shared with this account.
* Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
* By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = Board::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "200", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BOARDS_GET /* "/boards/{board_id}" */],
        produces = ["application/json"]
    )
    fun boardsGet(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<Board> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List boards",
        operationId = "boardsList",
        description = """Get a list of the boards owned by the "operation user_account" + group boards where this account is a collaborator
Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
* If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BoardsList200Response::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "200", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BOARDS_LIST /* "/boards" */],
        produces = ["application/json"]
    )
    fun boardsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "The privacy level of the board", schema = Schema(allowableValues = ["ALL", "PUBLIC", "PROTECTED", "SECRET", "PUBLIC_AND_SECRET"])) @Valid @RequestParam(value = "privacy", required = false) privacy: BoardPrivacyFilter?,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int
    ): ResponseEntity<BoardsList200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Pins on board",
        operationId = "boardsListPins",
        description = """Get a list of the Pins on a board owned by the "operation user_account" - or on a group board that has been shared with this account.
- Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
- By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "response", content = [Content(schema = Schema(implementation = BoardsListPins200Response::class))]),
            ApiResponse(responseCode = "404", description = "Board not found.", content = [Content(schema = Schema(implementation = Error::class))]),
            ApiResponse(responseCode = "200", description = "Unexpected error", content = [Content(schema = Schema(implementation = Error::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "pins:read" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "pins:read" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_BOARDS_LIST_PINS /* "/boards/{board_id}/pins" */],
        produces = ["application/json"]
    )
    fun boardsListPins(
        @Pattern(regexp="^\\d+$") @Parameter(description = "Unique identifier of a board.", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Parameter(description = "Cursor used to fetch the next page of items") @Valid @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?,
        @Min(value=1) @Max(value=250) @Parameter(description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", schema = Schema(defaultValue = "25")) @Valid @RequestParam(value = "page_size", required = false, defaultValue = "25") pageSize: kotlin.Int,
        @Parameter(description = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.") @Valid @RequestParam(value = "creative_types", required = false) creativeTypes: kotlin.collections.List<CreativeType>?,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?,
        @Parameter(description = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "pin_metrics", required = false, defaultValue = "false") pinMetrics: kotlin.Boolean
    ): ResponseEntity<BoardsListPins200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update board",
        operationId = "boardsUpdate",
        description = """Update a board owned by the "operating user_account".
* Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".
* By default, the "operation user_account" is the token user_account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The request has succeeded.", content = [Content(schema = Schema(implementation = BoardWithUpdatePrivacy::class))]),
            ApiResponse(responseCode = "400", description = "The request could not be understood by the server due to unexpected data.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "401", description = "Authentication is required and has either failed or not been provided.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "403", description = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "404", description = "The requested resource could not be found on this server.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "429", description = "The user has sent too many requests in a given amount of time and is being rate limited.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]),
            ApiResponse(responseCode = "200", description = "An unexpected error response.", content = [Content(schema = Schema(implementation = PinterestLibError::class))]) ],
        security = [ SecurityRequirement(name = "pinterest_oauth2", scopes = [ "boards:read", "boards:write" ]),SecurityRequirement(name = "client_credentials", scopes = [ "boards:read", "boards:write" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = [PATH_BOARDS_UPDATE /* "/boards/{board_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardsUpdate(
        @Pattern(regexp="^\\d+$") @Parameter(description = "", required = true) @PathVariable("board_id") boardId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate,
        @Pattern(regexp="^\\d+$") @Size(max=18) @Parameter(description = "Unique identifier of an ad account.") @Valid @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
    ): ResponseEntity<BoardWithUpdatePrivacy> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v5"
        const val PATH_BOARD_SECTIONS_CREATE: String = "/boards/{board_id}/sections"
        const val PATH_BOARD_SECTIONS_DELETE: String = "/boards/{board_id}/sections/{section_id}"
        const val PATH_BOARD_SECTIONS_LIST: String = "/boards/{board_id}/sections"
        const val PATH_BOARD_SECTIONS_LIST_PINS: String = "/boards/{board_id}/sections/{section_id}/pins"
        const val PATH_BOARD_SECTIONS_UPDATE: String = "/boards/{board_id}/sections/{section_id}"
        const val PATH_BOARDS_CREATE: String = "/boards"
        const val PATH_BOARDS_DELETE: String = "/boards/{board_id}"
        const val PATH_BOARDS_GET: String = "/boards/{board_id}"
        const val PATH_BOARDS_LIST: String = "/boards"
        const val PATH_BOARDS_LIST_PINS: String = "/boards/{board_id}/pins"
        const val PATH_BOARDS_UPDATE: String = "/boards/{board_id}"
    }
}
