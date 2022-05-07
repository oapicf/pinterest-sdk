package org.openapitools.api

import org.openapitools.model.Board
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardUpdate
import org.openapitools.model.Error
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
class BoardsApiController() {


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/boards/{board_id}/sections"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardSectionsCreate(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
, @Valid @RequestBody boardSection: BoardSection
): ResponseEntity<BoardSection> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/boards/{board_id}/sections/{section_id}"],
        produces = ["application/json"]
    )
    fun boardSectionsDelete(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
,@Pattern(regexp="^\\d+$")  @PathVariable("section_id") sectionId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/boards/{board_id}/sections"],
        produces = ["application/json"]
    )
    fun boardSectionsList(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/boards/{board_id}/sections/{section_id}/pins"],
        produces = ["application/json"]
    )
    fun boardSectionsListPins(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
,@Pattern(regexp="^\\d+$")  @PathVariable("section_id") sectionId: kotlin.String
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/boards/{board_id}/sections/{section_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardSectionsUpdate(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
,@Pattern(regexp="^\\d+$")  @PathVariable("section_id") sectionId: kotlin.String
, @Valid @RequestBody boardSection: BoardSection
): ResponseEntity<BoardSection> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/boards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardsCreate( @Valid @RequestBody board: Board
): ResponseEntity<Board> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/boards/{board_id}"],
        produces = ["application/json"]
    )
    fun boardsDelete(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/boards/{board_id}"],
        produces = ["application/json"]
    )
    fun boardsGet(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
): ResponseEntity<Board> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/boards"],
        produces = ["application/json"]
    )
    fun boardsList( @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
, @RequestParam(value = "privacy", required = false) privacy: kotlin.String?
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/boards/{board_id}/pins"],
        produces = ["application/json"]
    )
    fun boardsListPins(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/boards/{board_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun boardsUpdate(@Pattern(regexp="^\\d+$")  @PathVariable("board_id") boardId: kotlin.String
, @Valid @RequestBody boardUpdate: BoardUpdate
): ResponseEntity<Board> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
