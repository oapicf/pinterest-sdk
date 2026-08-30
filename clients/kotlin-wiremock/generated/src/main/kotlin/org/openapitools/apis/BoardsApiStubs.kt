@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class BoardsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation boardSectionsCreate.
     *
     * @param boardId path parameter boardId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardSectionsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardSectionsCreate(boardId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardSectionsCreateStubBuilder =
        BoardSectionsCreateStubBuilder(objectMapper, post(urlPathTemplate("/boards/{board_id}/sections"))
            .withPathParam("board_id", boardId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardSectionsDelete.
     *
     * @param boardId path parameter boardId pattern.
     * @param sectionId path parameter sectionId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardSectionsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardSectionsDelete(boardId: StringValuePattern, sectionId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardSectionsDeleteStubBuilder =
        BoardSectionsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/boards/{board_id}/sections/{section_id}"))
            .withPathParam("board_id", boardId)
            .withPathParam("section_id", sectionId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardSectionsList.
     *
     * @param boardId path parameter boardId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardSectionsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardSectionsList(boardId: StringValuePattern, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardSectionsListStubBuilder =
        BoardSectionsListStubBuilder(objectMapper, get(urlPathTemplate("/boards/{board_id}/sections"))
            .withPathParam("board_id", boardId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardSectionsListPins.
     *
     * @param boardId path parameter boardId pattern.
     * @param sectionId path parameter sectionId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardSectionsListPinsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardSectionsListPins(boardId: StringValuePattern, sectionId: StringValuePattern, adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardSectionsListPinsStubBuilder =
        BoardSectionsListPinsStubBuilder(objectMapper, get(urlPathTemplate("/boards/{board_id}/sections/{section_id}/pins"))
            .withPathParam("board_id", boardId)
            .withPathParam("section_id", sectionId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardSectionsUpdate.
     *
     * @param boardId path parameter boardId pattern.
     * @param sectionId path parameter sectionId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardSectionsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardSectionsUpdate(boardId: StringValuePattern, sectionId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardSectionsUpdateStubBuilder =
        BoardSectionsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/boards/{board_id}/sections/{section_id}"))
            .withPathParam("board_id", boardId)
            .withPathParam("section_id", sectionId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsCreateStubBuilder =
        BoardsCreateStubBuilder(objectMapper, post(urlPathTemplate("/boards"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsDelete.
     *
     * @param boardId path parameter boardId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsDelete(boardId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsDeleteStubBuilder =
        BoardsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/boards/{board_id}"))
            .withPathParam("board_id", boardId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsGet.
     *
     * @param boardId path parameter boardId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsGet(boardId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsGetStubBuilder =
        BoardsGetStubBuilder(objectMapper, get(urlPathTemplate("/boards/{board_id}"))
            .withPathParam("board_id", boardId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsList.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param privacy query parameter privacy pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsList(adAccountId: StringValuePattern? = null, privacy: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsListStubBuilder =
        BoardsListStubBuilder(objectMapper, get(urlPathTemplate("/boards"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { privacy?.let { withQueryParam("privacy", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsListPins.
     *
     * @param boardId path parameter boardId pattern.
     * @param creativeTypes query parameter creativeTypes pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param pinMetrics query parameter pinMetrics pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsListPinsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsListPins(boardId: StringValuePattern, creativeTypes: StringValuePattern? = null, adAccountId: StringValuePattern? = null, pinMetrics: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsListPinsStubBuilder =
        BoardsListPinsStubBuilder(objectMapper, get(urlPathTemplate("/boards/{board_id}/pins"))
            .withPathParam("board_id", boardId)
            .apply { creativeTypes?.let { withQueryParam("creative_types", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { pinMetrics?.let { withQueryParam("pin_metrics", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation boardsUpdate.
     *
     * @param boardId path parameter boardId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BoardsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun boardsUpdate(boardId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BoardsUpdateStubBuilder =
        BoardsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/boards/{board_id}"))
            .withPathParam("board_id", boardId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
