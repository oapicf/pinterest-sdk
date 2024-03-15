package models

type BoardsUserFollowsList200Response struct {

	Items []Board `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
