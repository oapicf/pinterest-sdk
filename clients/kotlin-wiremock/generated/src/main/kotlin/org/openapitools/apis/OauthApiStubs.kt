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
open class OauthApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation oauthConversionToken.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [OauthConversionTokenStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun oauthConversionToken(configurer: MappingBuilder.() -> MappingBuilder = { this }): OauthConversionTokenStubBuilder =
        OauthConversionTokenStubBuilder(objectMapper, post(urlPathTemplate("/oauth/conversion_token"))
            .configurer()
        )

    /**
     * Construct a stub for the operation oauthToken.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [OauthTokenStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun oauthToken(configurer: MappingBuilder.() -> MappingBuilder = { this }): OauthTokenStubBuilder =
        OauthTokenStubBuilder(objectMapper, post(urlPathTemplate("/oauth/token"))
            .configurer()
        )

    /**
     * Construct a stub for the operation tokenRevoke.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TokenRevokeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun tokenRevoke(configurer: MappingBuilder.() -> MappingBuilder = { this }): TokenRevokeStubBuilder =
        TokenRevokeStubBuilder(objectMapper, post(urlPathTemplate("/oauth/token/revoke"))
            .configurer()
        )
}
