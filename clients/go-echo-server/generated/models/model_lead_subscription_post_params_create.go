package models

type LeadSubscriptionPostParamsCreate struct {

	// Lead form ID.
	LeadFormId string `json:"lead_form_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Standard HTTPS webhook URL.
	WebhookUrl string `json:"webhook_url"`

	// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerAccessToken string `json:"partner_access_token,omitempty"`

	PartnerMetadata LeadSubscriptionPostParamsCreateAllOfPartnerMetadata `json:"partner_metadata,omitempty"`

	// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerRefreshToken string `json:"partner_refresh_token,omitempty"`
}
