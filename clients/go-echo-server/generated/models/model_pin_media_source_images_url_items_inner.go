package models

type PinMediaSourceImagesUrlItemsInner struct {

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	// Destination link for the image.
	Link string `json:"link,omitempty"`

	// URL of image to upload.
	Url string `json:"url"`
}
