package models

type TargetingTemplateCommon struct {

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`

	// targeting template name
	Name string `json:"name,omitempty"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	TargetingAttributes TargetingSpec `json:"targeting_attributes,omitempty"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`
}
