package models

// CatalogsFeedProductCounts - The counts can be null early in the process.
type CatalogsFeedProductCounts struct {

	// The number of products in the feed file.
	Original int32 `json:"original,omitempty"`

	// The number of products successfully ingested from the feed file.
	Ingested int32 `json:"ingested,omitempty"`
}
