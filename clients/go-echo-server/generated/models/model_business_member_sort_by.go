package models
// BusinessMemberSortBy : The name of field that businesses are sorted by
type BusinessMemberSortBy string

// List of BusinessMemberSortBy
const (
	FULL_NAME BusinessMemberSortBy = "FULL_NAME"
	BUSINESS_ROLES BusinessMemberSortBy = "BUSINESS_ROLES"
	CREATED_TIME BusinessMemberSortBy = "CREATED_TIME"
)
