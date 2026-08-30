package org.openapitools.server.api.model

import org.openapitools.server.api.model.EventData
import org.openapitools.server.api.model.ObjectiveType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceRule(
    /** Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /** Ad ID for engagement audience filter. */
    val adId: kotlin.collections.List<kotlin.String>? = null,
    /** Campaign ID for engagement audience filter. */
    val campaignId: kotlin.collections.List<kotlin.String>? = null,
    /** Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. */
    val country: kotlin.String? = null,
    /** Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. */
    val customerListId: kotlin.String? = null,
    /** The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. */
    val engagementDomain: kotlin.collections.List<kotlin.String>? = null,
    /** Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. */
    val engagementType: kotlin.String? = null,
    /** Optional for ENGAGEMENT. Engager type value should be 1-2. */
    val engagerType: kotlin.Int? = null,
    /** A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. */
    val event: kotlin.String? = null,
    val eventData: EventData? = null,
    /** Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline */
    val eventSource: kotlin.Any? = null,
    /** Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api */
    val ingestionSource: kotlin.Any? = null,
    /** Objective for engagement audience filter. */
    val objectiveType: kotlin.collections.List<ObjectiveType>? = null,
    /** Percentage should be 1-10. The targeted audience should be this % size across Pinterest. */
    val percentage: kotlin.Int? = null,
    /** IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] */
    val pinId: kotlin.collections.List<kotlin.String>? = null,
    /** Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. */
    val prefill: kotlin.Boolean? = null,
    /** Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. */
    val retentionDays: kotlin.Int? = null,
    /** Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. */
    val seedId: kotlin.collections.List<kotlin.String>? = null,
    /** Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} */
    val url: kotlin.collections.List<kotlin.String>? = null,
    /** The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. */
    val visitorSourceId: kotlin.String? = null
)
