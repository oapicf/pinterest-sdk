package models
// MatchTypeResponse : Keyword match type
type MatchTypeResponse string

// List of MatchTypeResponse
const (
	BROAD MatchTypeResponse = "BROAD"
	PHRASE MatchTypeResponse = "PHRASE"
	EXACT MatchTypeResponse = "EXACT"
	EXACT_NEGATIVE MatchTypeResponse = "EXACT_NEGATIVE"
	PHRASE_NEGATIVE MatchTypeResponse = "PHRASE_NEGATIVE"
)
