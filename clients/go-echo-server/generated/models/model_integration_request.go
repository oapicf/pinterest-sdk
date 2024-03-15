package models

// IntegrationRequest - Schema used for creating the integration metadata.
type IntegrationRequest struct {

	// External business ID for the integration.
	ExternalBusinessId *string `json:"external_business_id,omitempty"`

	ConnectedMerchantId string `json:"connected_merchant_id,omitempty"`

	ConnectedAdvertiserId string `json:"connected_advertiser_id,omitempty"`

	ConnectedLbaId string `json:"connected_lba_id,omitempty"`

	ConnectedTagId string `json:"connected_tag_id,omitempty"`

	PartnerAccessToken string `json:"partner_access_token,omitempty"`

	PartnerRefreshToken string `json:"partner_refresh_token,omitempty"`

	PartnerPrimaryEmail string `json:"partner_primary_email,omitempty"`

	PartnerAccessTokenExpiry int32 `json:"partner_access_token_expiry,omitempty"`

	PartnerRefreshTokenExpiry int32 `json:"partner_refresh_token_expiry,omitempty"`

	Scopes string `json:"scopes,omitempty"`

	AdditionalId1 string `json:"additional_id_1,omitempty"`

	PartnerMetadata string `json:"partner_metadata,omitempty"`
}
