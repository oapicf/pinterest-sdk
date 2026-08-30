package models

type DynamicTitlesGetStatus struct {

	// The count of generated titles.
	GeneratedCount int32 `json:"generated_count,omitempty"`

	// Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
	IsReady bool `json:"is_ready,omitempty"`

	// The count of advertiser reviewed titles.
	ReviewedCount int32 `json:"reviewed_count,omitempty"`
}
