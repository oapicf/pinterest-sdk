package models

type CatalogsLocalStoresList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []LocalStore `json:"items"`
}
