package models

type AssetGroupBinding struct {

	// A list of ad account IDs under the asset group
	AdAccountsIds []string `json:"ad_accounts_ids"`

	// Asset group description
	AssetGroupDescription *string `json:"asset_group_description"`

	// Asset Group name
	AssetGroupName *string `json:"asset_group_name"`

	// Asset group types
	AssetGroupTypes []string `json:"asset_group_types"`

	// A list of catalog IDs under asset group
	CatalogsIds []string `json:"catalogs_ids"`

	// The data of the user that created the asset group.
	CreatedBy BusinessAccessUserSummary `json:"created_by"`

	// The creation time of the asset group
	CreatedTime *int32 `json:"created_time"`

	// Asset Group ID.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// The data of the business that owns the asset group.
	Owner BusinessAccessUserSummary `json:"owner"`

	// A list of profile IDs under asset group
	ProfilesIds []string `json:"profiles_ids"`

	// The last update time of the asset group
	UpdatedTime *int32 `json:"updated_time"`
}
