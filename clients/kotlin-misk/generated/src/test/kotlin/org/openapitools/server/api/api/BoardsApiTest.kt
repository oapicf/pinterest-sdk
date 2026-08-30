package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.Board
import org.openapitools.server.api.model.BoardCreate
import org.openapitools.server.api.model.BoardPrivacyFilter
import org.openapitools.server.api.model.BoardSection
import org.openapitools.server.api.model.BoardSectionCreate
import org.openapitools.server.api.model.BoardSectionUpdateWithRequiredBody
import org.openapitools.server.api.model.BoardSectionsList200Response
import org.openapitools.server.api.model.BoardWithUpdatePrivacy
import org.openapitools.server.api.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.BoardsListPins200Response
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class BoardsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var boardsApi: BoardsApiAction

    /**
     * To test BoardsApiAction.boardSectionsCreate
     */
    @Test
    fun `should handle boardSectionsCreate`() {
        val boardId = TODO()
        val boardSectionCreate = TODO()
        val adAccountId = TODO()
        val response: BoardSection = boardsApi.boardSectionsCreate(boardId, boardSectionCreate, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardSectionsDelete
     */
    @Test
    fun `should handle boardSectionsDelete`() {
        val boardId = TODO()
        val sectionId = TODO()
        val adAccountId = TODO()
        val response: BoardSection = boardsApi.boardSectionsDelete(boardId, sectionId, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardSectionsList
     */
    @Test
    fun `should handle boardSectionsList`() {
        val boardId = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardSectionsList200Response = boardsApi.boardSectionsList(boardId, adAccountId, bookmark, pageSize)
    }

    /**
     * To test BoardsApiAction.boardSectionsListPins
     */
    @Test
    fun `should handle boardSectionsListPins`() {
        val boardId = TODO()
        val sectionId = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardsListPins200Response = boardsApi.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)
    }

    /**
     * To test BoardsApiAction.boardSectionsUpdate
     */
    @Test
    fun `should handle boardSectionsUpdate`() {
        val boardId = TODO()
        val sectionId = TODO()
        val boardSectionUpdateWithRequiredBody = TODO()
        val adAccountId = TODO()
        val response: BoardSection = boardsApi.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardsCreate
     */
    @Test
    fun `should handle boardsCreate`() {
        val boardCreate = TODO()
        val adAccountId = TODO()
        val response: Board = boardsApi.boardsCreate(boardCreate, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardsDelete
     */
    @Test
    fun `should handle boardsDelete`() {
        val boardId = TODO()
        val adAccountId = TODO()
        val response: Board = boardsApi.boardsDelete(boardId, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardsGet
     */
    @Test
    fun `should handle boardsGet`() {
        val boardId = TODO()
        val adAccountId = TODO()
        val response: Board = boardsApi.boardsGet(boardId, adAccountId)
    }

    /**
     * To test BoardsApiAction.boardsList
     */
    @Test
    fun `should handle boardsList`() {
        val adAccountId = TODO()
        val privacy = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardsList200Response = boardsApi.boardsList(adAccountId, privacy, bookmark, pageSize)
    }

    /**
     * To test BoardsApiAction.boardsListPins
     */
    @Test
    fun `should handle boardsListPins`() {
        val boardId = TODO()
        val creativeTypes = TODO()
        val adAccountId = TODO()
        val pinMetrics = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardsListPins200Response = boardsApi.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize)
    }

    /**
     * To test BoardsApiAction.boardsUpdate
     */
    @Test
    fun `should handle boardsUpdate`() {
        val boardId = TODO()
        val boardWithUpdatePrivacyUpdate = TODO()
        val adAccountId = TODO()
        val response: BoardWithUpdatePrivacy = boardsApi.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId)
    }
}
