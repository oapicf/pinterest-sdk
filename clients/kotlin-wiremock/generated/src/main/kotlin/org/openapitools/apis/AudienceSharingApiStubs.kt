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
open class AudienceSharingApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adAccountsAudiencesSharedAccountsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param audienceId query parameter audienceId pattern.
     * @param accountType query parameter accountType pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsAudiencesSharedAccountsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsAudiencesSharedAccountsList(adAccountId: StringValuePattern, audienceId: StringValuePattern? = null, accountType: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsAudiencesSharedAccountsListStubBuilder =
        AdAccountsAudiencesSharedAccountsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences/shared/accounts"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { audienceId?.let { withQueryParam("audience_id", it) } }
            .apply { accountType?.let { withQueryParam("account_type", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation businessAccountAudiencesSharedAccountsList.
     *
     * @param businessId path parameter businessId pattern.
     * @param audienceId query parameter audienceId pattern.
     * @param accountType query parameter accountType pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessAccountAudiencesSharedAccountsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessAccountAudiencesSharedAccountsList(businessId: StringValuePattern, audienceId: StringValuePattern? = null, accountType: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessAccountAudiencesSharedAccountsListStubBuilder =
        BusinessAccountAudiencesSharedAccountsListStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/audiences/shared/accounts"))
            .withPathParam("business_id", businessId)
            .apply { audienceId?.let { withQueryParam("audience_id", it) } }
            .apply { accountType?.let { withQueryParam("account_type", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation sharedAudiencesForBusinessList.
     *
     * @param businessId path parameter businessId pattern.
     * @param order query parameter order pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SharedAudiencesForBusinessListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sharedAudiencesForBusinessList(businessId: StringValuePattern, order: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SharedAudiencesForBusinessListStubBuilder =
        SharedAudiencesForBusinessListStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/audiences"))
            .withPathParam("business_id", businessId)
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateAdAccountToAdAccountSharedAudience.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateAdAccountToAdAccountSharedAudienceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateAdAccountToAdAccountSharedAudience(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateAdAccountToAdAccountSharedAudienceStubBuilder =
        UpdateAdAccountToAdAccountSharedAudienceStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateAdAccountToBusinessSharedAudience.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateAdAccountToBusinessSharedAudienceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateAdAccountToBusinessSharedAudience(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateAdAccountToBusinessSharedAudienceStubBuilder =
        UpdateAdAccountToBusinessSharedAudienceStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences/businesses/shared"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateBusinessToAdAccountSharedAudience.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateBusinessToAdAccountSharedAudienceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateBusinessToAdAccountSharedAudience(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateBusinessToAdAccountSharedAudienceStubBuilder =
        UpdateBusinessToAdAccountSharedAudienceStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/audiences/ad_accounts/shared"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateBusinessToBusinessSharedAudience.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateBusinessToBusinessSharedAudienceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateBusinessToBusinessSharedAudience(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateBusinessToBusinessSharedAudienceStubBuilder =
        UpdateBusinessToBusinessSharedAudienceStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/audiences/businesses/shared"))
            .withPathParam("business_id", businessId)
            .configurer()
        )
}
