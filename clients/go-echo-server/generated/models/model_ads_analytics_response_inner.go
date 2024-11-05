package models

type AdsAnalyticsResponseInner struct {

	// The ID of the ad that this metrics belongs to.
	AD_ID string `json:"AD_ID" validate:"regexp=^\\\\d+$"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
