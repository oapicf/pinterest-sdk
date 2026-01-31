package models

type TargetingTemplateCreate struct {

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`

	// Name of targeting template.
	Name string `json:"name"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	TargetingAttributes TargetingSpec `json:"targeting_attributes"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`
}
