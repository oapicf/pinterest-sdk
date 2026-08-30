package models

// TrendingTopic - Individual trending topic within an interest category
type TrendingTopic struct {

	// Description of the trending topic
	Description string `json:"description"`

	// Unique identifier for the trending topic
	Id string `json:"id"`

	// Month-over-month growth percentage
	PercentGrowthMom int32 `json:"percent_growth_mom,omitempty"`

	// Array of pin images related to this trend (up to 6)
	Pins []TrendingPin `json:"pins"`

	// List of related interest categories
	RelatedInterests []string `json:"related_interests"`

	// List of related search terms
	RelatedSearches []string `json:"related_searches"`

	// Time series data showing trend values over time, with dates as keys and values as numeric
	TimeSeries map[string]float32 `json:"time_series"`

	// Title of the trending topic
	Title string `json:"title"`
}
