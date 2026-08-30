package models

// CreateAssetAccessRequestBody - An object containing a list of all the asset access requests
type CreateAssetAccessRequestBody struct {

	AssetRequests []CreateAssetAccessRequestItem `json:"asset_requests"`
}
