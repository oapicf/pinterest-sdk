package models

type CreateAssetGroupBody struct {

	// Asset Group name
	AssetGroupName string `json:"asset_group_name"`

	// Asset group description
	AssetGroupDescription string `json:"asset_group_description"`

	// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	AssetGroupTypes []AssetGroupType `json:"asset_group_types"`
}
