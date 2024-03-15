package models

type PinMediaSourceImagesBase64ItemsInner struct {

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	// Destination link for the image.
	Link string `json:"link,omitempty"`

	ContentType string `json:"content_type"`

	// Image to upload as base64 string.
	Data string `json:"data"`
}
