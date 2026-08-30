package models

type CustomerSegmentList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CustomerSegment `json:"items"`
}
