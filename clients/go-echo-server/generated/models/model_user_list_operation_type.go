package models
// UserListOperationType : User list operation type (add or remove)
type UserListOperationType string

// List of UserListOperationType
const (
	ADD UserListOperationType = "ADD"
	REMOVE UserListOperationType = "REMOVE"
)
