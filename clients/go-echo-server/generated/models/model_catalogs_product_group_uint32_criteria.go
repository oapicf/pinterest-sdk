package models

type CatalogsProductGroupUint32Criteria struct {

	Negated bool `json:"negated,omitempty"`

	Operator NumericFilterOperatorType `json:"operator"`

	Value int32 `json:"value"`
}
