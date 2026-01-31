package models
// LabelType : Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
type LabelType string

// List of LabelType
const (
	BRAND LabelType = "BRAND"
	CUSTOM LabelType = "CUSTOM"
)
