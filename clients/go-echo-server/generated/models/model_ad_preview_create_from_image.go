package models

type AdPreviewCreateFromImage struct {

	// Image URL.
	ImageUrl string `json:"image_url"`

	// Title displayed below ad.
	Title string `json:"title"`
}
