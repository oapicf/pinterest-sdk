package models

type UpdateAssetGroupResponseExceptionsInner struct {

	// Error code associated with the error editing asset group.
	Code int32 `json:"code,omitempty"`

	// Error message associated with the error editing asset group.
	Message string `json:"message,omitempty"`

	// Asset group id of the exception.
	AssetGroupId string `json:"asset_group_id,omitempty"`
}
