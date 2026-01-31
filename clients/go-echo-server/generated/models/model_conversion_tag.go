package models

type ConversionTag struct {

	// Tag code snippet.
	CodeSnippet string `json:"code_snippet,omitempty"`

	Configs ConversionTagConfigs `json:"configs,omitempty"`

	// The enhanced match status of the tag
	EnhancedMatchStatus *EnhancedMatchStatusType `json:"enhanced_match_status,omitempty"`

	// Tag ID.
	Id string `json:"id,omitempty"`

	// Time for the last event fired.
	LastFiredTimeMs *float32 `json:"last_fired_time_ms,omitempty"`

	// Conversion tag name.
	Name string `json:"name"`

	// Version number.
	Version string `json:"version,omitempty"`

	// Ad account ID.
	AdAccountId string `json:"ad_account_id"`

	Status EntityStatus `json:"status,omitempty"`
}
