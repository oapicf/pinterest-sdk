package models

type LeadsExportResponseData struct {

	ExportStatus LeadsExportStatus `json:"export_status,omitempty"`

	DownloadUrl *string `json:"download_url,omitempty"`
}
