package models

// ProductCategoriesDemographic - Age and gender distribution who engaged with this product category in the past 3 months
type ProductCategoriesDemographic struct {

	// Age demographic distribution
	Age map[string]float32 `json:"age"`

	Gender GenderDemographics `json:"gender"`
}
