package models

type GetBusinessPartners200Response struct {

	// List of business partners.
	Items []UserBusinessRoleBinding `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
