package models
// OperationType : Operation type to share a specific audience or revoke access to a previously shared audience
type OperationType string

// List of OperationType
const (
	SHARE OperationType = "SHARE"
	REVOKE OperationType = "REVOKE"
)
