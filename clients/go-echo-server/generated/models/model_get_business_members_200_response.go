package models

type GetBusinessMembers200Response struct {

	// List of business members.
	Items []UserBusinessRoleBinding `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
