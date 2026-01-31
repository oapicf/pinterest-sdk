package models

type PinMediaSourceImagesBase64Item struct {

	ContentType ContentType `json:"content_type"`

	Data string `json:"data" validate:"regexp=^[a-zA-Z0-9+\\/=]+$"`

	Description string `json:"description,omitempty"`

	Link string `json:"link,omitempty"`

	Title string `json:"title,omitempty"`
}
