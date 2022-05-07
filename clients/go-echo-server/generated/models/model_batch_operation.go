package models
// BatchOperation : The operation performed by the batch
type BatchOperation string

// List of BatchOperation
const (
	UPDATE BatchOperation = "UPDATE"
	CREATE BatchOperation = "CREATE"
	UPSERT BatchOperation = "UPSERT"
)
