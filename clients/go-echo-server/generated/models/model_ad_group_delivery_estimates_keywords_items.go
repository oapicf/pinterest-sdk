package models

type AdGroupDeliveryEstimatesKeywordsItems struct {

	MatchType *NullalbleMatchType `json:"match_type"`

	// Keyword value (120 chars max).
	Value string `json:"value"`
}
