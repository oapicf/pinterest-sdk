package models

type LeadSubscriptionCreate struct {

	// Lead form ID.
	LeadFormId string `json:"lead_form_id,omitempty" validate:"regexp=^\\d+$"`

	// Standard HTTPS webhook URL.
	WebhookUrl string `json:"webhook_url"`
}
