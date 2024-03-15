package models

type UserAccountFollowedInterests200Response struct {

	Items []Interest `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
