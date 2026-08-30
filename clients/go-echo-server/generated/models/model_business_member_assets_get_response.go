package models

// BusinessMemberAssetsGetResponse - Paginated response for business member assets with total count metadata.
type BusinessMemberAssetsGetResponse struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AssetIdPermissions `json:"items"`

	// Total number of assets matching the query
	TotalDataCount int32 `json:"total_data_count"`

	// Breakdown of asset counts by entity status (ad accounts only)
	TotalDataCountByStatus TotalCountByEntityStatus `json:"total_data_count_by_status,omitempty"`
}
