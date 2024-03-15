package models

type CatalogsItemValidationDetails struct {

	AttributeName *NullableCatalogsItemFieldType `json:"attribute_name"`

	// Provided value that caused the validation issue.
	ProvidedValue *string `json:"provided_value"`
}
