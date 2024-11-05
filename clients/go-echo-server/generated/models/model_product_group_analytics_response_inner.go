package models

type ProductGroupAnalyticsResponseInner struct {

	// The ID of the product group that this metrics belongs to.
	PRODUCT_GROUP_ID string `json:"PRODUCT_GROUP_ID" validate:"regexp=^\\\\d+$"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}
