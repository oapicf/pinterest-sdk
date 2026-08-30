package models

type IngestionSource string

// List of IngestionSource
const (
	TAG IngestionSource = "TAG"
	MMP IngestionSource = "MMP"
	FILE_UPLOAD IngestionSource = "FILE_UPLOAD"
	CONVERSIONS_API IngestionSource = "CONVERSIONS_API"
	NATIVE IngestionSource = "NATIVE"
)
