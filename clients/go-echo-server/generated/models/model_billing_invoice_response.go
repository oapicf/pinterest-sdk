package models

type BillingInvoiceResponse struct {

	// The ID of the ad account this invoice belongs to
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The name of the ad account this invoice belongs to
	AdAccountName string `json:"ad_account_name,omitempty"`

	// The amount billed in this invoice. Denoted in micro currency
	AmountBilledMicroCurrency int32 `json:"amount_billed_micro_currency,omitempty"`

	// The discount in this invoice. Denoted in micro currency
	AmountDiscountMicroCurrency *int32 `json:"amount_discount_micro_currency,omitempty"`

	// The net amount in this invoice. Denoted in micro currency
	AmountNetMicroCurrency *int32 `json:"amount_net_micro_currency,omitempty"`

	// The tax in this invoice. Denoted in micro currency
	AmountTaxMicroCurrency *int32 `json:"amount_tax_micro_currency,omitempty"`

	// The country of the bill to address
	BillToCountry string `json:"bill_to_country,omitempty"`

	// The end date of the billing period. Format: YYYY-MM-DD
	BillingPeriodEndDate string `json:"billing_period_end_date,omitempty" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// The start date of the billing period. Format: YYYY-MM-DD
	BillingPeriodStartDate string `json:"billing_period_start_date,omitempty" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	Currency Currency `json:"currency,omitempty"`

	// The type of the document
	DocumentType string `json:"document_type,omitempty"`

	// Unique identifier for the billing invoice
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// The date the invoice is due. Format: YYYY-MM-DD
	InvoiceDueDate string `json:"invoice_due_date,omitempty" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// The payment terms of the invoice
	PaymentTerms string `json:"payment_terms,omitempty"`

	// The status of the invoice
	Status string `json:"status,omitempty"`
}
