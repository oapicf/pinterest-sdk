package models
// Granularity : Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
type Granularity string

// List of Granularity
const (
	TOTAL Granularity = "TOTAL"
	DAY Granularity = "DAY"
	HOUR Granularity = "HOUR"
	WEEK Granularity = "WEEK"
	MONTH Granularity = "MONTH"
)
