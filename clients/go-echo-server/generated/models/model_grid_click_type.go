package models
// GridClickType : Where a user is taken after clicking on an ad in grid.
type GridClickType string

// List of GridClickType
const (
	CLOSEUP GridClickType = "CLOSEUP"
	DIRECT_TO_DESTINATION GridClickType = "DIRECT_TO_DESTINATION"
)
