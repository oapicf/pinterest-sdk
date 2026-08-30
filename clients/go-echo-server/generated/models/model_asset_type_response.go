package models
// AssetTypeResponse : Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
type AssetTypeResponse string

// List of AssetTypeResponse
const (
	AD_ACCOUNT AssetTypeResponse = "AD_ACCOUNT"
	MERCHANT AssetTypeResponse = "MERCHANT"
	PROFILE AssetTypeResponse = "PROFILE"
	ASSET_GROUP AssetTypeResponse = "ASSET_GROUP"
	PINNER_LIST AssetTypeResponse = "PINNER_LIST"
	CONVERSION_TAG AssetTypeResponse = "CONVERSION_TAG"
	CATALOG AssetTypeResponse = "CATALOG"
	CONVERSION_SEGMENT AssetTypeResponse = "CONVERSION_SEGMENT"
)
