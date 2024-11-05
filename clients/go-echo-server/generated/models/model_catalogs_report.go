package models

type CatalogsReport struct {

	ReportStatus string `json:"report_status,omitempty"`

	// URL to download the report
	Url *string `json:"url,omitempty"`

	// Size of the report in bytes
	Size *float32 `json:"size,omitempty"`
}
