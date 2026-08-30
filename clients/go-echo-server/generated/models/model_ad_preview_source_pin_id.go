package models

// AdPreviewSourcePinId - Ad preview source from an existing Pin.
type AdPreviewSourcePinId struct {

	// Creative type of the ad preview.
	CreativeType AdPinPreviewCreativeType `json:"creative_type,omitempty"`

	// Pin ID.
	PinId string `json:"pin_id"`
}
