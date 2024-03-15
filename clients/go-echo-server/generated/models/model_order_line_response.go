package models

type OrderLineResponse struct {

	// Error list if update(s) fail.
	Errors []OrderLineError `json:"errors,omitempty"`

	// Order Line object array.
	OrderLine []OrderLine `json:"order_line,omitempty"`
}
