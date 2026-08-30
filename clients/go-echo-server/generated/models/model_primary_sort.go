package models
// PrimarySort : Whether to first sort the report by date or by ID
type PrimarySort string

// List of PrimarySort
const (
	BY_ID PrimarySort = "BY_ID"
	BY_DATE PrimarySort = "BY_DATE"
)
