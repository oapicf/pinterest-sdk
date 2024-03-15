package models

type TargetingTypeFilter struct {

	// List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	TargetingTypes []AdsAnalyticsTargetingType `json:"targeting_types,omitempty"`
}
