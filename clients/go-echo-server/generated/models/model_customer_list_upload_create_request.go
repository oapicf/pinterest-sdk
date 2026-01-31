package models

type CustomerListUploadCreateRequest struct {

	Operation UserListOperationType `json:"operation"`

	// Number of parts to upload the file in.
	TotalParts int32 `json:"total_parts"`
}
