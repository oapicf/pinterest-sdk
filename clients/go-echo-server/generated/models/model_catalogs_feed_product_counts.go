package models

// CatalogsFeedProductCounts - The counts can be null early in the process.
type CatalogsFeedProductCounts struct {

	// The number of products in the feed file
	Original int32 `json:"original,omitempty"`
}
