package models
// MatchType : Keyword match type
type MatchType string

// List of MatchType
const (
	BROAD MatchType = "BROAD"
	PHRASE MatchType = "PHRASE"
	EXACT MatchType = "EXACT"
	EXACT_NEGATIVE MatchType = "EXACT_NEGATIVE"
	PHRASE_NEGATIVE MatchType = "PHRASE_NEGATIVE"
)
