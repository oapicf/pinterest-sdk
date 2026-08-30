package models

type CatalogsProductGroupMultiplePinterestProductCategoryCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values []ProductCategoryEnum `json:"values"`
}
