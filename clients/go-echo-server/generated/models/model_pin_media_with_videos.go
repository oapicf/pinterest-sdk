package models

// PinMediaWithVideos - Pin with multiple videos.
type PinMediaWithVideos struct {

	Items []VideoMetadata `json:"items,omitempty"`
}
