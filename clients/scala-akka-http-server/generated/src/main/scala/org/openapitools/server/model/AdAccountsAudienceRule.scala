package org.openapitools.server.model


/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 *
 * @param adAccountId Ad account ID. for example: ''null''
 * @param adId Ad ID for engagement audience filter. for example: ''null''
 * @param campaignId Campaign ID for engagement audience filter. for example: ''null''
 * @param country Valid countries include: \"US\", \"CA\", and \"GB\". for example: ''null''
 * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`. for example: ''null''
 * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. for example: ''null''
 * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. for example: ''null''
 * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2. for example: ''null''
 * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. for example: ''null''
 * @param eventData  for example: ''null''
 * @param eventSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline for example: ''null''
 * @param ingestionSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api for example: ''null''
 * @param objectiveType Objective for engagement audience filter. for example: ''null''
 * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest. for example: ''null''
 * @param pinId IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] for example: ''null''
 * @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. for example: ''null''
 * @param retentionDays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. for example: ''null''
 * @param seedId Audience ID(s). For ACTALIKE `audience_type`. for example: ''null''
 * @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} for example: ''null''
 * @param visitorSourceId The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. for example: ''null''
*/
final case class AdAccountsAudienceRule (
  adAccountId: Option[String] = None,
  adId: Option[Seq[String]] = None,
  campaignId: Option[Seq[String]] = None,
  country: Option[String] = None,
  customerListId: Option[String] = None,
  engagementDomain: Option[Seq[String]] = None,
  engagementType: Option[String] = None,
  engagerType: Option[Int] = None,
  event: Option[String] = None,
  eventData: Option[EventData] = None,
  eventSource: Option[Any] = None,
  ingestionSource: Option[Any] = None,
  objectiveType: Option[Seq[AudienceObjectiveType]] = None,
  percentage: Option[Int] = None,
  pinId: Option[Seq[String]] = None,
  prefill: Option[Boolean] = None,
  retentionDays: Option[Int] = None,
  seedId: Option[Seq[String]] = None,
  url: Option[Seq[String]] = None,
  visitorSourceId: Option[String] = None
)

