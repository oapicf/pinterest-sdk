package models

// TrendingPin - Pin image data for trending topics
type TrendingPin struct {

	// Dominant color of the pin image in hex format
	Color string `json:"color"`

	// Height of the pin image in pixels
	Height int32 `json:"height"`

	// Unique identifier for the pin
	Id string `json:"id"`

	// URL of the pin image
	Src string `json:"src"`

	// The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
	VerticalOffset float64 `json:"vertical_offset,omitempty"`

	// Width of the pin image in pixels
	Width int32 `json:"width"`
}
