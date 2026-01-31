package models

// FeaturedTrend - Featured trending topics for a specific interest and market
type FeaturedTrend struct {

	// The main interest category
	Interest InterestsEnum `json:"interest"`

	// Market code (e.g., 'US', 'UK', etc.)
	Market ProductCategoryRegion `json:"market,omitempty"`

	// List of trending topics within this interest category
	Trends []TrendingTopic `json:"trends,omitempty"`
}
