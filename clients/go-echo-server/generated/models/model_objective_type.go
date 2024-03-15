package models
// ObjectiveType : Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] in BETA. For update, only draft campaigns may update objective type.
type ObjectiveType string

// List of ObjectiveType
const (
	AWARENESS ObjectiveType = "AWARENESS"
	CONSIDERATION ObjectiveType = "CONSIDERATION"
	VIDEO_VIEW ObjectiveType = "VIDEO_VIEW"
	WEB_CONVERSION ObjectiveType = "WEB_CONVERSION"
	CATALOG_SALES ObjectiveType = "CATALOG_SALES"
	WEB_SESSIONS ObjectiveType = "WEB_SESSIONS"
)
