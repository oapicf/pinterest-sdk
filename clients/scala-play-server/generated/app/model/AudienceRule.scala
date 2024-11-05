package model

import play.api.libs.json._

/**
  * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
  * @param country Valid countries include: \"US\", \"CA\", and \"GB\".
  * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`.
  * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
  * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceRule(
  country: Option[String],
  customerListId: Option[String],
  engagementDomain: Option[List[String]],
  engagementType: Option[String],
  event: Option[String],
  eventData: Option[PinterestTagEventData],
  percentage: Option[Int],
  pinId: Option[List[String]],
  prefill: Option[Boolean],
  retentionDays: Option[Int],
  seedId: Option[List[String]],
  url: Option[List[String]],
  visitorSourceId: Option[String],
  eventSource: Option[JsObject],
  ingestionSource: Option[JsObject],
  engagerType: Option[Int],
  campaignId: Option[List[String]],
  adId: Option[List[String]],
  objectiveType: Option[List[ObjectiveType]],
  adAccountId: Option[String]
)

object AudienceRule {
  implicit lazy val audienceRuleJsonFormat: Format[AudienceRule] = Json.format[AudienceRule]
}

