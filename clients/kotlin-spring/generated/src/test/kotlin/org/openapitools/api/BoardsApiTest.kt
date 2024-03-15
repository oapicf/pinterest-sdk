package org.openapitools.api

import org.openapitools.model.Board
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardSectionsList200Response
import org.openapitools.model.BoardUpdate
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.BoardsListPins200Response
import org.openapitools.model.Error
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BoardsApiTest {

    private val api: BoardsApiController = BoardsApiController()

    /**
     * To test BoardsApiController.boardSectionsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardSectionsCreateTest() {
        val boardId: kotlin.String = TODO()
        val boardSection: BoardSection = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<BoardSection> = api.boardSectionsCreate(boardId, boardSection, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardSectionsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardSectionsDeleteTest() {
        val boardId: kotlin.String = TODO()
        val sectionId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.boardSectionsDelete(boardId, sectionId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardSectionsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardSectionsListTest() {
        val boardId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<BoardSectionsList200Response> = api.boardSectionsList(boardId, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardSectionsListPins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardSectionsListPinsTest() {
        val boardId: kotlin.String = TODO()
        val sectionId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<BoardsListPins200Response> = api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardSectionsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardSectionsUpdateTest() {
        val boardId: kotlin.String = TODO()
        val sectionId: kotlin.String = TODO()
        val boardSection: BoardSection = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<BoardSection> = api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsCreateTest() {
        val board: Board = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Board> = api.boardsCreate(board, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsDeleteTest() {
        val boardId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.boardsDelete(boardId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsGetTest() {
        val boardId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Board> = api.boardsGet(boardId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsListTest() {
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val privacy: kotlin.String? = TODO()
        val response: ResponseEntity<BoardsList200Response> = api.boardsList(adAccountId, bookmark, pageSize, privacy)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsListPins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsListPinsTest() {
        val boardId: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val creativeTypes: kotlin.collections.List<kotlin.String>? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val response: ResponseEntity<BoardsListPins200Response> = api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)

        // TODO: test validations
    }

    /**
     * To test BoardsApiController.boardsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun boardsUpdateTest() {
        val boardId: kotlin.String = TODO()
        val boardUpdate: BoardUpdate = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Board> = api.boardsUpdate(boardId, boardUpdate, adAccountId)

        // TODO: test validations
    }
}
