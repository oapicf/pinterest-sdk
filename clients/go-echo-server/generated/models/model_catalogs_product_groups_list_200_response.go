package models

type CatalogsProductGroupsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsVerticalProductGroup `json:"items"`
}
