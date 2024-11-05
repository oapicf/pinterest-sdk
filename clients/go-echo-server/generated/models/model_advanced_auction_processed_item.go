package models

// AdvancedAuctionProcessedItem - Object describing the result of an operation on an item bid option
type AdvancedAuctionProcessedItem struct {

	// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	Errors []AdvancedAuctionOperationError `json:"errors,omitempty"`
}
