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
import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudience
import org.openapitools.server.api.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudience
import org.openapitools.server.api.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.server.api.model.AudienceAccountType
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudience
import org.openapitools.server.api.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.BusinessToBusinessSharedAudience
import org.openapitools.server.api.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.server.api.model.Order
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SharedAudiencesForBusinessList200Response

@MiskTest(startService = true)
internal class AudienceSharingApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var audienceSharingApi: AudienceSharingApiAction

    /**
     * To test AudienceSharingApiAction.adAccountsAudiencesSharedAccountsList
     */
    @Test
    fun `should handle adAccountsAudiencesSharedAccountsList`() {
        val audienceId = TODO()
        val accountType = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: AdAccountsAudiencesSharedAccountsList200Response = audienceSharingApi.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)
    }

    /**
     * To test AudienceSharingApiAction.businessAccountAudiencesSharedAccountsList
     */
    @Test
    fun `should handle businessAccountAudiencesSharedAccountsList`() {
        val businessId = TODO()
        val audienceId = TODO()
        val accountType = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: AdAccountsAudiencesSharedAccountsList200Response = audienceSharingApi.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)
    }

    /**
     * To test AudienceSharingApiAction.sharedAudiencesForBusinessList
     */
    @Test
    fun `should handle sharedAudiencesForBusinessList`() {
        val businessId = TODO()
        val order = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: SharedAudiencesForBusinessList200Response = audienceSharingApi.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)
    }

    /**
     * To test AudienceSharingApiAction.updateAdAccountToAdAccountSharedAudience
     */
    @Test
    fun `should handle updateAdAccountToAdAccountSharedAudience`() {
        val adAccountId = TODO()
        val adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = TODO()
        val response: AdAccountToAdAccountSharedAudience = audienceSharingApi.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
    }

    /**
     * To test AudienceSharingApiAction.updateAdAccountToBusinessSharedAudience
     */
    @Test
    fun `should handle updateAdAccountToBusinessSharedAudience`() {
        val adAccountId = TODO()
        val adAccountToBusinessSharedAudienceUpdateWithRequiredBody = TODO()
        val response: AdAccountToBusinessSharedAudience = audienceSharingApi.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
    }

    /**
     * To test AudienceSharingApiAction.updateBusinessToAdAccountSharedAudience
     */
    @Test
    fun `should handle updateBusinessToAdAccountSharedAudience`() {
        val businessId = TODO()
        val businessToAdAccountSharedAudienceUpdateWithRequiredBody = TODO()
        val response: BusinessToAdAccountSharedAudience = audienceSharingApi.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)
    }

    /**
     * To test AudienceSharingApiAction.updateBusinessToBusinessSharedAudience
     */
    @Test
    fun `should handle updateBusinessToBusinessSharedAudience`() {
        val businessId = TODO()
        val businessToBusinessSharedAudienceUpdateWithRequiredBody = TODO()
        val response: BusinessToBusinessSharedAudience = audienceSharingApi.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)
    }
}
