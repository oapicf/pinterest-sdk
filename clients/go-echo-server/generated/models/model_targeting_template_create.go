package models

// TargetingTemplateCreate - Resource create operation model.
type TargetingTemplateCreate struct {

	// Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`

	// targeting template name
	Name string `json:"name"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	// targeting profile attributes
	TargetingAttributes TargetingSpecOptimal `json:"targeting_attributes"`

	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`
}
