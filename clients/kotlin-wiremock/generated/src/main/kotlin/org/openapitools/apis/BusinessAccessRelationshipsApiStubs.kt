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
open class BusinessAccessRelationshipsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation brandAccountsCreate.
     *
     * @param businessHierarchyId path parameter businessHierarchyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BrandAccountsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun brandAccountsCreate(businessHierarchyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BrandAccountsCreateStubBuilder =
        BrandAccountsCreateStubBuilder(objectMapper, post(urlPathTemplate("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"))
            .withPathParam("business_hierarchy_id", businessHierarchyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation brandAccountsUpdate.
     *
     * @param brandAccountId path parameter brandAccountId pattern.
     * @param businessHierarchyId path parameter businessHierarchyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BrandAccountsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun brandAccountsUpdate(brandAccountId: StringValuePattern, businessHierarchyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BrandAccountsUpdateStubBuilder =
        BrandAccountsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"))
            .withPathParam("brand_account_id", brandAccountId)
            .withPathParam("business_hierarchy_id", businessHierarchyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteBusinessMembership.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteBusinessMembershipStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteBusinessMembership(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteBusinessMembershipStubBuilder =
        DeleteBusinessMembershipStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/members"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteBusinessPartners.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteBusinessPartnersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteBusinessPartners(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteBusinessPartnersStubBuilder =
        DeleteBusinessPartnersStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/partners"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessEmployers.
     *
     * @param assetsSummary query parameter assetsSummary pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessEmployersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessEmployers(assetsSummary: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessEmployersStubBuilder =
        GetBusinessEmployersStubBuilder(objectMapper, get(urlPathTemplate("/businesses/employers"))
            .apply { assetsSummary?.let { withQueryParam("assets_summary", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessMembers.
     *
     * @param businessId path parameter businessId pattern.
     * @param fetchSystemUsers query parameter fetchSystemUsers pattern.
     * @param assetsSummary query parameter assetsSummary pattern.
     * @param businessRoles query parameter businessRoles pattern.
     * @param memberIds query parameter memberIds pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessMembersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessMembers(businessId: StringValuePattern, fetchSystemUsers: StringValuePattern? = null, assetsSummary: StringValuePattern? = null, businessRoles: StringValuePattern? = null, memberIds: StringValuePattern? = null, startIndex: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessMembersStubBuilder =
        GetBusinessMembersStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/members"))
            .withPathParam("business_id", businessId)
            .apply { fetchSystemUsers?.let { withQueryParam("fetch_system_users", it) } }
            .apply { assetsSummary?.let { withQueryParam("assets_summary", it) } }
            .apply { businessRoles?.let { withQueryParam("business_roles", it) } }
            .apply { memberIds?.let { withQueryParam("member_ids", it) } }
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessPartners.
     *
     * @param businessId path parameter businessId pattern.
     * @param assetsSummary query parameter assetsSummary pattern.
     * @param partnerType query parameter partnerType pattern.
     * @param partnerIds query parameter partnerIds pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param sortAscending query parameter sortAscending pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessPartnersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessPartners(businessId: StringValuePattern, assetsSummary: StringValuePattern? = null, partnerType: StringValuePattern? = null, partnerIds: StringValuePattern? = null, startIndex: StringValuePattern? = null, sortAscending: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessPartnersStubBuilder =
        GetBusinessPartnersStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/partners"))
            .withPathParam("business_id", businessId)
            .apply { assetsSummary?.let { withQueryParam("assets_summary", it) } }
            .apply { partnerType?.let { withQueryParam("partner_type", it) } }
            .apply { partnerIds?.let { withQueryParam("partner_ids", it) } }
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { sortAscending?.let { withQueryParam("sort_ascending", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation systemUserUpdate.
     *
     * @param businessId path parameter businessId pattern.
     * @param systemUserId path parameter systemUserId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SystemUserUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun systemUserUpdate(businessId: StringValuePattern, systemUserId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SystemUserUpdateStubBuilder =
        SystemUserUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/system_users/{system_user_id}"))
            .withPathParam("business_id", businessId)
            .withPathParam("system_user_id", systemUserId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateBusinessMemberships.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateBusinessMembershipsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateBusinessMemberships(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateBusinessMembershipsStubBuilder =
        UpdateBusinessMembershipsStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/members"))
            .withPathParam("business_id", businessId)
            .configurer()
        )
}
