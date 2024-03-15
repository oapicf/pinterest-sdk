package org.openapitools.server.model


/**
 * = Rule =
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
 *
 * @param country Valid countries include: \"US\", \"CA\", and \"GB\". for example: ''US''
 * @param customerListId Customer list ID. For CUSTOMER_LIST `audience_type`. for example: ''5497558859876''
 * @param engagementDomain The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. for example: ''["www.somedomain.com"]''
 * @param engagementType Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  for example: ''click''
 * @param event A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. for example: ''checkout''
 * @param eventData  for example: ''null''
 * @param percentage Percentage should be 1-10. The targeted audience should be this % size across Pinterest. for example: ''3''
 * @param pinId IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] for example: ''["34567"]''
 * @param prefill Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. for example: ''true''
 * @param retentionDays Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. for example: ''30''
 * @param seedId Audience ID(s). For ACTALIKE `audience_type`.  for example: ''["2542620639259","2542620639261"]''
 * @param url Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} for example: ''null''
 * @param visitorSourceId The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. for example: ''549755885175''
 * @param eventSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline for example: ''{"=":["web","mobile"]}''
 * @param ingestionSource Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api for example: ''{"=":["tag"]}''
 * @param engagerType Optional for ENGAGEMENT. Engager type value should be 1-2. for example: ''1''
 * @param campaignId Campaign ID for engagement audience filter. for example: ''["626744528398"]''
 * @param adId Ad ID for engagement audience filter. for example: ''["687201361754"]''
 * @param objectiveType Objective for engagement audience filter. for example: ''["AWARENESS"]''
 * @param adAccountId Ad account ID. for example: ''549755885175''
*/
final case class AudienceRule (
  country: Option[String] = None,
  customerListId: Option[String] = None,
  engagementDomain: Option[Seq[String]] = None,
  engagementType: Option[String] = None,
  event: Option[String] = None,
  eventData: Option[PinterestTagEventData] = None,
  percentage: Option[Int] = None,
  pinId: Option[Seq[String]] = None,
  prefill: Option[Boolean] = None,
  retentionDays: Option[Int] = None,
  seedId: Option[Seq[String]] = None,
  url: Option[Seq[String]] = None,
  visitorSourceId: Option[String] = None,
  eventSource: Option[Any] = None,
  ingestionSource: Option[Any] = None,
  engagerType: Option[Int] = None,
  campaignId: Option[Seq[String]] = None,
  adId: Option[Seq[String]] = None,
  objectiveType: Option[Seq[ObjectiveType]] = None,
  adAccountId: Option[String] = None
)

