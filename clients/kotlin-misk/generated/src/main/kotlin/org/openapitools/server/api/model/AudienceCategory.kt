package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceSubcategory
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceCategory(
    /** Interest ID. */
    val id: kotlin.String? = null,
    /** Interest affinity index. */
    val index: java.math.BigDecimal? = null,
    /** Interest unique key (same as ID). */
    val key: kotlin.String? = null,
    /** Interest name. */
    val name: kotlin.String? = null,
    /** Interest&#39;s percent of category&#39;s total audience. */
    val ratio: java.math.BigDecimal? = null,
    /** Subcategory interest distribution */
    val subcategories: kotlin.collections.List<AudienceSubcategory>? = null
)
