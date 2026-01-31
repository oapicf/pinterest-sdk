package models
// DisclosureType : Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
type DisclosureType string

// List of DisclosureType
const (
	NO_DISCLOSURE DisclosureType = "NO_DISCLOSURE"
	PRESCRIBING_INFORMATION DisclosureType = "PRESCRIBING_INFORMATION"
	PRESCRIBING_INFORMATION_BOX_WARNING DisclosureType = "PRESCRIBING_INFORMATION_BOX_WARNING"
	IMPORTANT_SAFETY_INFO DisclosureType = "IMPORTANT_SAFETY_INFO"
	MED_GUIDE DisclosureType = "MED_GUIDE"
	PATIENT_INFORMATION DisclosureType = "PATIENT_INFORMATION"
)
