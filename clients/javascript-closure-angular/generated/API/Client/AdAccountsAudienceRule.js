goog.provide('API.Client.AdAccountsAudienceRule');

/**
 * JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \"customer_list_id\": \"<customer list ID>\"} ACTALIKE: { \"seed_id\": [\"<audience ID>\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \"visitor_source_id\": [\"<conversion tag ID>\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
 * @record
 */
API.Client.AdAccountsAudienceRule = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.adAccountId;

/**
 * Ad ID for engagement audience filter.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.adId;

/**
 * Campaign ID for engagement audience filter.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.campaignId;

/**
 * Valid countries include: \"US\", \"CA\", and \"GB\".
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.country;

/**
 * Customer list ID. For CUSTOMER_LIST `audience_type`.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.customerListId;

/**
 * The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.engagementDomain;

/**
 * Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.engagementType;

/**
 * Optional for ENGAGEMENT. Engager type value should be 1-2.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.engagerType;

/**
 * A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.event;

/**
 * @type {!API.Client.EventData}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.eventData;

/**
 * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.eventSource;

/**
 * Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.ingestionSource;

/**
 * Objective for engagement audience filter.
 * @type {!Array<!API.Client.AudienceObjectiveType>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.objectiveType;

/**
 * Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.percentage;

/**
 * IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.pinId;

/**
 * Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
 * @type {!boolean}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.prefill;

/**
 * Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.retentionDays;

/**
 * Audience ID(s). For ACTALIKE `audience_type`.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.seedId;

/**
 * Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.url;

/**
 * The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceRule.prototype.visitorSourceId;

