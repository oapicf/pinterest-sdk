package models

// TotalCountByEntityStatus - Breakdown of asset counts by entity status.
type TotalCountByEntityStatus struct {

	// Count of ACTIVE assets
	ACTIVE int32 `json:"ACTIVE,omitempty"`

	// Count of ARCHIVED assets
	ARCHIVED int32 `json:"ARCHIVED,omitempty"`

	// Count of PAUSED assets
	PAUSED int32 `json:"PAUSED,omitempty"`
}
