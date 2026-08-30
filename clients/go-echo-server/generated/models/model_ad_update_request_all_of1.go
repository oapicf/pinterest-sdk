package models

type AdUpdateRequestAllOf1 struct {

	// The ID of this ad.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Pin ID. This field may only be updated for draft ads.
	PinId *string `json:"pin_id,omitempty" validate:"regexp=^\\d+$"`
}
