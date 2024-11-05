package models
// OrderLinePaidType : Order Line Paid Type
type OrderLinePaidType string

// List of OrderLinePaidType
const (
	PAID OrderLinePaidType = "PAID"
	BONUS OrderLinePaidType = "BONUS"
	MAKE_GOOD OrderLinePaidType = "MAKE_GOOD"
	TEST OrderLinePaidType = "TEST"
)
