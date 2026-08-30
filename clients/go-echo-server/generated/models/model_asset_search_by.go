package models
// AssetSearchBy : The field to search member assets by
type AssetSearchBy string

// List of AssetSearchBy
const (
	NAME AssetSearchBy = "NAME"
	ID AssetSearchBy = "ID"
	NAME_OR_ID AssetSearchBy = "NAME_OR_ID"
	OWNER_NAME AssetSearchBy = "OWNER_NAME"
	NAME_OR_OWNER AssetSearchBy = "NAME_OR_OWNER"
)
