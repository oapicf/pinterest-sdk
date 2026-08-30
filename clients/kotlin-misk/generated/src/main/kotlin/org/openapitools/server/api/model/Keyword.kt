package org.openapitools.server.api.model

import org.openapitools.server.api.model.MatchType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Keyword(
    /** Keyword ID . */
    val id: kotlin.String,
    /** Keyword [match type](/docs/api-features/targeting-overview/) */
    val matchType: MatchType,
    /** Keyword parent entity ID (advertiser, campaign, ad group). */
    val parentId: kotlin.String,
    /** Keyword value (120 chars max). */
    val `value`: kotlin.String,
    val archived: kotlin.Boolean? = null,
    /** **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null,
    /** Parent entity type (advertiser, campaign, ad group). */
    val parentType: kotlin.String? = null,
    /** Always keyword */
    val type: kotlin.String? = null
)
