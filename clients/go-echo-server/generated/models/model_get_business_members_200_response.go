package models

type GetBusinessMembers200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of business members.
	Items []UserBusinessRoleBinding `json:"items"`
}
