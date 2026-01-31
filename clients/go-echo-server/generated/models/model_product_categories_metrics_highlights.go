package models

// ProductCategoriesMetricsHighlights - Key performance metrics highlights for this product category
type ProductCategoriesMetricsHighlights struct {

	// Engagement metric value
	Engagement InnerProductCategoriesMetricsHighlights `json:"engagement,omitempty"`

	// Number of outbound clicks
	OutboundClicks InnerProductCategoriesMetricsHighlights `json:"outbound_clicks,omitempty"`

	// Number of pin saves
	PinSaves InnerProductCategoriesMetricsHighlights `json:"pin_saves,omitempty"`
}
