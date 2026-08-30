package models

type AssetGroupDeletion struct {

	DeletedAssetGroups []string `json:"deleted_asset_groups,omitempty"`

	Exceptions *[]AssetGroupDeleteError `json:"exceptions,omitempty"`
}
