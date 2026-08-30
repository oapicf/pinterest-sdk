package org.openapitools.server.api.model

import org.openapitools.server.api.model.NullablePartnerType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteBusinessPartnersDelete(
    /** A list of partner ids to be deleted */
    val partnerIds: kotlin.collections.List<kotlin.String>,
    val partnerType: NullablePartnerType? = null
)
