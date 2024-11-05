package models

import (
	"gopkg.in/validator.v2"
)

type AdPreviewRequest struct {

	// Image URL.
	ImageUrl string `json:"image_url"`

	// Title displayed below ad.
	Title string `json:"title"`

	// Pin ID.
	PinId string `json:"pin_id"`
}
