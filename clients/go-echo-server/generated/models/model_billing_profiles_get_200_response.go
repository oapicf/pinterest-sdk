package models

type BillingProfilesGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []BillingProfilesResponse `json:"items"`
}
