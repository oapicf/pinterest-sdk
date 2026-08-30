package models

type DynamicTitlesDownloadCsv struct {

	// Pre-signed S3 URL to download the CSV file.
	DownloadUrl string `json:"download_url,omitempty"`
}
