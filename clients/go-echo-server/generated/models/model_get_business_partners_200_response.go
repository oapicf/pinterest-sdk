package models

type GetBusinessPartners200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of business partners.
	Items []UserBusinessRoleBinding `json:"items"`
}
