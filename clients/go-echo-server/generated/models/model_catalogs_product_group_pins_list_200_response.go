package models

type CatalogsProductGroupPinsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsProduct `json:"items"`
}
