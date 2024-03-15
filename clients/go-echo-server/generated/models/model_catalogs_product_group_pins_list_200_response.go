package models

type CatalogsProductGroupPinsList200Response struct {

	// Pins
	Items []CatalogsProduct `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
