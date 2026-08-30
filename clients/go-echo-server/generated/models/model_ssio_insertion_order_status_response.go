package models

// SsioInsertionOrderStatusResponse - SSIO insertion order status response for a single pin order id lookup.
type SsioInsertionOrderStatusResponse struct {

	// Salesforce insertion order creation time
	CreationTime *string `json:"creation_time,omitempty"`

	// Salesforce order id
	PinOrderId string `json:"pin_order_id,omitempty"`

	// Salesforce insertion order status
	Status string `json:"status,omitempty"`
}
