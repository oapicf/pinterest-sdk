package models

type CatalogsLocalStoresCreate200ResponseInnerDataOneOf struct {

	// The ID of the local store.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	Exceptions PinterestLibError `json:"exceptions"`
}
