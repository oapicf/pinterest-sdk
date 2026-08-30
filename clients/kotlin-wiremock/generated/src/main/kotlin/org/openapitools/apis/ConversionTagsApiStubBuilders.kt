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
 *  Builder for WireMock stubs of operation conversionTagsCreate.
 */
class ConversionTagsCreateStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for conversionTagsCreate respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: ConversionTag,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for conversionTagsCreate respond with HTTP status code 201.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith201(
        body: ConversionTag,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(201)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for conversionTagsCreate respond with HTTP status code 400.
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
     * Let the stub for conversionTagsCreate respond with HTTP status code 401.
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
     * Let the stub for conversionTagsCreate respond with HTTP status code 403.
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
     * Let the stub for conversionTagsCreate respond with HTTP status code 404.
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
     * Let the stub for conversionTagsCreate respond with HTTP status code 429.
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
     * Let the stub for conversionTagsCreate respond with HTTP status code [code].
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
 *  Builder for WireMock stubs of operation conversionTagsGet.
 */
class ConversionTagsGetStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for conversionTagsGet respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: ConversionTag,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for conversionTagsGet respond with HTTP status code 400.
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
     * Let the stub for conversionTagsGet respond with HTTP status code 401.
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
     * Let the stub for conversionTagsGet respond with HTTP status code 403.
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
     * Let the stub for conversionTagsGet respond with HTTP status code 404.
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
     * Let the stub for conversionTagsGet respond with HTTP status code 429.
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
     * Let the stub for conversionTagsGet respond with HTTP status code [code].
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
 *  Builder for WireMock stubs of operation conversionTagsList.
 */
class ConversionTagsListStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for conversionTagsList respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: ConversionTagsList200Response,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for conversionTagsList respond with HTTP status code 400.
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
     * Let the stub for conversionTagsList respond with HTTP status code 401.
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
     * Let the stub for conversionTagsList respond with HTTP status code 403.
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
     * Let the stub for conversionTagsList respond with HTTP status code 404.
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
     * Let the stub for conversionTagsList respond with HTTP status code 429.
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
     * Let the stub for conversionTagsList respond with HTTP status code [code].
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
 *  Builder for WireMock stubs of operation ocpmEligibleConversionTagsGet.
 */
class OcpmEligibleConversionTagsGetStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ConversionEventResponse>>,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 400.
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
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 401.
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
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 403.
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
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 404.
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
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code 429.
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
     * Let the stub for ocpmEligibleConversionTagsGet respond with HTTP status code [code].
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
 *  Builder for WireMock stubs of operation pageVisitConversionTagsGet.
 */
class PageVisitConversionTagsGetStubBuilder internal constructor(private val objectMapper: ObjectMapper, private val stub: MappingBuilder) {

    /**
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 200.
     *
     * @param body response body for the [MappingBuilder].
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return a [MappingBuilder] to be registered with a WireMock instance.
     */
    fun respondWith200(
        body: PageVisitConversionTagsGet200Response,
        configurer: ResponseDefinitionBuilder.() -> ResponseDefinitionBuilder = { this },
    ): MappingBuilder =
        stub.willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(objectMapper.writeValueAsString(body))
            .configurer()
        )

    /**
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 400.
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
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 401.
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
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 403.
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
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 404.
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
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code 429.
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
     * Let the stub for pageVisitConversionTagsGet respond with HTTP status code [code].
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

