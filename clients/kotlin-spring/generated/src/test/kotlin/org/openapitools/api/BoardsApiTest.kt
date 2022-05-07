package org.openapitools.api

import org.openapitools.model.Board
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardUpdate
import org.openapitools.model.Error
import org.openapitools.model.Paginated
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
        val boardId:kotlin.String = TODO()
        val boardSection:BoardSection = TODO()
        val response: ResponseEntity<BoardSection> = api.boardSectionsCreate(boardId, boardSection)

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
        val boardId:kotlin.String = TODO()
        val sectionId:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.boardSectionsDelete(boardId, sectionId)

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
        val boardId:kotlin.String = TODO()
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.boardSectionsList(boardId, bookmark, pageSize)

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
        val boardId:kotlin.String = TODO()
        val sectionId:kotlin.String = TODO()
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.boardSectionsListPins(boardId, sectionId, bookmark, pageSize)

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
        val boardId:kotlin.String = TODO()
        val sectionId:kotlin.String = TODO()
        val boardSection:BoardSection = TODO()
        val response: ResponseEntity<BoardSection> = api.boardSectionsUpdate(boardId, sectionId, boardSection)

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
        val board:Board = TODO()
        val response: ResponseEntity<Board> = api.boardsCreate(board)

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
        val boardId:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.boardsDelete(boardId)

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
        val boardId:kotlin.String = TODO()
        val response: ResponseEntity<Board> = api.boardsGet(boardId)

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
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val privacy:kotlin.String? = TODO()
        val response: ResponseEntity<Paginated> = api.boardsList(bookmark, pageSize, privacy)

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
        val boardId:kotlin.String = TODO()
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.boardsListPins(boardId, bookmark, pageSize)

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
        val boardId:kotlin.String = TODO()
        val boardUpdate:BoardUpdate = TODO()
        val response: ResponseEntity<Board> = api.boardsUpdate(boardId, boardUpdate)

        // TODO: test validations
    }

}
