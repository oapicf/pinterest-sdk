package models

type SearchUserBoardsGet200Response struct {

	// items
	Items []Board `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
