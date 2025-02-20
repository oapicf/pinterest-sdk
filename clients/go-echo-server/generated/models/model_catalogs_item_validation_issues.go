package models

type CatalogsItemValidationIssues struct {

	// Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	ItemNumber int32 `json:"item_number"`

	// The merchant-created unique ID that represents the product.
	ItemId *string `json:"item_id"`

	Errors CatalogsItemValidationErrors `json:"errors"`

	Warnings CatalogsItemValidationWarnings `json:"warnings"`
}
