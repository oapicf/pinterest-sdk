package models

type SsioAccountResponse struct {

	// Advertiser eligible to create order lines
	Eligible bool `json:"eligible,omitempty"`

	// Advertiser eligible to update order lines
	CanEdit bool `json:"can_edit,omitempty"`

	// An array of Salesforce account information that includes address, io terms, etc.
	BilltoInfos []SsioAccountItem `json:"billto_infos,omitempty"`

	Currency string `json:"currency,omitempty"`

	PmpNames []SsioAccountPmpName `json:"pmp_names,omitempty"`

	// Error indicator from Salesforce which could be \"No Error\"
	Error string `json:"error,omitempty"`
}
