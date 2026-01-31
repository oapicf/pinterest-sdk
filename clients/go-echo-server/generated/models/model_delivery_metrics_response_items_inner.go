package models

type DeliveryMetricsResponseItemsInner struct {

	// Category name
	Category string `json:"category,omitempty"`

	// How the metric is defined.
	Definition string `json:"definition,omitempty"`

	// Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
	DisplayName string `json:"display_name,omitempty"`

	// Metric's name.
	Name string `json:"name,omitempty"`
}
