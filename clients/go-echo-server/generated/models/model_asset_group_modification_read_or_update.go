package models

type AssetGroupModificationReadOrUpdate struct {

	// A list of asset groups and the data that will be used to update them.
	AssetGroupsToUpdate []AssetGroupUpdateItemReadOrUpdateItem `json:"asset_groups_to_update,omitempty"`

	// A list of errors associated with the asset groups. Will be returned if there is an error.
	Exceptions []AssetGroupUpdateError `json:"exceptions,omitempty"`

	// A list of successfully edited asset groups.
	UpdatedAssetGroups []AssetGroupBinding `json:"updated_asset_groups,omitempty"`
}
