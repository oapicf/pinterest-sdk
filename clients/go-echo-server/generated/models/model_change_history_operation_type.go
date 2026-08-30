package models

type ChangeHistoryOperationType string

// List of ChangeHistoryOperationType
const (
	CREATE ChangeHistoryOperationType = "CREATE"
	UPDATE ChangeHistoryOperationType = "UPDATE"
	DELETE ChangeHistoryOperationType = "DELETE"
)
