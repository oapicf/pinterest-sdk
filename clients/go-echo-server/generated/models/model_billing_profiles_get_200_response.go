package models

type BillingProfilesGet200Response struct {

	Items []BillingProfilesResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
