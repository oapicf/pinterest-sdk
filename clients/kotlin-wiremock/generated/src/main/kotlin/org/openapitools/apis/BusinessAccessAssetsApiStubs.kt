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
open class BusinessAccessAssetsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation assetGroupCreate.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AssetGroupCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun assetGroupCreate(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AssetGroupCreateStubBuilder =
        AssetGroupCreateStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{business_id}/asset_groups"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation assetGroupDelete.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AssetGroupDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun assetGroupDelete(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AssetGroupDeleteStubBuilder =
        AssetGroupDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/asset_groups"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation assetGroupUpdate.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AssetGroupUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun assetGroupUpdate(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AssetGroupUpdateStubBuilder =
        AssetGroupUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/asset_groups"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation businessAssetMembersGet.
     *
     * @param businessId path parameter businessId pattern.
     * @param assetId path parameter assetId pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param fetchSystemUsers query parameter fetchSystemUsers pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessAssetMembersGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessAssetMembersGet(businessId: StringValuePattern, assetId: StringValuePattern, startIndex: StringValuePattern? = null, fetchSystemUsers: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessAssetMembersGetStubBuilder =
        BusinessAssetMembersGetStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/assets/{asset_id}/members"))
            .withPathParam("business_id", businessId)
            .withPathParam("asset_id", assetId)
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { fetchSystemUsers?.let { withQueryParam("fetch_system_users", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation businessAssetPartnersGet.
     *
     * @param businessId path parameter businessId pattern.
     * @param assetId path parameter assetId pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessAssetPartnersGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessAssetPartnersGet(businessId: StringValuePattern, assetId: StringValuePattern, startIndex: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessAssetPartnersGetStubBuilder =
        BusinessAssetPartnersGetStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/assets/{asset_id}/partners"))
            .withPathParam("business_id", businessId)
            .withPathParam("asset_id", assetId)
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation businessAssetsGet.
     *
     * @param businessId path parameter businessId pattern.
     * @param permissions query parameter permissions pattern.
     * @param childAssetId query parameter childAssetId pattern.
     * @param assetGroupId query parameter assetGroupId pattern.
     * @param assetType query parameter assetType pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessAssetsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessAssetsGet(businessId: StringValuePattern, permissions: StringValuePattern? = null, childAssetId: StringValuePattern? = null, assetGroupId: StringValuePattern? = null, assetType: StringValuePattern? = null, startIndex: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessAssetsGetStubBuilder =
        BusinessAssetsGetStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/assets"))
            .withPathParam("business_id", businessId)
            .apply { permissions?.let { withQueryParam("permissions", it) } }
            .apply { childAssetId?.let { withQueryParam("child_asset_id", it) } }
            .apply { assetGroupId?.let { withQueryParam("asset_group_id", it) } }
            .apply { assetType?.let { withQueryParam("asset_type", it) } }
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation businessMemberAssetsGet.
     *
     * @param businessId path parameter businessId pattern.
     * @param memberId path parameter memberId pattern.
     * @param assetType query parameter assetType pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param sortBy query parameter sortBy pattern.
     * @param sortAscending query parameter sortAscending pattern.
     * @param searchBy query parameter searchBy pattern.
     * @param searchValue query parameter searchValue pattern.
     * @param assetPermissionType query parameter assetPermissionType pattern.
     * @param adAccountStatuses query parameter adAccountStatuses pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessMemberAssetsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessMemberAssetsGet(businessId: StringValuePattern, memberId: StringValuePattern, assetType: StringValuePattern? = null, startIndex: StringValuePattern? = null, sortBy: StringValuePattern? = null, sortAscending: StringValuePattern? = null, searchBy: StringValuePattern? = null, searchValue: StringValuePattern? = null, assetPermissionType: StringValuePattern? = null, adAccountStatuses: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessMemberAssetsGetStubBuilder =
        BusinessMemberAssetsGetStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/members/{member_id}/assets"))
            .withPathParam("business_id", businessId)
            .withPathParam("member_id", memberId)
            .apply { assetType?.let { withQueryParam("asset_type", it) } }
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { sortBy?.let { withQueryParam("sort_by", it) } }
            .apply { sortAscending?.let { withQueryParam("sort_ascending", it) } }
            .apply { searchBy?.let { withQueryParam("search_by", it) } }
            .apply { searchValue?.let { withQueryParam("search_value", it) } }
            .apply { assetPermissionType?.let { withQueryParam("asset_permission_type", it) } }
            .apply { adAccountStatuses?.let { withQueryParam("ad_account_statuses", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation businessMembersAssetAccessDelete.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessMembersAssetAccessDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessMembersAssetAccessDelete(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessMembersAssetAccessDeleteStubBuilder =
        BusinessMembersAssetAccessDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/members/assets/access"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation businessMembersAssetAccessUpdate.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessMembersAssetAccessUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessMembersAssetAccessUpdate(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessMembersAssetAccessUpdateStubBuilder =
        BusinessMembersAssetAccessUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/members/assets/access"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation businessPartnerAssetAccessGet.
     *
     * @param businessId path parameter businessId pattern.
     * @param partnerId path parameter partnerId pattern.
     * @param partnerType query parameter partnerType pattern.
     * @param assetType query parameter assetType pattern.
     * @param startIndex query parameter startIndex pattern.
     * @param sortBy query parameter sortBy pattern.
     * @param sortAscending query parameter sortAscending pattern.
     * @param searchBy query parameter searchBy pattern.
     * @param searchValue query parameter searchValue pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BusinessPartnerAssetAccessGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun businessPartnerAssetAccessGet(businessId: StringValuePattern, partnerId: StringValuePattern, partnerType: StringValuePattern? = null, assetType: StringValuePattern? = null, startIndex: StringValuePattern? = null, sortBy: StringValuePattern? = null, sortAscending: StringValuePattern? = null, searchBy: StringValuePattern? = null, searchValue: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BusinessPartnerAssetAccessGetStubBuilder =
        BusinessPartnerAssetAccessGetStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{business_id}/partners/{partner_id}/assets"))
            .withPathParam("business_id", businessId)
            .withPathParam("partner_id", partnerId)
            .apply { partnerType?.let { withQueryParam("partner_type", it) } }
            .apply { assetType?.let { withQueryParam("asset_type", it) } }
            .apply { startIndex?.let { withQueryParam("start_index", it) } }
            .apply { sortBy?.let { withQueryParam("sort_by", it) } }
            .apply { sortAscending?.let { withQueryParam("sort_ascending", it) } }
            .apply { searchBy?.let { withQueryParam("search_by", it) } }
            .apply { searchValue?.let { withQueryParam("search_value", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation deletePartnerAssetAccessHandlerImpl.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeletePartnerAssetAccessHandlerImplStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deletePartnerAssetAccessHandlerImpl(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeletePartnerAssetAccessHandlerImplStubBuilder =
        DeletePartnerAssetAccessHandlerImplStubBuilder(objectMapper, delete(urlPathTemplate("/businesses/{business_id}/partners/assets"))
            .withPathParam("business_id", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updatePartnerAssetAccessHandlerImpl.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdatePartnerAssetAccessHandlerImplStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updatePartnerAssetAccessHandlerImpl(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdatePartnerAssetAccessHandlerImplStubBuilder =
        UpdatePartnerAssetAccessHandlerImplStubBuilder(objectMapper, patch(urlPathTemplate("/businesses/{business_id}/partners/assets"))
            .withPathParam("business_id", businessId)
            .configurer()
        )
}
