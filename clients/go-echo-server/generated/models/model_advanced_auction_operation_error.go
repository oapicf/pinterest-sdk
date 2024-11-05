package models

// AdvancedAuctionOperationError - Error which occurred when applying a bid options operation to a specific item.
type AdvancedAuctionOperationError struct {

	// The error code for the item bid option operation validation error
	Code int32 `json:"code,omitempty"`

	// Message describing the item bid option operation validation error
	Message string `json:"message,omitempty"`
}
