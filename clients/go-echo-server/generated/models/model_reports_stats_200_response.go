package models

type ReportsStats200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []CatalogsReportStats `json:"items"`
}
