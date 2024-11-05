package models

type TargetingTypeFilter struct {

	// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	TargetingTypes []AdsAnalyticsTargetingType `json:"targeting_types,omitempty"`
}
