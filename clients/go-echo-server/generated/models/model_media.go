package models

type Media struct {

	// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	MediaId string `json:"media_id" validate:"regexp=^\\\\d+$"`

	MediaType MediaUploadType `json:"media_type"`

	Status MediaUploadStatus `json:"status,omitempty"`
}
