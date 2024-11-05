package models

// CreateAssetAccessRequestBody - An object containing a list of all the asset access requests
type CreateAssetAccessRequestBody struct {

	AssetRequests []CreateAssetAccessRequestBodyAssetRequestsInner `json:"asset_requests"`
}
