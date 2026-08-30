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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TermsOfService

@MiskTest(startService = true)
internal class TermsOfServiceApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var termsOfServiceApi: TermsOfServiceApiAction

    /**
     * To test TermsOfServiceApiAction.termsOfServiceGet
     */
    @Test
    fun `should handle termsOfServiceGet`() {
        val adAccountId = TODO()
        val includeHtml = TODO()
        val tosType = TODO()
        val response: TermsOfService = termsOfServiceApi.termsOfServiceGet(adAccountId, includeHtml, tosType)
    }
}
