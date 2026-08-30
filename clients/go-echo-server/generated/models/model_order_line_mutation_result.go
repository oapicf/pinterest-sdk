package models

type OrderLineMutationResult struct {

	// Error list if update(s) fail.
	Errors []OrderLineMutationError `json:"errors,omitempty"`

	// Order Line object array.
	OrderLine []OrderLine `json:"order_line,omitempty"`
}
