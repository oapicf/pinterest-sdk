package models
// PlacementType : Placement type for bid multiplier targeting.
type PlacementType string

// List of PlacementType
const (
	SEARCH PlacementType = "SEARCH"
	BROWSE PlacementType = "BROWSE"
	RELATED_PINS PlacementType = "RELATED_PINS"
)
