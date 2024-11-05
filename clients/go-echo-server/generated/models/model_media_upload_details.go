package models

// MediaUploadDetails - Media upload details
type MediaUploadDetails struct {

	MediaId string `json:"media_id,omitempty" validate:"regexp=^\\\\d+$"`

	MediaType MediaUploadType `json:"media_type,omitempty"`

	Status MediaUploadStatus `json:"status,omitempty"`
}
