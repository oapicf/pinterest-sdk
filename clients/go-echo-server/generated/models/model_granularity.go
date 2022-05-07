package models

type Granularity string

// List of Granularity
const (
	TOTAL Granularity = "TOTAL"
	DAY Granularity = "DAY"
	HOUR Granularity = "HOUR"
	WEEK Granularity = "WEEK"
	MONTH Granularity = "MONTH"
)
