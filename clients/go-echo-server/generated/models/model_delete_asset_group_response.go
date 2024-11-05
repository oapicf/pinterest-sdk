package models

type DeleteAssetGroupResponse struct {

	// A list of ids of successfully deleted asset groups.
	DeletedAssetGroups []string `json:"deleted_asset_groups,omitempty"`

	// A list of errors associated with the asset groups. Will be returned if there is an error.
	Exceptions *[]DeleteAssetGroupResponseExceptionsInner `json:"exceptions,omitempty"`
}
