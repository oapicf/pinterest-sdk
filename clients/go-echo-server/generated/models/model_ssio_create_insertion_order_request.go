package models

type SsioCreateInsertionOrderRequest struct {

	// Starting date of time period. Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// End date of time period. Format: YYYY-MM-DD
	EndDate string `json:"end_date,omitempty" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// The po number
	PoNumber string `json:"po_number"`

	// If Budget order line, the budget amount.
	BudgetAmount float32 `json:"budget_amount,omitempty"`

	// The billing contact first name
	BillingContactFirstname string `json:"billing_contact_firstname"`

	// The billing contact last name
	BillingContactLastname string `json:"billing_contact_lastname"`

	// The billing contact email
	BillingContactEmail string `json:"billing_contact_email"`

	// The media contact first name
	MediaContactFirstname string `json:"media_contact_firstname"`

	// The media contact last name
	MediaContactLastname string `json:"media_contact_lastname"`

	// The media contact email
	MediaContactEmail string `json:"media_contact_email"`

	// URL link for agency
	AgencyLink string `json:"agency_link,omitempty"`

	// The email of user submitting the insertion order
	UserEmail string `json:"user_email,omitempty"`

	// The UTC timestamp (to the nearest sec) of when terms were accepted
	AcceptedTermsTime int32 `json:"accepted_terms_time,omitempty"`

	// The pmp id
	PmpId string `json:"pmp_id"`

	// The order name
	OrderName string `json:"order_name"`

	// Type can be Budget or Perpetual
	OrderLineType string `json:"order_line_type"`

	// The SFDC id for the terms
	AcceptedTermsId string `json:"accepted_terms_id"`

	// The bill-to company id
	BilltoCompanyId string `json:"billto_company_id"`

	// The bill-to business address id
	BilltoBusinessAddressId string `json:"billto_business_address_id"`

	// The bill-to billing address id
	BilltoBillingAddressId string `json:"billto_billing_address_id"`

	// If Ongoing (perpetual) order line, the estimated monthly spend
	EstimatedMonthlySpend float32 `json:"estimated_monthly_spend,omitempty"`

	CurrencyInfo Currency `json:"currency_info"`
}
