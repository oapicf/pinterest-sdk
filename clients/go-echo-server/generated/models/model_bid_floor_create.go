package models

// BidFloorCreate - Resource create operation model.
type BidFloorCreate struct {

	// List of bid floor specifications.
	BidFloorSpecs []BidFloorSpec `json:"bid_floor_specs"`

	// Ad group targeting specification defining the ad group target audience.
	TargetingSpec TargetingSpecOptimal `json:"targeting_spec,omitempty"`
}
