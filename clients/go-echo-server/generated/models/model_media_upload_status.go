package models
// MediaUploadStatus : Media upload status
type MediaUploadStatus string

// List of MediaUploadStatus
const (
	REGISTERED MediaUploadStatus = "registered"
	PROCESSING MediaUploadStatus = "processing"
	SUCCEEDED MediaUploadStatus = "succeeded"
	FAILED MediaUploadStatus = "failed"
)
