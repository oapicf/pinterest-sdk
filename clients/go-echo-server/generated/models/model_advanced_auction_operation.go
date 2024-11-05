package models

type AdvancedAuctionOperation string

// List of AdvancedAuctionOperation
const (
	UPSERT AdvancedAuctionOperation = "UPSERT"
	DELETE AdvancedAuctionOperation = "DELETE"
)
