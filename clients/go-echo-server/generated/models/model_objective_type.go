package models
// ObjectiveType : Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
type ObjectiveType string

// List of ObjectiveType
const (
	AWARENESS ObjectiveType = "AWARENESS"
	CONSIDERATION ObjectiveType = "CONSIDERATION"
	WEB_CONVERSION ObjectiveType = "WEB_CONVERSION"
	CATALOG_SALES ObjectiveType = "CATALOG_SALES"
	VIDEO_COMPLETION ObjectiveType = "VIDEO_COMPLETION"
	SALES ObjectiveType = "SALES"
	APP_INSTALL ObjectiveType = "APP_INSTALL"
	CTV_CONSIDERATION ObjectiveType = "CTV_CONSIDERATION"
)
