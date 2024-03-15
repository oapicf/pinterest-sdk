package models

type TrendType string

// List of TrendType
const (
	GROWING TrendType = "growing"
	MONTHLY TrendType = "monthly"
	YEARLY TrendType = "yearly"
	SEASONAL TrendType = "seasonal"
)
