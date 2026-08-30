package models
// CustomerListStatus : Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
type CustomerListStatus string

// List of CustomerListStatus
const (
	PROCESSING CustomerListStatus = "PROCESSING"
	READY CustomerListStatus = "READY"
	TOO_SMALL CustomerListStatus = "TOO_SMALL"
	UPLOADING CustomerListStatus = "UPLOADING"
)
