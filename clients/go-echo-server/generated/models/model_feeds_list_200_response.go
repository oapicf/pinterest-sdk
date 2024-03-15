package models

type FeedsList200Response struct {

	Items []CatalogsFeed `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
