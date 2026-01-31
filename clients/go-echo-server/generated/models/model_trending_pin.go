package models

// TrendingPin - Pin image data for trending topics
type TrendingPin struct {

	// Height of the pin image in pixels
	Height int32 `json:"height"`

	// Unique identifier for the pin
	Id string `json:"id"`

	// URL of the pin image
	Src string `json:"src"`

	// Width of the pin image in pixels
	Width int32 `json:"width"`
}
