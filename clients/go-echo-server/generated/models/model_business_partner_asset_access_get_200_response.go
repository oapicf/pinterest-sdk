package models

type BusinessPartnerAssetAccessGet200Response struct {

	// List assets on which you granted access to your partner or assets on which your partner has granted you access.
	Items []GetPartnerAssetsResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
