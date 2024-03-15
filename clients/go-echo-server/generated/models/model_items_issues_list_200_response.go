package models

type ItemsIssuesList200Response struct {

	Items []CatalogsItemValidationIssues `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
