package models
// BudgetDurationType : Budget duration type for delivery estimates.
type BudgetDurationType string

// List of BudgetDurationType
const (
	FIXED_DAILY BudgetDurationType = "FIXED_DAILY"
	FLEXIBLE_DAILY BudgetDurationType = "FLEXIBLE_DAILY"
	LIFETIME BudgetDurationType = "LIFETIME"
)
