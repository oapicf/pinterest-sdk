package models

type LeadsExportCreateRequest struct {

	// Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
	EndDate string `json:"end_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// ID for the ad collecting leads
	AdId string `json:"ad_id" validate:"regexp=^\\\\d+$"`
}
