package models

type LeadsExportCreateResponse struct {

	// ID for the leads export job
	LeadsExportId string `json:"leads_export_id,omitempty" validate:"regexp=^\\\\d+$"`
}
