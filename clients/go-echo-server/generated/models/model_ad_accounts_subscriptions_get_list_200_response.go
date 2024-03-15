package models

type AdAccountsSubscriptionsGetList200Response struct {

	Items []AdAccountGetSubscriptionResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
