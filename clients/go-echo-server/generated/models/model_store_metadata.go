package models

// StoreMetadata - Store metadata for a specific store location
type StoreMetadata struct {

	// Geohash of the store location
	Geohash string `json:"geohash,omitempty"`

	// Geographic latitude coordinate of the store
	Latitude float64 `json:"latitude,omitempty"`

	// Geographic longitude coordinate of the store
	Longitude float64 `json:"longitude,omitempty"`

	// Merchant provided store code
	StoreCode string `json:"store_code"`

	// Internal store code
	StoreId string `json:"store_id"`

	// Store name
	StoreName string `json:"store_name,omitempty"`
}
