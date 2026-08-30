package models

type CatalogsItemValidationDetails struct {

	// Attribute that has a validation issue.
	AttributeName *NullableCatalogsItemFieldType `json:"attribute_name"`

	// Provided value that caused the validation issue.
	ProvidedValue *string `json:"provided_value"`
}
