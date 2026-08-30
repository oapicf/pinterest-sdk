package models
// ConversionObjectiveType : Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
type ConversionObjectiveType string

// List of ConversionObjectiveType
const (
	AWARENESS ConversionObjectiveType = "AWARENESS"
	CONSIDERATION ConversionObjectiveType = "CONSIDERATION"
	WEB_CONVERSION ConversionObjectiveType = "WEB_CONVERSION"
	CATALOG_SALES ConversionObjectiveType = "CATALOG_SALES"
	VIDEO_COMPLETION ConversionObjectiveType = "VIDEO_COMPLETION"
	APP_INSTALL ConversionObjectiveType = "APP_INSTALL"
	SALES ConversionObjectiveType = "SALES"
	LEADS ConversionObjectiveType = "LEADS"
	CTV_CONSIDERATION ConversionObjectiveType = "CTV_CONSIDERATION"
)
