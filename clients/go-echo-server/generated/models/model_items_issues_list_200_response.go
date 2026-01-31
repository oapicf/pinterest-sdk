package models

type ItemsIssuesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsItemValidationIssues `json:"items"`
}
