package models

type FeedsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsFeed `json:"items"`
}
