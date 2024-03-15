package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ObjectiveType
import org.openapitools.model.PinterestTagEventData
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
 * @param country Valid countries include: \"US\", \"CA\", and \"GB\".
 * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`.
 * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
 * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
 * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
 * @param eventData 
 * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
 * @param pinId IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
 * @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
 * @param retentionDays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
 * @param seedId Audience ID(s). For ACTALIKE `audience_type`. 
 * @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
 * @param visitorSourceId The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
 * @param eventSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
 * @param ingestionSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
 * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2.
 * @param campaignId Campaign ID for engagement audience filter.
 * @param adId Ad ID for engagement audience filter.
 * @param objectiveType Objective for engagement audience filter.
 * @param adAccountId Ad account ID.
 */
data class AudienceRule(

    @Schema(example = "US", description = "Valid countries include: \"US\", \"CA\", and \"GB\".")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "5497558859876", description = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
    @get:JsonProperty("customer_list_id") val customerListId: kotlin.String? = null,

    @Schema(example = "[\"www.somedomain.com\"]", description = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
    @get:JsonProperty("engagement_domain") val engagementDomain: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "click", description = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. ")
    @get:JsonProperty("engagement_type") val engagementType: kotlin.String? = null,

    @Schema(example = "checkout", description = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")
    @get:JsonProperty("event") val event: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("event_data") val eventData: PinterestTagEventData? = null,

    @Schema(example = "3", description = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
    @get:JsonProperty("percentage") val percentage: kotlin.Int? = null,

    @Schema(example = "[\"34567\"]", description = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
    @get:JsonProperty("pin_id") val pinId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "true", description = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
    @get:JsonProperty("prefill") val prefill: kotlin.Boolean? = null,

    @Schema(example = "30", description = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
    @get:JsonProperty("retention_days") val retentionDays: kotlin.Int? = null,

    @Schema(example = "[\"2542620639259\",\"2542620639261\"]", description = "Audience ID(s). For ACTALIKE `audience_type`. ")
    @get:JsonProperty("seed_id") val seedId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
    @get:JsonProperty("url") val url: kotlin.collections.List<kotlin.String>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
    @get:JsonProperty("visitor_source_id") val visitorSourceId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "{\"=\":[\"web\",\"mobile\"]}", description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
    @get:JsonProperty("event_source") val eventSource: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "{\"=\":[\"tag\"]}", description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")
    @get:JsonProperty("ingestion_source") val ingestionSource: kotlin.Any? = null,

    @Schema(example = "1", description = "Optional for ENGAGEMENT. Engager type value should be 1-2.")
    @get:JsonProperty("engager_type") val engagerType: kotlin.Int? = null,

    @Schema(example = "[\"626744528398\"]", description = "Campaign ID for engagement audience filter.")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"687201361754\"]", description = "Ad ID for engagement audience filter.")
    @get:JsonProperty("ad_id") val adId: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "[\"AWARENESS\"]", description = "Objective for engagement audience filter.")
    @get:JsonProperty("objective_type") val objectiveType: kotlin.collections.List<ObjectiveType>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null
) {

}

