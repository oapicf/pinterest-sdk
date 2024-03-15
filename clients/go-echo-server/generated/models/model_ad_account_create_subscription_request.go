package models

type AdAccountCreateSubscriptionRequest struct {

	// Standard HTTPS webhook URL.
	WebhookUrl string `json:"webhook_url"`

	// Lead form ID.
	LeadFormId string `json:"lead_form_id,omitempty"`

	// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerAccessToken string `json:"partner_access_token,omitempty"`

	// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerRefreshToken string `json:"partner_refresh_token,omitempty"`
}
