package models

// IntegrationMetadataUpdate - Resource create or update operation model.
type IntegrationMetadataUpdate struct {

	AdditionalId1 string `json:"additional_id_1,omitempty"`

	ConnectedAdvertiserId string `json:"connected_advertiser_id,omitempty"`

	ConnectedLbaId string `json:"connected_lba_id,omitempty"`

	ConnectedMerchantId string `json:"connected_merchant_id,omitempty"`

	ConnectedTagId string `json:"connected_tag_id,omitempty"`

	PartnerAccessToken string `json:"partner_access_token,omitempty"`

	PartnerAccessTokenExpiry float32 `json:"partner_access_token_expiry,omitempty"`

	PartnerMetadata string `json:"partner_metadata,omitempty"`

	PartnerPrimaryEmail string `json:"partner_primary_email,omitempty"`

	PartnerRefreshToken string `json:"partner_refresh_token,omitempty"`

	PartnerRefreshTokenExpiry float32 `json:"partner_refresh_token_expiry,omitempty"`

	Scopes string `json:"scopes,omitempty"`
}
