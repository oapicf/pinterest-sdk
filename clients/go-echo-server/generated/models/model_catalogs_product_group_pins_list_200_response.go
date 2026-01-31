package models

type CatalogsProductGroupPinsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// Pins
	Items []CatalogsProduct `json:"items"`
}
