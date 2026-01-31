package models
// ObjectiveType : Intended result of the campaign.  You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. 
type ObjectiveType string

// List of ObjectiveType
const (
	AWARENESS ObjectiveType = "AWARENESS"
	CONSIDERATION ObjectiveType = "CONSIDERATION"
	WEB_CONVERSION ObjectiveType = "WEB_CONVERSION"
	CATALOG_SALES ObjectiveType = "CATALOG_SALES"
	VIDEO_COMPLETION ObjectiveType = "VIDEO_COMPLETION"
)
