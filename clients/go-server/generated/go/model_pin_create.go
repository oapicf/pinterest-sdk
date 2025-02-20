// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"time"
)



// PinCreate - Pin
type PinCreate struct {

	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	CreatedAt time.Time `json:"created_at,omitempty"`

	Link *string `json:"link,omitempty"`

	Title *string `json:"title,omitempty"`

	Description *string `json:"description,omitempty"`

	// Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
	DominantColor *string `json:"dominant_color,omitempty"`

	AltText *string `json:"alt_text,omitempty"`

	// The board to which this Pin belongs.
	BoardId string `json:"board_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The board section to which this Pin belongs.
	BoardSectionId *string `json:"board_section_id,omitempty" validate:"regexp=^\\\\d+$"`

	BoardOwner BoardOwner `json:"board_owner,omitempty"`

	Media PinMedia `json:"media,omitempty"`

	MediaSource PinMediaSource `json:"media_source,omitempty"`

	// The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	ParentPinId *string `json:"parent_pin_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	Note *string `json:"note,omitempty"`
}

// AssertPinCreateRequired checks if the required fields are not zero-ed
func AssertPinCreateRequired(obj PinCreate) error {
	if err := AssertBoardOwnerRequired(obj.BoardOwner); err != nil {
		return err
	}
	if err := AssertPinMediaRequired(obj.Media); err != nil {
		return err
	}
	if err := AssertPinMediaSourceRequired(obj.MediaSource); err != nil {
		return err
	}
	return nil
}

// AssertPinCreateConstraints checks if the values respects the defined constraints
func AssertPinCreateConstraints(obj PinCreate) error {
	if err := AssertBoardOwnerConstraints(obj.BoardOwner); err != nil {
		return err
	}
	if err := AssertPinMediaConstraints(obj.Media); err != nil {
		return err
	}
	if err := AssertPinMediaSourceConstraints(obj.MediaSource); err != nil {
		return err
	}
	return nil
}
