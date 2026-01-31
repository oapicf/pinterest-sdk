package models
// IngestionSourceOptions : List of ingestion sources for a conversion event.
type IngestionSourceOptions string

// List of IngestionSourceOptions
const (
	TAG IngestionSourceOptions = "TAG"
	MMP IngestionSourceOptions = "MMP"
	FILE_UPLOAD IngestionSourceOptions = "FILE_UPLOAD"
	CONVERSIONS_API IngestionSourceOptions = "CONVERSIONS_API"
	NATIVE IngestionSourceOptions = "NATIVE"
)
