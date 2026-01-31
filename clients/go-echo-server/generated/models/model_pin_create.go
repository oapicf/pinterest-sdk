package models

// PinCreate - Resource create operation model.
type PinCreate struct {

	AltText *string `json:"alt_text,omitempty"`

	// The board to which this Pin belongs.
	BoardId string `json:"board_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The board section to which this Pin belongs.
	BoardSectionId *string `json:"board_section_id,omitempty" validate:"regexp=^\\\\d+$"`

	Description *string `json:"description,omitempty"`

	// Dominant pin color. Hex number, e.g. `#6E7874`.
	DominantColor *string `json:"dominant_color,omitempty"`

	Link *string `json:"link,omitempty"`

	MediaSource PinMediaSource `json:"media_source,omitempty"`

	// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	ParentPinId *string `json:"parent_pin_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
	SponsorId *string `json:"sponsor_id,omitempty" validate:"regexp=^\\\\d+$"`

	Title *string `json:"title,omitempty"`
}
