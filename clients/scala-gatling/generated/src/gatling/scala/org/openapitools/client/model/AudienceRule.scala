
package org.openapitools.client.model


case class AudienceRule (
    /* Valid countries include: \"US\", \"CA\", and \"GB\". */
    _country: Option[String],
    /* Customer list ID. For CUSTOMER_LIST `audience_type`. */
    _customerListId: Option[String],
    /* The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. */
    _engagementDomain: Option[List[String]],
    /* Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  */
    _engagementType: Option[String],
    /* A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. */
    _event: Option[String],
    _eventData: Option[PinterestTagEventData],
    /* Percentage should be 1-10. The targeted audience should be this % size across Pinterest. */
    _percentage: Option[Integer],
    /* IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] */
    _pinId: Option[List[String]],
    /* Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. */
    _prefill: Option[Boolean],
    /* Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. */
    _retentionDays: Option[Integer],
    /* Audience ID(s). For ACTALIKE `audience_type`.  */
    _seedId: Option[List[String]],
    /* Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} */
    _url: Option[List[String]],
    /* The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. */
    _visitorSourceId: Option[String],
    /* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline */
    _eventSource: Option[Any],
    /* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api */
    _ingestionSource: Option[Any],
    /* Optional for ENGAGEMENT. Engager type value should be 1-2. */
    _engagerType: Option[Integer],
    /* Campaign ID for engagement audience filter. */
    _campaignId: Option[List[String]],
    /* Ad ID for engagement audience filter. */
    _adId: Option[List[String]],
    /* Objective for engagement audience filter. */
    _objectiveType: Option[List[ObjectiveType]],
    /* Ad account ID. */
    _adAccountId: Option[String]
)
object AudienceRule {
    def toStringBody(var_country: Object, var_customerListId: Object, var_engagementDomain: Object, var_engagementType: Object, var_event: Object, var_eventData: Object, var_percentage: Object, var_pinId: Object, var_prefill: Object, var_retentionDays: Object, var_seedId: Object, var_url: Object, var_visitorSourceId: Object, var_eventSource: Object, var_ingestionSource: Object, var_engagerType: Object, var_campaignId: Object, var_adId: Object, var_objectiveType: Object, var_adAccountId: Object) =
        s"""
        | {
        | "country":$var_country,"customerListId":$var_customerListId,"engagementDomain":$var_engagementDomain,"engagementType":$var_engagementType,"event":$var_event,"eventData":$var_eventData,"percentage":$var_percentage,"pinId":$var_pinId,"prefill":$var_prefill,"retentionDays":$var_retentionDays,"seedId":$var_seedId,"url":$var_url,"visitorSourceId":$var_visitorSourceId,"eventSource":$var_eventSource,"ingestionSource":$var_ingestionSource,"engagerType":$var_engagerType,"campaignId":$var_campaignId,"adId":$var_adId,"objectiveType":$var_objectiveType,"adAccountId":$var_adAccountId
        | }
        """.stripMargin
}
