package models

type AssetGroupModification struct {

	// A list of errors associated with the asset groups. Will be returned if there is an error.
	Exceptions []AssetGroupUpdateError `json:"exceptions,omitempty"`

	// A list of successfully edited asset groups.
	UpdatedAssetGroups []AssetGroupBinding `json:"updated_asset_groups,omitempty"`
}
