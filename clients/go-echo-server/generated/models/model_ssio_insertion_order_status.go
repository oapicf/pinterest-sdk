package models

// SsioInsertionOrderStatus - SSIO insertion order status item in a list response.
type SsioInsertionOrderStatus struct {

	// Salesforce insertion order creation time
	CreationTime *string `json:"creation_time,omitempty"`

	// Salesforce order id
	PinOrderId string `json:"pin_order_id,omitempty"`

	// Salesforce insertion order status
	Status string `json:"status,omitempty"`
}
