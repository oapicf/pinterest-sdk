package models

import (
	"time"
)

type Board struct {

	// Date and time of last board pins modified.
	BoardPinsModifiedAt time.Time `json:"board_pins_modified_at,omitempty"`

	// Count of collaborators on the board.
	CollaboratorCount int32 `json:"collaborator_count,omitempty"`

	// Date and time of board creation.
	CreatedAt time.Time `json:"created_at,omitempty"`

	Description *string `json:"description,omitempty"`

	// Board follower count.
	FollowerCount int32 `json:"follower_count,omitempty"`

	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// If set to `true`, the board will be ad-only and can store ad-only Pins.
	IsAdsOnly bool `json:"is_ads_only,omitempty"`

	// Board media.
	Media BoardMedia `json:"media,omitempty"`

	//      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	Name string `json:"name"`

	Owner BoardOwner `json:"owner,omitempty"`

	// Count of Pins on the board.
	PinCount int32 `json:"pin_count,omitempty"`

	//     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
	Privacy BoardPrivacy `json:"privacy,omitempty"`
}
