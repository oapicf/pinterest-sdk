package models

type AssetGroupUpdateError struct {

	AssetGroupId string `json:"asset_group_id,omitempty"`

	Code int32 `json:"code,omitempty"`

	Message string `json:"message,omitempty"`
}
