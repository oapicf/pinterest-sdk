package models

type TargetingSpecOperationShoppingRetargeting struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values *[]TargetingSpecShoppingRetargeting `json:"values"`
}
