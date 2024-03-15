package models

type KeywordMetricsResponse struct {

	// Keyword name, e.g., \"keyword\":\"fashion outfits\"
	Keyword string `json:"keyword,omitempty"`

	Metrics KeywordMetrics `json:"metrics,omitempty"`
}
