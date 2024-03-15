package models

type SsioInsertionOrderStatusResponse struct {

	// Salesforce order id
	PinOrderId string `json:"pin_order_id,omitempty"`

	// Salesforce insertion order status
	Status string `json:"status,omitempty"`

	// Salesforce insertion order creation time
	CreationTime *string `json:"creation_time,omitempty"`
}
