package models

type CustomerListUpdateRequest struct {

	// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	Records string `json:"records"`

	OperationType UserListOperationType `json:"operation_type"`

	Exceptions Exception `json:"exceptions,omitempty"`
}
