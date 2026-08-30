package models
// AssetPermissionType : Permission aggregation type for asset access
type AssetPermissionType string

// List of AssetPermissionType
const (
	AGGREGATED_PERMISSION AssetPermissionType = "AGGREGATED_PERMISSION"
	DIRECT_PERMISSION AssetPermissionType = "DIRECT_PERMISSION"
)
