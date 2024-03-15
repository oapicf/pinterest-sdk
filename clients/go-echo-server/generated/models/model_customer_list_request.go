package models

type CustomerListRequest struct {

	// Customer list name.
	Name string `json:"name"`

	// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	Records string `json:"records"`

	ListType UserListType `json:"list_type,omitempty"`

	// Customer list errors.
	Exceptions map[string]interface{} `json:"exceptions,omitempty"`
}
