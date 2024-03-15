goog.provide('API.Client.AudienceRule');

/**
 * JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
 * @record
 */
API.Client.AudienceRule = function() {}

/**
 * Valid countries include: \"US\", \"CA\", and \"GB\".
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.country;

/**
 * Customer list ID. For CUSTOMER_LIST `audience_type`.
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.customerListId;

/**
 * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.engagementDomain;

/**
 * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.engagementType;

/**
 * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.event;

/**
 * @type {!API.Client.PinterestTagEventData}
 * @export
 */
API.Client.AudienceRule.prototype.eventData;

/**
 * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
 * @type {!number}
 * @export
 */
API.Client.AudienceRule.prototype.percentage;

/**
 * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.pinId;

/**
 * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
 * @type {!boolean}
 * @export
 */
API.Client.AudienceRule.prototype.prefill;

/**
 * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
 * @type {!number}
 * @export
 */
API.Client.AudienceRule.prototype.retentionDays;

/**
 * Audience ID(s). For ACTALIKE `audience_type`. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.seedId;

/**
 * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.url;

/**
 * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.visitorSourceId;

/**
 * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AudienceRule.prototype.eventSource;

/**
 * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AudienceRule.prototype.ingestionSource;

/**
 * Optional for ENGAGEMENT. Engager type value should be 1-2.
 * @type {!number}
 * @export
 */
API.Client.AudienceRule.prototype.engagerType;

/**
 * Campaign ID for engagement audience filter.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.campaignId;

/**
 * Ad ID for engagement audience filter.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AudienceRule.prototype.adId;

/**
 * Objective for engagement audience filter.
 * @type {!Array<!API.Client.ObjectiveType>}
 * @export
 */
API.Client.AudienceRule.prototype.objectiveType;

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceRule.prototype.adAccountId;

