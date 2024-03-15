package models

// OrderLines - Order Line
type OrderLines struct {

	// Order line ID.
	Id string `json:"id,omitempty"`

	// Always \"orderline\".
	Type string `json:"type,omitempty"`

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Purchase order ID.
	PurchaseOrderId *string `json:"purchase_order_id,omitempty"`

	// Start time. Unix timestamp.
	StartTime float32 `json:"start_time,omitempty"`

	// End time. Unix timestamp.
	EndTime *float32 `json:"end_time,omitempty"`

	// Order line budget in micro currency.
	Budget *float32 `json:"budget,omitempty"`

	// Order line paid budget in micro currency.
	PaidBudget *float32 `json:"paid_budget,omitempty"`

	// Order line status.
	Status OrderLineStatus `json:"status,omitempty"`

	// Order line name.
	Name *string `json:"name,omitempty"`

	// Order line paid type.
	PaidType *OrderLinePaidType `json:"paid_type,omitempty"`
}
