package models

type TargetingTemplateResponseData struct {

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`

	// targeting template name
	Name string `json:"name,omitempty"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	TargetingAttributes TargetingSpec `json:"targeting_attributes,omitempty"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`

	// The ID of the advertiser that this targeting template belongs to.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Targeting template created time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// Targeting template ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	Sizing *TargetingTemplateAudienceSizing `json:"sizing,omitempty"`

	// Indicate targeting template is active or Deleted
	Status string `json:"status,omitempty"`

	// Targeting template updated time.Unix timestamp in seconds.
	UpdatedTime int32 `json:"updated_time,omitempty"`
}
