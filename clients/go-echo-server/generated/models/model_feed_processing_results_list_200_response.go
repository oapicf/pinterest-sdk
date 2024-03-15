package models

type FeedProcessingResultsList200Response struct {

	Items []CatalogsFeedProcessingResult `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
