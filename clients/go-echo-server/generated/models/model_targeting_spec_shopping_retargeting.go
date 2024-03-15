package models

type TargetingSpecShoppingRetargeting struct {

	// Number of days ago to start lookback timeframe for dynamic retargeting
	LookbackWindow int32 `json:"lookback_window,omitempty"`

	// Event types to target for dynamic retargeting
	TagTypes []int32 `json:"tag_types,omitempty"`

	// Number of days ago to stop lookback timeframe for dynamic retargeting
	ExclusionWindow int32 `json:"exclusion_window,omitempty"`
}
