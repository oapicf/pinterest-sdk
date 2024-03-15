package models

type BidFloor struct {

	// A list of bid floors in micro currency. For example, [100000, 200000]
	BidFloors []int32 `json:"bid_floors,omitempty"`

	// Always the string 'bidfloor'
	Type string `json:"type,omitempty"`
}
