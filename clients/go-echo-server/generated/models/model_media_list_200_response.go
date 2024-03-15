package models

type MediaList200Response struct {

	// Media
	Items []MediaUploadDetails `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
