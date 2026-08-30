package models

type AssetGroupDeletionDelete struct {

	AssetGroupsToDelete []string `json:"asset_groups_to_delete"`
}
