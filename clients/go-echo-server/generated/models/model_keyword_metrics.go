package models

// KeywordMetrics - Keyword metrics JSON
type KeywordMetrics struct {

	// Keyword's search frequency. This value is based on keyword frequency in pepsi client response
	KeywordQueryVolume string `json:"keyword_query_volume,omitempty"`
}
