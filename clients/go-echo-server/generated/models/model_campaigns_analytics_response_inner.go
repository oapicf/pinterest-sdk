package models

type CampaignsAnalyticsResponseInner struct {

	// The ID of the campaing that this metrics belongs to.
	CAMPAIGN_ID string `json:"CAMPAIGN_ID"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
