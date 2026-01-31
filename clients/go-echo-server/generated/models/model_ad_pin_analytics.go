package models

type AdPinAnalytics struct {

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`

	// The ID of the pin that the metric belongs to.
	PIN_ID string `json:"PIN_ID" validate:"regexp=^\\\\d+$"`
}
