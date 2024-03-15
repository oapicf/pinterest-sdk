package models

type CatalogsProductGroupsList200Response struct {

	Items []CatalogsProductGroupsList200ResponseAllOfItemsInner `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
