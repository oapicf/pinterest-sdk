package org.openapitools.server.api.model

import org.openapitools.server.api.model.BudgetType
import org.openapitools.server.api.model.PacingDeliveryType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupCreateRequestAllOf1(
    /** Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. */
    val autoTargetingEnabled: kotlin.Boolean? = null,
    /** &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. */
    val bidMultiplier: java.math.BigDecimal? = null,
    val budgetType: BudgetType? = null,
    val pacingDeliveryType: PacingDeliveryType? = null
)
