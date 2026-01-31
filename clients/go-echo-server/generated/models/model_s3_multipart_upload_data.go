package models

type S3MultipartUploadData struct {

	// Array of file parts with pre-signed URLs.
	FileParts []S3FilePart `json:"file_parts,omitempty"`
}
