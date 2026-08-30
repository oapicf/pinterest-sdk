package models

type AdAccountsCountry struct {

	Code Country `json:"code"`

	// Country currency.
	Currency string `json:"currency"`

	// Country index
	Index float32 `json:"index"`

	// Country name
	Name string `json:"name"`
}
