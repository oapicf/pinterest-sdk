package models

type TargetingTemplateCommon struct {

	// targeting template name
	Name string `json:"name,omitempty"`

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	TargetingAttributes TargetingSpec `json:"targeting_attributes,omitempty"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`
}
