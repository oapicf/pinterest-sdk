package models
// TrendsGenderFilter : Gender category for trends demographic distribution.
type TrendsGenderFilter string

// List of TrendsGenderFilter
const (
	MALE TrendsGenderFilter = "male"
	FEMALE TrendsGenderFilter = "female"
	UNKNOWN TrendsGenderFilter = "unknown"
)
