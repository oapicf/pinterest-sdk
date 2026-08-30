package models

type GetBusinessEmployers200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []UserBusinessRoleBinding `json:"items"`
}
