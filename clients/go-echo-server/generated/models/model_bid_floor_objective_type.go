package models
// BidFloorObjectiveType : Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
type BidFloorObjectiveType string

// List of BidFloorObjectiveType
const (
	AWARENESS BidFloorObjectiveType = "AWARENESS"
	CONSIDERATION BidFloorObjectiveType = "CONSIDERATION"
	WEB_CONVERSION BidFloorObjectiveType = "WEB_CONVERSION"
	CATALOG_SALES BidFloorObjectiveType = "CATALOG_SALES"
	VIDEO_COMPLETION BidFloorObjectiveType = "VIDEO_COMPLETION"
	SALES BidFloorObjectiveType = "SALES"
)
