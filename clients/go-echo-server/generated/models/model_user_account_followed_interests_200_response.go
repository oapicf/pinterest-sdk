package models

type UserAccountFollowedInterests200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Interest `json:"items"`
}
