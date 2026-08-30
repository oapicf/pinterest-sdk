package models
// NullalbleMatchType : Keyword match type allowing null
type NullalbleMatchType string

// List of NullalbleMatchType
const (
	BROAD NullalbleMatchType = "BROAD"
	PHRASE NullalbleMatchType = "PHRASE"
	EXACT NullalbleMatchType = "EXACT"
	EXACT_NEGATIVE NullalbleMatchType = "EXACT_NEGATIVE"
	PHRASE_NEGATIVE NullalbleMatchType = "PHRASE_NEGATIVE"
)
