package models

type BidFloorRequest struct {

	BidFloorSpecs []BidFloorSpec `json:"bid_floor_specs"`

	TargetingSpec TargetingSpec `json:"targeting_spec,omitempty"`
}
