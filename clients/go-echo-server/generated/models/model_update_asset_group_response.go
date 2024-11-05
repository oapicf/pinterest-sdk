package models

type UpdateAssetGroupResponse struct {

	// A list of successfully edited asset groups.
	UpdatedAssetGroups []AssetGroupBinding `json:"updated_asset_groups,omitempty"`

	// A list of errors associated with the asset groups. Will be returned if there is an error.
	Exceptions *[]UpdateAssetGroupResponseExceptionsInner `json:"exceptions,omitempty"`
}
