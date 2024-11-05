package models

// AudienceRule - JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
type AudienceRule struct {

	// Valid countries include: \"US\", \"CA\", and \"GB\".
	Country string `json:"country,omitempty"`

	// Customer list ID. For CUSTOMER_LIST `audience_type`.
	CustomerListId string `json:"customer_list_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
	EngagementDomain []string `json:"engagement_domain,omitempty"`

	// Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
	EngagementType string `json:"engagement_type,omitempty"`

	// A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
	Event string `json:"event,omitempty"`

	EventData PinterestTagEventData `json:"event_data,omitempty"`

	// Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
	Percentage int32 `json:"percentage,omitempty"`

	// IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
	PinId []string `json:"pin_id,omitempty"`

	// Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
	Prefill bool `json:"prefill,omitempty"`

	// Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
	RetentionDays int32 `json:"retention_days,omitempty"`

	// Audience ID(s). For ACTALIKE `audience_type`. 
	SeedId []string `json:"seed_id,omitempty"`

	// Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
	Url []string `json:"url,omitempty"`

	// The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
	VisitorSourceId string `json:"visitor_source_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
	EventSource map[string]interface{} `json:"event_source,omitempty"`

	// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
	IngestionSource map[string]interface{} `json:"ingestion_source,omitempty"`

	// Optional for ENGAGEMENT. Engager type value should be 1-2.
	EngagerType int32 `json:"engager_type,omitempty"`

	// Campaign ID for engagement audience filter.
	CampaignId []string `json:"campaign_id,omitempty"`

	// Ad ID for engagement audience filter.
	AdId []string `json:"ad_id,omitempty"`

	// Objective for engagement audience filter.
	ObjectiveType []ObjectiveType `json:"objective_type,omitempty"`

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`
}
