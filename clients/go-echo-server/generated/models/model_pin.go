package models

import (
	"time"
)

// Pin - Pin
type Pin struct {

	Id string `json:"id,omitempty"`

	CreatedAt time.Time `json:"created_at,omitempty"`

	Link *string `json:"link,omitempty"`

	Title *string `json:"title,omitempty"`

	Description *string `json:"description,omitempty"`

	AltText *string `json:"alt_text,omitempty"`

	// The board to which this Pin belongs.
	BoardId string `json:"board_id,omitempty"`

	// The board section to which this Pin belongs.
	BoardSectionId *string `json:"board_section_id,omitempty"`

	BoardOwner BoardOwner `json:"board_owner,omitempty"`

	Media PinMedia `json:"media,omitempty"`

	MediaSource PinMediaSource `json:"media_source,omitempty"`
}
