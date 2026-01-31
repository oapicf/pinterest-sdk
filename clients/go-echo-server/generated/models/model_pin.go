package models

import (
	"time"
)

// Pin - Pin model containing properties related to a Pinterest Pin.
type Pin struct {

	AltText *string `json:"alt_text,omitempty"`

	// The board to which this Pin belongs.
	BoardId string `json:"board_id,omitempty" validate:"regexp=^\\\\d+$"`

	BoardOwner BoardOwner `json:"board_owner,omitempty"`

	// The board section to which this Pin belongs.
	BoardSectionId *string `json:"board_section_id,omitempty" validate:"regexp=^\\\\d+$"`

	CreatedAt time.Time `json:"created_at,omitempty"`

	CreativeType *CreativeType `json:"creative_type,omitempty"`

	Description *string `json:"description,omitempty"`

	// Dominant pin color. Hex number, e.g. `#6E7874`.
	DominantColor *string `json:"dominant_color,omitempty"`

	// Whether the Pin has been promoted or not.
	HasBeenPromoted bool `json:"has_been_promoted,omitempty"`

	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// Whether the \"operation user_account\" is the Pin owner.
	IsOwner bool `json:"is_owner,omitempty"`

	// Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
	IsStandard bool `json:"is_standard,omitempty"`

	Link *string `json:"link,omitempty"`

	Media PinMedia `json:"media,omitempty"`

	// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	ParentPinId *string `json:"parent_pin_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Pin metrics with associated time intervals if any.
	PinMetrics *map[string]interface{} `json:"pin_metrics,omitempty"`

	Title *string `json:"title,omitempty"`
}
