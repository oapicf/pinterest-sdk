package models
// PlacementTrafficType : A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
type PlacementTrafficType string

// List of PlacementTrafficType
const (
	ALL PlacementTrafficType = "ALL"
	TWO_COLUMN_FEED PlacementTrafficType = "TWO_COLUMN_FEED"
	FULLSCREEN_FEED PlacementTrafficType = "FULLSCREEN_FEED"
)
