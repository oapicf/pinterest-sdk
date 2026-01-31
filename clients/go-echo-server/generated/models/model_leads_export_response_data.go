package models

type LeadsExportResponseData struct {

	DownloadUrl *string `json:"download_url,omitempty"`

	ExportStatus LeadsExportStatus `json:"export_status,omitempty"`
}
