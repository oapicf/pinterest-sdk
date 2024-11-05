package models

type UpdateAssetGroupBody struct {

	// A list of asset groups and the data that will be used to update them.
	AssetGroupsToUpdate []UpdateAssetGroupBodyAssetGroupsToUpdateInner `json:"asset_groups_to_update,omitempty"`
}
