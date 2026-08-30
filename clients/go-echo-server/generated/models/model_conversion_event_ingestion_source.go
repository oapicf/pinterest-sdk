package models
// ConversionEventIngestionSource : The source of conversion events ingestion
type ConversionEventIngestionSource string

// List of ConversionEventIngestionSource
const (
	TAG ConversionEventIngestionSource = "TAG"
	MMP ConversionEventIngestionSource = "MMP"
	FILE_UPLOAD ConversionEventIngestionSource = "FILE_UPLOAD"
	CONVERSIONS_API ConversionEventIngestionSource = "CONVERSIONS_API"
	NATIVE ConversionEventIngestionSource = "NATIVE"
)
