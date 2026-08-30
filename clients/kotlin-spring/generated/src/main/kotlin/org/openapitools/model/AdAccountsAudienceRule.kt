package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AudienceObjectiveType
import org.openapitools.model.EventData
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
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 * @param adAccountId Ad account ID.
 * @param adId Ad ID for engagement audience filter.
 * @param campaignId Campaign ID for engagement audience filter.
 * @param country Valid countries include: \"US\", \"CA\", and \"GB\".
 * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`.
 * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
 * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
 * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2.
 * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
 * @param eventData 
 * @param eventSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
 * @param ingestionSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
 * @param objectiveType Objective for engagement audience filter.
 * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
 * @param pinId IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
 * @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
 * @param retentionDays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
 * @param seedId Audience ID(s). For ACTALIKE `audience_type`.
 * @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
 * @param visitorSourceId The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
 */
data class AdAccountsAudienceRule(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Ad account ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "Ad ID for engagement audience filter.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_id")
    @get:JsonProperty("ad_id") val adId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Campaign ID for engagement audience filter.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_id")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Valid countries include: \"US\", \"CA\", and \"GB\".")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Customer list ID. For CUSTOMER_LIST `audience_type`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customer_list_id")
    @get:JsonProperty("customer_list_id") val customerListId: kotlin.String? = null,

    @Schema(description = "The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engagement_domain")
    @get:JsonProperty("engagement_domain") val engagementDomain: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engagement_type")
    @get:JsonProperty("engagement_type") val engagementType: kotlin.String? = null,

    @Schema(description = "Optional for ENGAGEMENT. Engager type value should be 1-2.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engager_type")
    @get:JsonProperty("engager_type") val engagerType: kotlin.Int? = null,

    @Schema(description = "A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event")
    @get:JsonProperty("event") val event: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event_data")
    @get:JsonProperty("event_data") val eventData: EventData? = null,

    @field:Valid
    @Schema(description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event_source")
    @get:JsonProperty("event_source") val eventSource: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ingestion_source")
    @get:JsonProperty("ingestion_source") val ingestionSource: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "Objective for engagement audience filter.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type") val objectiveType: kotlin.collections.List<AudienceObjectiveType>? = null,

    @Schema(description = "Percentage should be 1-10. The targeted audience should be this % size across Pinterest.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("percentage")
    @get:JsonProperty("percentage") val percentage: kotlin.Int? = null,

    @Schema(description = "IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id") val pinId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("prefill")
    @get:JsonProperty("prefill") val prefill: kotlin.Boolean? = null,

    @Schema(description = "Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("retention_days")
    @get:JsonProperty("retention_days") val retentionDays: kotlin.Int? = null,

    @Schema(description = "Audience ID(s). For ACTALIKE `audience_type`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("seed_id")
    @get:JsonProperty("seed_id") val seedId: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("visitor_source_id")
    @get:JsonProperty("visitor_source_id") val visitorSourceId: kotlin.String? = null
) {

}

