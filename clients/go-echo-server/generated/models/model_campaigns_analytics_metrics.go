package models

type CampaignsAnalyticsMetrics struct {

	// The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
	CAMPAIGN_ID string `json:"CAMPAIGN_ID,omitempty" validate:"regexp=^\\d+$"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
