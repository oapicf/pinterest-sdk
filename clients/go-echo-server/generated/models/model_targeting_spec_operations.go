package models

type TargetingSpecOperations struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values []TargetingSpecShoppingRetargeting `json:"values"`

	Value *string `json:"value"`
}
