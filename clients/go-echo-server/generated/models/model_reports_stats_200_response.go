package models

type ReportsStats200Response struct {

	Items []CatalogsReportStats `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
