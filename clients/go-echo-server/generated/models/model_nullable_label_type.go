package models
// NullableLabelType : Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
type NullableLabelType string

// List of NullableLabelType
const (
	BRAND NullableLabelType = "BRAND"
	CUSTOM NullableLabelType = "CUSTOM"
)
