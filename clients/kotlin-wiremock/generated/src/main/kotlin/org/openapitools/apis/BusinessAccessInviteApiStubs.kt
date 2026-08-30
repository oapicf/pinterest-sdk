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
open class BusinessAccessInviteApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation assetAccessRequestsCreate.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AssetAccessRequestsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun assetAccessRequestsCreate(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AssetAccessRequestsCreateStubBuilder =
        AssetAccessRequestsCreateStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{business_id}/requests/assets/access"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation cancelInvitesOrRequests.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelInvitesOrRequestsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelInvitesOrRequests(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelInvitesOrRequestsStubBuilder =
        CancelInvitesOrRequestsStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/invites"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createAssetInvites.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateAssetInvitesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createAssetInvites(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateAssetInvitesStubBuilder =
        CreateAssetInvitesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{business_id}/invites/assets/access"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createMembershipOrPartnershipInvites.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateMembershipOrPartnershipInvitesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createMembershipOrPartnershipInvites(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateMembershipOrPartnershipInvitesStubBuilder =
        CreateMembershipOrPartnershipInvitesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{business_id}/invites"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getInvites.
     *
     * @param businessId path parameter businessId pattern.
     * @param isMember query parameter isMember pattern.
     * @param inviteStatus query parameter inviteStatus pattern.
     * @param inviteType query parameter inviteType pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetInvitesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getInvites(businessId: StringValuePattern, isMember: StringValuePattern? = null, inviteStatus: StringValuePattern? = null, inviteType: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetInvitesStubBuilder =
        GetInvitesStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/invites"))
            .withPathParam("business_id", businessId)
            .apply { isMember?.let { withQueryParam("is_member", it) } }
            .apply { inviteStatus?.let { withQueryParam("invite_status", it) } }
            .apply { inviteType?.let { withQueryParam("invite_type", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation respondBusinessAccessInvites.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RespondBusinessAccessInvitesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun respondBusinessAccessInvites(configurer: MappingBuilder.() -> MappingBuilder = { this }): RespondBusinessAccessInvitesStubBuilder =
        RespondBusinessAccessInvitesStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/invites"))
            .configurer()
        )
}
