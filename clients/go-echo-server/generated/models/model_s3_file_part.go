package models

type S3FilePart struct {

	// Part number for upload.
	PartNumber int32 `json:"part_number"`

	// Pre-signed URL.
	PresignedUrl string `json:"presigned_url"`
}
