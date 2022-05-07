package models

type CatalogsFeedProcessingStatus string

// List of CatalogsFeedProcessingStatus
const (
	COMPLETED CatalogsFeedProcessingStatus = "COMPLETED"
	COMPLETED_EARLY CatalogsFeedProcessingStatus = "COMPLETED_EARLY"
	DISAPPROVED CatalogsFeedProcessingStatus = "DISAPPROVED"
	FAILED CatalogsFeedProcessingStatus = "FAILED"
	PROCESSING CatalogsFeedProcessingStatus = "PROCESSING"
	QUEUED_FOR_PROCESSING CatalogsFeedProcessingStatus = "QUEUED_FOR_PROCESSING"
	UNDER_APPEAL CatalogsFeedProcessingStatus = "UNDER_APPEAL"
	UNDER_REVIEW CatalogsFeedProcessingStatus = "UNDER_REVIEW"
)
