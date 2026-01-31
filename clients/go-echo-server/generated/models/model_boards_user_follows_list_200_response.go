package models

type BoardsUserFollowsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Board `json:"items"`
}
