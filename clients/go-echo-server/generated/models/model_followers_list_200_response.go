package models

type FollowersList200Response struct {

	Items []UserSummary `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
