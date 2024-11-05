package models

type AdAccountAnalyticsResponseInner struct {

	// The ID of the advertiser that this metrics belongs to.
	AD_ACCOUNT_ID string `json:"AD_ACCOUNT_ID" validate:"regexp=^\\\\d+$"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
