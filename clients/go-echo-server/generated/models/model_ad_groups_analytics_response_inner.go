package models

type AdGroupsAnalyticsResponseInner struct {

	// The ID of the ad group that this metrics belongs to.
	AD_GROUP_ID string `json:"AD_GROUP_ID"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
