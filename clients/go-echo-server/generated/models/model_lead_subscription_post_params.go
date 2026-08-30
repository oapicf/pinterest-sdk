package models

type LeadSubscriptionPostParams struct {

	// The Ad Account ID that this lead form belongs to.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\d+$"`

	// API version.
	ApiVersion string `json:"api_version,omitempty"`

	// Subscription creation time. Unix timestamp in milliseconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// Lead data encryption algorithm.
	CryptographicAlgorithm *string `json:"cryptographic_algorithm,omitempty"`

	// Base64 encoded key for client to decrypt lead data.
	CryptographicKey *string `json:"cryptographic_key,omitempty"`

	// Subscription ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Lead form ID.
	LeadFormId *string `json:"lead_form_id,omitempty" validate:"regexp=^\\d+$"`

	// User account used to subscribe lead data.
	UserAccountId string `json:"user_account_id,omitempty" validate:"regexp=^\\d+$"`

	// Standard HTTPS webhook URL.
	WebhookUrl string `json:"webhook_url,omitempty"`

	// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerAccessToken string `json:"partner_access_token,omitempty"`

	// Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
	PartnerMetadata PartnerMetadata `json:"partner_metadata,omitempty"`

	// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	PartnerRefreshToken string `json:"partner_refresh_token,omitempty"`
}
