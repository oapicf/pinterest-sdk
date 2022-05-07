package models

// Board - Board
type Board struct {

	Id string `json:"id,omitempty"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	Owner BoardOwner `json:"owner,omitempty"`

	// Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	Privacy string `json:"privacy,omitempty"`
}
