package models

type BillingInvoicesGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []BillingInvoiceResponse `json:"items"`
}
