package models

type CatalogsFeedProcessingStatus string

// List of CatalogsFeedProcessingStatus
const (
	COMPLETED CatalogsFeedProcessingStatus = "COMPLETED"
	FAILED CatalogsFeedProcessingStatus = "FAILED"
	PROCESSING CatalogsFeedProcessingStatus = "PROCESSING"
)
