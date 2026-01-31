package models

type GetBusinessEmployers200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of employers.
	Items []UserBusinessRoleBinding `json:"items"`
}
