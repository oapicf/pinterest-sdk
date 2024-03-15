package models

type AdAccountsCountryResponseData struct {

	Code AdCountry `json:"code,omitempty"`

	// Country currency.
	Currency string `json:"currency,omitempty"`

	// Country index
	Index float32 `json:"index,omitempty"`

	// Country name
	Name string `json:"name,omitempty"`
}
