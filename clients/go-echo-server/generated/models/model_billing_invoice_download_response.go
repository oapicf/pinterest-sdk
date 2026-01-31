package models

type BillingInvoiceDownloadResponse struct {

	// The download url for the billing invoice
	DownloadUrl string `json:"download_url,omitempty"`

	// The billing invoice id
	Id string `json:"id,omitempty"`
}
