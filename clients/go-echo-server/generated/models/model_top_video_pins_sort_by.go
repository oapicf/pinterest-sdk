package models
// TopVideoPinsSortBy : Sort metric for top video pins analytics.
type TopVideoPinsSortBy string

// List of TopVideoPinsSortBy
const (
	SAVE TopVideoPinsSortBy = "SAVE"
	IMPRESSION TopVideoPinsSortBy = "IMPRESSION"
	OUTBOUND_CLICK TopVideoPinsSortBy = "OUTBOUND_CLICK"
	VIDEO_MRC_VIEW TopVideoPinsSortBy = "VIDEO_MRC_VIEW"
	VIDEO_AVG_WATCH_TIME TopVideoPinsSortBy = "VIDEO_AVG_WATCH_TIME"
	VIDEO_V50_WATCH_TIME TopVideoPinsSortBy = "VIDEO_V50_WATCH_TIME"
	QUARTILE_95_PERCENT_VIEW TopVideoPinsSortBy = "QUARTILE_95_PERCENT_VIEW"
	VIDEO_10_S_VIEW TopVideoPinsSortBy = "VIDEO_10S_VIEW"
	VIDEO_START TopVideoPinsSortBy = "VIDEO_START"
)
