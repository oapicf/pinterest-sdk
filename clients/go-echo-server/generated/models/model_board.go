package models

import (
	"time"
)

// Board - Board
type Board struct {

	Id string `json:"id,omitempty"`

	// Date and time of board creation.
	CreatedAt time.Time `json:"created_at,omitempty"`

	// Date and time of last board pins modified.
	BoardPinsModifiedAt time.Time `json:"board_pins_modified_at,omitempty"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	// Count of collaborators on the board.
	CollaboratorCount int32 `json:"collaborator_count,omitempty"`

	// Count of pins on the board.
	PinCount int32 `json:"pin_count,omitempty"`

	// Board follower count.
	FollowerCount int32 `json:"follower_count,omitempty"`

	Media BoardMedia `json:"media,omitempty"`

	Owner BoardOwner `json:"owner,omitempty"`

	// Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	Privacy string `json:"privacy,omitempty"`
}
