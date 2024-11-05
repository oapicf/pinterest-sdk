package models

type GetBusinessEmployers200Response struct {

	// List of employers.
	Items []UserBusinessRoleBinding `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
