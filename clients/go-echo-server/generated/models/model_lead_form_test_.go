package models

// LeadFormTest - Lead form test action: submit sample answers and receive the resulting subscription id.
type LeadFormTest struct {

	// Subscription ID.
	SubscriptionId string `json:"subscription_id,omitempty" validate:"regexp=^\\d+$"`
}
