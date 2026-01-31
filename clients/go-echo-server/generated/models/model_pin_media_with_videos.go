package models

// PinMediaWithVideos - Pin with multiple videos.
type PinMediaWithVideos struct {

	Items []VideoMetadataWithItemType `json:"items,omitempty"`

	MediaType string `json:"media_type"`
}
