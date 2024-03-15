package models

type AdAccountsList200Response struct {

	// Ad accounts
	Items []AdAccount `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
