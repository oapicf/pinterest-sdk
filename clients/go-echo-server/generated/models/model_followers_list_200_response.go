package models

type FollowersList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []FollowUser `json:"items"`
}
