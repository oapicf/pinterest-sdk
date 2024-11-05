package models

type CatalogsProductGroupsList200Response struct {

	Items []CatalogsVerticalProductGroup `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
