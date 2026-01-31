package models

type CatalogsProductGroupUint32Criteria struct {

	Negated bool `json:"negated,omitempty"`

	Operator string `json:"operator"`

	Value int32 `json:"value"`
}
