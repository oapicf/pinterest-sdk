package models

// ProductTagItem - Product tag request item containing the pin_id of the product to tag.
type ProductTagItem struct {

	// Pin ID of the product pin to tag onto the hero pin.
	PinId string `json:"pin_id" validate:"regexp=^\\d+$"`
}
