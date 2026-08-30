package model

import play.api.libs.json._

/**
  * JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}  ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
  * @param adAccountId Ad account ID.
  * @param adId Ad ID for engagement audience filter.
  * @param campaignId Campaign ID for engagement audience filter.
  * @param country Valid countries include: \"US\", \"CA\", and \"GB\".
  * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`.
  * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
  * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2.
  * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AudienceRule(
  adAccountId: Option[String],
  adId: Option[List[String]],
  campaignId: Option[List[String]],
  country: Option[String],
  customerListId: Option[String],
  engagementDomain: Option[List[String]],
  engagementType: Option[String],
  engagerType: Option[Int],
  event: Option[String],
  eventData: Option[EventData],
  eventSource: Option[JsObject],
  ingestionSource: Option[JsObject],
  objectiveType: Option[List[ObjectiveType]],
  percentage: Option[Int],
  pinId: Option[List[String]],
  prefill: Option[Boolean],
  retentionDays: Option[Int],
  seedId: Option[List[String]],
  url: Option[List[String]],
  visitorSourceId: Option[String]
)

object AudienceRule {
  implicit lazy val audienceRuleJsonFormat: Format[AudienceRule] = Json.format[AudienceRule]
}

