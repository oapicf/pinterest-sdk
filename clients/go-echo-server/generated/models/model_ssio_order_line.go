package models

type SsioOrderLine struct {

	// OrderLineId in SFDC
	SalesforceOrderLineId *string `json:"salesforce_order_line_id,omitempty"`

	// Ads manager OrderLineId
	AdsManagerOrderLineId *string `json:"ads_manager_order_line_id,omitempty"`

	// The pin order id associated with the order line in SFDC
	PinOrderId *string `json:"pin_order_id,omitempty"`

	// Last modified date.
	LastModifiedDateTime *string `json:"last_modified_date_time,omitempty"`

	// Start date of the order line.
	StartDate *string `json:"start_date,omitempty"`

	// End date of the order line.
	EndDate *string `json:"end_date,omitempty"`

	// Bill To Company name
	BillToCompanyName *string `json:"bill_to_company_name,omitempty"`

	// Billing contact first name
	BillingContactFirstname *string `json:"billing_contact_firstname,omitempty"`

	// Billing contact last name
	BillingContactLastname *string `json:"billing_contact_lastname,omitempty"`

	// Billing contact email
	BillingContactEmail *string `json:"billing_contact_email,omitempty"`

	// Billing media email
	MediaContactEmail *string `json:"media_contact_email,omitempty"`

	// Billing contact first name
	MediaContactFirstname *string `json:"media_contact_firstname,omitempty"`

	// Billing contact first name
	MediaContactLastname *string `json:"media_contact_lastname,omitempty"`

	CurrencyInfo Currency `json:"currency_info,omitempty"`

	// Agency link
	AgencyLink *string `json:"agency_link,omitempty"`

	// The po number
	PoNumber *string `json:"po_number,omitempty"`

	// The order name
	OrderName *string `json:"order_name,omitempty"`

	// The Pinterest marketing partner name
	PmpName *string `json:"pmp_name,omitempty"`

	// The SFDC id for the terms
	AcceptedTermsId *string `json:"accepted_terms_id,omitempty"`

	// The UTC timestamp (to the nearest sec) of when terms were accepted
	AcceptedTermsTime *string `json:"accepted_terms_time,omitempty"`

	// If Budget order line, the budget amount.
	BudgetAmount *float32 `json:"budget_amount,omitempty"`

	// If Ongoing (perpetual) order line, the estimated monthly spend
	EstimatedMonthlySpend *float32 `json:"estimated_monthly_spend,omitempty"`
}
