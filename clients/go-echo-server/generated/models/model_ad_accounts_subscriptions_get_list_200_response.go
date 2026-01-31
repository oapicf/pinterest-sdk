package models

type AdAccountsSubscriptionsGetList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []LeadSubscription `json:"items"`
}
