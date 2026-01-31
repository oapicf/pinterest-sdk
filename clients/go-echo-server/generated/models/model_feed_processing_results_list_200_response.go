package models

type FeedProcessingResultsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsFeedProcessingResult `json:"items"`
}
