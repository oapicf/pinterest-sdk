package models
// BatchOperation : The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
type BatchOperation string

// List of BatchOperation
const (
	UPDATE BatchOperation = "UPDATE"
	UPSERT BatchOperation = "UPSERT"
	CREATE BatchOperation = "CREATE"
	DELETE_DISCONTINUED BatchOperation = "DELETE_DISCONTINUED"
	DELETE BatchOperation = "DELETE"
)
