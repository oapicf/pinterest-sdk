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
import org.openapitools.server.api.model.AdAccountsAudience
import org.openapitools.server.api.model.AdAccountsAudienceCreate
import org.openapitools.server.api.model.AdAccountsAudienceUpdate
import org.openapitools.server.api.model.AudienceOwnershipType
import org.openapitools.server.api.model.AudiencesList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class AudiencesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var audiencesApi: AudiencesApiAction

    /**
     * To test AudiencesApiAction.audiencesCreate
     */
    @Test
    fun `should handle audiencesCreate`() {
        val adAccountId = TODO()
        val adAccountsAudienceCreate = TODO()
        val response: AdAccountsAudience = audiencesApi.audiencesCreate(adAccountId, adAccountsAudienceCreate)
    }

    /**
     * To test AudiencesApiAction.audiencesGet
     */
    @Test
    fun `should handle audiencesGet`() {
        val audienceId = TODO()
        val adAccountId = TODO()
        val response: AdAccountsAudience = audiencesApi.audiencesGet(audienceId, adAccountId)
    }

    /**
     * To test AudiencesApiAction.audiencesList
     */
    @Test
    fun `should handle audiencesList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val ownershipType = TODO()
        val excludeNca = TODO()
        val response: AudiencesList200Response = audiencesApi.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)
    }

    /**
     * To test AudiencesApiAction.audiencesUpdate
     */
    @Test
    fun `should handle audiencesUpdate`() {
        val audienceId = TODO()
        val adAccountId = TODO()
        val adAccountsAudienceUpdate = TODO()
        val response: AdAccountsAudience = audiencesApi.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)
    }
}
