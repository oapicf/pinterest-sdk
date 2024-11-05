package models

type PinsSaveRequest struct {

	// Unique identifier of the board to which the pin will be saved.
	BoardId *string `json:"board_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the board section to which the pin will be saved.
	BoardSectionId *string `json:"board_section_id,omitempty" validate:"regexp=^\\\\d+$"`
}
