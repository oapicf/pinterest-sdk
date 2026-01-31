package models

type FollowersList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []UserSummary `json:"items"`
}
