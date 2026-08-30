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
 *  Builder for WireMock stubs of operation feedProcessingResultsList.
 */
class FeedProcessingResultsListStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: FeedProcessingResultsList200Response,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedProcessingResultsList respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsCreate.
 */
class FeedsCreateStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsCreate respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: CatalogsFeed,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 201.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith201(
        body: CatalogsFeed,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(201)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsCreate respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsDelete.
 */
class FeedsDeleteStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsDelete respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: CatalogsFeed,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 204.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith204(
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(204)
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsDelete respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsGet.
 */
class FeedsGetStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsGet respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: CatalogsFeed,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsGet respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsIngest.
 */
class FeedsIngestStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsIngest respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: CatalogsFeedIngestion,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsIngest respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsList.
 */
class FeedsListStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsList respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: FeedsList200Response,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsList respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation feedsUpdate.
 */
class FeedsUpdateStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: CatalogsFeed,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for feedsUpdate respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

/**
 *  Builder for WireMock stubs of operation itemsIssuesList.
 */
class ItemsIssuesListStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: ItemsIssuesList200Response,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 400.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith400(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(400)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 401.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith401(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(401)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 403.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith403(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(403)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 404.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith404(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(404)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code 429.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith429(
        body: PinterestLibError,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(429)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for itemsIssuesList respond with HTTP status code [code].
     *
     * @param code the response code.
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith(
        code: Int,
        body: Any? = null,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this }
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(code)
            .apply {
                body?.let {
                    withHeader("Content-Type", "application/json")
                    withBody(objectMapper.writeValueAsString(it))
                }
            }
            .configurer()
    )
}

