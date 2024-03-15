package models

type AdGroupAudienceSizingRequestKeywordsInner struct {

	MatchType *MatchTypeResponse `json:"match_type"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
