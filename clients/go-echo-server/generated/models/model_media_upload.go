package models

// MediaUpload - Media upload that has been registered but not uploaded/processed yet.
type MediaUpload struct {

	// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	MediaId string `json:"media_id" validate:"regexp=^\\d+$"`

	MediaType MediaUploadType `json:"media_type"`

	// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
	UploadParameters MediaUploadParameters `json:"upload_parameters,omitempty"`

	// The URL where you will POST your media file.
	UploadUrl string `json:"upload_url,omitempty"`
}
