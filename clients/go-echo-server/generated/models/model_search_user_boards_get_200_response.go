package models

type SearchUserBoardsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// items
	Items []Board `json:"items"`
}
