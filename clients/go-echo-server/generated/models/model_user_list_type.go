package models
// UserListType : User list type
type UserListType string

// List of UserListType
const (
	EMAIL UserListType = "EMAIL"
	IDFA UserListType = "IDFA"
	MAID UserListType = "MAID"
	LR_ID UserListType = "LR_ID"
	DLX_ID UserListType = "DLX_ID"
	HASHED_PINNER_ID UserListType = "HASHED_PINNER_ID"
)
